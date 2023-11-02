package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.VehiclesOpened_Latif;
import com.fleet_b30g2.pages.VehiclesPage_Latif;
import com.fleet_b30g2.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Vehicle_Step_Fleet_Latif{


    VehiclesPage_Latif vehiclesPageLatif = new VehiclesPage_Latif();

    //step first
    @When("the user launches on the Vehicle page")
    public void the_user_launches_on_the_vehicle_page() {
        BrowserUtils.sleep(5);
        BrowserUtils.hover(vehiclesPageLatif.viewFleet);

        vehiclesPageLatif.clickVehicle.click();
    }


    VehiclesOpened_Latif vehiclesOpenedLatif = new VehiclesOpened_Latif();

    //step second
    @Then("the user should see all the checkBox are unchecked")
    public void the_user_should_see_all_the_check_box_are_unchecked() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(!(vehiclesOpenedLatif.clickCheckBox.isSelected()));
    }


    @And("the user check the first checkBox")
    public void the_user_check_the_first_check_box() {
        BrowserUtils.sleep(3);
        vehiclesOpenedLatif.clickCheckBox.click();
    }


    @And("the checkbox is selected")
    public void theCheckboxIsSelected() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehiclesOpenedLatif.clickCheckBox.isSelected());
    }


    @Then("the user should see all the checkBoxes checked")
    public void the_user_should_see_all_the_check_boxes_checked() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesOpenedLatif.clickCar1.isSelected());

        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesOpenedLatif.clickCar2.isSelected());
    }

    //step third
    @And("the user selects any car")
    public void the_user_selects_any_car() {
        BrowserUtils browserUtils = new BrowserUtils();
        browserUtils.hover(vehiclesOpenedLatif.clickCar3);
        vehiclesOpenedLatif.clickCar3.click();
    }

    @Then("that car should be selected")
    public void that_car_should_be_selected() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(vehiclesOpenedLatif.clickCar3.isSelected());

    }

}
