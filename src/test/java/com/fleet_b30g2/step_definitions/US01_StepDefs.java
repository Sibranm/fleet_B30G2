package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.DashboardPage;
import com.fleet_b30g2.pages.LoginPage;
import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.ConfigurationReader;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US01_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {

        Assert.assertEquals("Login", Driver.getDriver().getTitle());
    }

    @When("User enters store manager <username> and <password>")
    public void userEntersStoreManagerUsernameAndPassword() {

        loginPage.login(ConfigurationReader.getProperty("store_manager_username"),
                ConfigurationReader.getProperty("store_manager_password"));
    }

    @And("user should be able to login")
    public void userShouldBeAbleToLogin() {

        BrowserUtils.waitForTitleContains("Dashboard");
    }

    @Then("User should see all the main <Modules>:")
    public void userShouldSeeAllTheMainModules(List<String> expModules){

        Assert.assertEquals(expModules, dashboardPage.modulesList());
    }

    @When("User enters driver <username> and <password>")
    public void userEntersDriverUsernameAndPassword() {
        loginPage.login(ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password"));
    }

    @And("user is able to login")
    public void userIsAbleToLogin() {

        BrowserUtils.waitForTitleContains("Dashboard");
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
    }

    @Then("User should see the following <Modules>:")
    public void userShouldSeeTheFollowingModules(List<String> expModules) {
        Assert.assertEquals(expModules, dashboardPage.modulesList());
    }
}
