package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.CalenderEventsPage;
import com.fleet_b30g2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US09_StepDefs {

    CalenderEventsPage calenderEventsPage = new CalenderEventsPage();

    @Then("The user clicks on Create Events")
    public void the_user_clicks_on_create_events() {

        calenderEventsPage.waitUntilLoaderScreenDisappear();

        BrowserUtils.waitForTitleContains("Dashboard");
        for (WebElement eachOption : calenderEventsPage.menuOptions) {
            if (eachOption.getText().equals("Activities")) {
                BrowserUtils.hover(eachOption);
                break;
            }
        }

        calenderEventsPage.calenderEvents.click();

    }

    @Then("The user clicks on Create Calender Events")
    public void the_user_clicks_on_create_calender_events() {

        calenderEventsPage.waitUntilLoaderScreenDisappear();
        calenderEventsPage.createCalenderEventBtn.click();

    }

    @Then("The user clicks on Repeat checkbox")
    public void the_user_clicks_on_repeat_checkbox() {

        calenderEventsPage.waitUntilLoaderScreenDisappear();
        calenderEventsPage.repeatCheckbox.click();

    }

    @Then("The user enters a number less than one into the day input box")
    public void the_user_enters_a_number_less_than_one_into_the_day_input_box() {

        calenderEventsPage.waitUntilLoaderScreenDisappear();
        calenderEventsPage.repeatDayInputBox.clear();
        calenderEventsPage.repeatDayInputBox.sendKeys("-1");

    }

    @Then("The user enters a number more than ninety-nine into the day input box")
    public void the_user_enters_a_number_more_than_ninety_nine_into_the_day_input_box() {

        calenderEventsPage.waitUntilLoaderScreenDisappear();
        calenderEventsPage.repeatDayInputBox.clear();
        calenderEventsPage.repeatDayInputBox.sendKeys("111");
    }


    @Then("The user should see error message {string}")
    public void the_user_should_see_error_message(String expectedErrorMsg) {

        calenderEventsPage.waitUntilLoaderScreenDisappear();
        String actualErrorMsg = calenderEventsPage.errorMsg.getText();

        Assert.assertEquals(actualErrorMsg,expectedErrorMsg);

    }


}
