package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.LoginPage;
import com.fleet_b30g2.pages.VehicleContractsPage;
import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US04_StepDefs {

    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();
    LoginPage loginPage = new LoginPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get("qa.navfort.com/user/login");
        loginPage.login("store_manager_username","store_manager_password");
    }

    @When("the user hover over the mouse on the Fleet button")
    public void the_user_hover_over_the_mouse_on_the_fleet_button() {

        BrowserUtils.hover(vehicleContractsPage.hoverFleetButton);

    }
    @When("the user click the Vehicle Contract button")
    public void the_user_click_the_vehicle_contract_button() {
        vehicleContractsPage.vehicleContracts.click();

    }
    @Then("User should see the following page title")
    public void user_should_see_the_following_page_title(List<String> expectedTitle) {


            

        

    }


}
