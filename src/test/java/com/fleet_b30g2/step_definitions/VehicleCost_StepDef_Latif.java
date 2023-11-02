package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.VehicleCostsPage_Latif;
import com.fleet_b30g2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehicleCost_StepDef_Latif {

    VehicleCostsPage_Latif vehicleCostsPageLatif = new VehicleCostsPage_Latif();

    //step first

    @When("the user launches on the Vehicle Costs page")
    public void the_user_launches_on_the_vehicle_costs_page() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(vehicleCostsPageLatif.viewFleet);
        vehicleCostsPageLatif.clickVehicleCosts.click();
    }

    @Then("Users should see column on the Vehicle Costs page. Expected Column names: TYPE")
    public void usersShouldSeeColumnOnTheVehicleCostsPageExpectedColumnNamesTYPE() {
        BrowserUtils.sleep(3);

        Assert.assertEquals( "TYPE",vehicleCostsPageLatif.verifyType.getText());

    }

    @Then("Users should see column on the Vehicle Costs page. Expected Column names: TOTAL PRICE")
    public void usersShouldSeeColumnOnTheVehicleCostsPageExpectedColumnNamesTOTALPRICE() {
        BrowserUtils.sleep(3);
        Assert.assertEquals( "TOTAL PRICE",vehicleCostsPageLatif.verifyTotalPrice.getText());
    }

    @Then("Users should see column on the Vehicle Costs page. Expected Column names: DATE")
    public void usersShouldSeeColumnOnTheVehicleCostsPageExpectedColumnNamesDATE() {
        BrowserUtils.sleep(3);

        Assert.assertEquals( "DATE",vehicleCostsPageLatif.verifyDate.getText());
    }

    // second step
    @Then("Users check the first checkbox to check all the Vehicle Costs")
    public void usersCheckTheFirstCheckboxToCheckAllTheVehicleCosts() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehicleCostsPageLatif.verifyCheckBoxCosts.isDisplayed());
    }
}
