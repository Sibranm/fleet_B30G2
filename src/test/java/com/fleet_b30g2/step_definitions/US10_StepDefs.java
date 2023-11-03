package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.CalenderEventsPage;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US10_StepDefs {

    CalenderEventsPage calenderEventsPage = new CalenderEventsPage();


    @Then("The user types into the Description box {string}")
    public void the_user_types_into_the_description_box(String expectedText) {

        calenderEventsPage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().switchTo().frame(calenderEventsPage.iFrame);

        calenderEventsPage.descriptionBox.sendKeys(expectedText);
        calenderEventsPage.waitUntilLoaderScreenDisappear();

    }

    @Then("The text is displayed in the Description box {string}")
    public void the_text_is_displayed_in_the_description_box(String expectedText) {

        String actualText = calenderEventsPage.descriptionBox.getText();

        Assert.assertEquals(actualText, expectedText);

    }

}
