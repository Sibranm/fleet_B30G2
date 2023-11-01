package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.BasePage;
import com.fleet_b30g2.pages.LoginPage;
import com.fleet_b30g2.pages.VehicleContractsPage;
import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections.FactoryUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US04_StepDefs {

    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

    @When("Store manager click the Fleet button")
    public void storeManagerClickTheFleetButton() {
        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(vehicleContractsPage.fleetDropdown);
    }

    @When("Store manager click the Vehicle Contract button")
    public void store_manager_click_the_vehicle_contract_button() {
        BrowserUtils.sleep(2);
        vehicleContractsPage.vehicleContracts.click();

    }
    @Then("Store manager see title is as expected")
    public void store_manager_see_title_is_as_expected() {
        BrowserUtils.sleep(2);
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";//bug
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("Sales manager the Fleet button")
    public void salesManagerTheFleetButton() {
        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(vehicleContractsPage.fleetDropdown);
    }


    @When("Sales manager click the Vehicle Contract button")
    public void sales_manager_click_the_vehicle_contract_button() {
        BrowserUtils.sleep(2);
        vehicleContractsPage.vehicleContracts.click();

    }
    @Then("Sales manager see title is as expected")
    public void sales_manager_see_title_is_as_expected() {
        BrowserUtils.sleep(2);
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System"; //bug
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("Driver click the Fleet button")
    public void driverClickTheFleetButton() {
        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.hover(vehicleContractsPage.fleetDropdown);
    }

    @When("Driver click the Vehicle Contract button")
    public void driver_click_the_vehicle_contract_button() {
        BrowserUtils.sleep(2);
        vehicleContractsPage.driverFleet.click();

    }
    @Then("App should display no permission message")
    public void app_should_display_no_permission_message() {
        BrowserUtils.verifyElementDisplayed(vehicleContractsPage.permissionMessage);

    }







}