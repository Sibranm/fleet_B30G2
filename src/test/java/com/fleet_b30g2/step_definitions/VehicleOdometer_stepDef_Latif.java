package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.VehiclesOdometerPage_Latif;
import com.fleet_b30g2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehicleOdometer_stepDef_Latif {

    VehiclesOdometerPage_Latif vehiclesOdometer = new VehiclesOdometerPage_Latif();

    //first steps

    @When("the user click on the vehicle odometer page")
    public void the_user_click_on_the_vehicle_odometer_page() {
        BrowserUtils.sleep(5);
        BrowserUtils.hover(vehiclesOdometer.viewFleet);
        vehiclesOdometer.clickVehicleOdometer.click();
    }

    @Then("the user should see error message")
    public void the_user_should_see_error_message() {
        String expectedError = "You do not have permission to perform this action.";
        String actualError = vehiclesOdometer.errorMessage.getText();
        Assert.assertEquals(expectedError,actualError);
    }

    //second steps

    @When("Driver click on the vehicle odometer page")
    public void driverClickOnTheVehicleOdometerPage() {
        BrowserUtils.sleep(5);
        BrowserUtils.hover(vehiclesOdometer.viewFleet);
        vehiclesOdometer.clickVehicleOdometer.click();
    }

    @Then("Diver should see the default page as {int}")
    public void diverShouldSeeTheDefaultPageAs(int arg0) {
        BrowserUtils.sleep(5);
        String expectedDefaultPage = "1";
        String actualDefaultPage = vehiclesOdometer.startNumberPage.getAttribute("value");
        Assert.assertEquals(expectedDefaultPage,actualDefaultPage);
    }

    // third steps

    @Then("Divers should see the View Per Page is {int} by default.")
    public void diversShouldSeeTheViewPerPageIsByDefault(int arg0) {
        BrowserUtils.sleep(5);
        String expectedViewPage = "25";
        String actualViewPage = vehiclesOdometer.endNumberPage.getText();
        Assert.assertEquals(expectedViewPage,actualViewPage);
    }



}
