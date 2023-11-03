package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.VehiclesIconsPageRina;
import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class US06_StepDefs {

    VehiclesIconsPageRina vehicleIconsRina = new VehiclesIconsPageRina();




    @When("user launch on the Vehicle page")
    public void user_launch_on_the_vehicle_page() {
        vehicleIconsRina.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(vehicleIconsRina.fleet);
        vehicleIconsRina.vehicles.click();

    }


    @And("user hover the mouse to the dropdown")
    public void userHoverTheMouseToTheDropdown() {

        BrowserUtils.sleep(4);
       // vehicleIconsRina.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(vehicleIconsRina.dropdown);
    }


    @Then("user should see icons as expected: View")
    public void user_should_see_icons_as_expected_view() {

        vehicleIconsRina.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(vehicleIconsRina.viewIcon.isDisplayed());

    }
    @Then("user should see icons as expected: Edit")
    public void user_should_see_icons_as_expected_edit() {

        vehicleIconsRina.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(vehicleIconsRina.editIcon.isDisplayed());

    }
    @Then("user should see icons as expected: Delete")
    public void user_should_see_icons_as_expected_delete() {

        vehicleIconsRina.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(vehicleIconsRina.deleteIcon.isDisplayed());

    }



}
