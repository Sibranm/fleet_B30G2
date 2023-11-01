package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.VehiclesModelPageSibran;
import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US05_StepDefs {

    VehiclesModelPageSibran vehiclesModelPageSibran = new VehiclesModelPageSibran();

    @When("User clicks on Vehicles Model option")
    public void userClicksOnVehiclesModelOption() {

        vehiclesModelPageSibran.waitUntilLoaderScreenDisappear();

        for (WebElement eachOption : vehiclesModelPageSibran.menuOptions) {
            if (eachOption.getText().equals("Fleet")) {
                BrowserUtils.hover(eachOption);
                break;
            }
        }

        vehiclesModelPageSibran.vehiclesModelOption.click();

    }


    @Then("User sees ten columns on Fleet Vehicles Model page")
    public void user_sees_ten_columns_on_fleet_vehicles_model_page(List<String> expectedColumnNames) {

        BrowserUtils.waitForTitleContains("Vehicles Model");

        List<String> actualColumnNames = new ArrayList<>();
        List<WebElement> actualColumns = vehiclesModelPageSibran.columns;

        for (WebElement each : actualColumns) {
            actualColumnNames.add(each.getText());
        }

        Assert.assertEquals(expectedColumnNames,actualColumnNames);
    }

    @Then("User sees “You do not have permission to perform this action.”")
    public void userSeesYouDoNotHavePermissionToPerformThisAction() {

        vehiclesModelPageSibran.waitUntilLoaderScreenDisappear();

        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = vehiclesModelPageSibran.noPermissionMessage.getText();

        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
