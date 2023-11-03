package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.MarketingCampaignsPage_Latif;
import com.fleet_b30g2.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MarketingCampaignsStepDef_Latif {

    MarketingCampaignsPage_Latif campaignsPageLatif = new MarketingCampaignsPage_Latif();

    @When("sales and store join in Marketing Campaigns page")
    public void salesAndStoreJoinInMarketingCampaignsPage() {
        BrowserUtils.sleep(5);
        BrowserUtils.hover(campaignsPageLatif.viewMarketing);
        campaignsPageLatif.clickCampaigns.click();
    }

    @And("sales and store sees Menage filters")
    public void salesAndStoreSeesMenageFilters() {
        BrowserUtils.sleep(3);
        campaignsPageLatif.clickFilters.click();
        campaignsPageLatif.menageFilters.click();
    }

    @Then("sales and store sees {int} filter options are checked")
    public void sales_and_store_sees_filter_options_are_checked(Integer int1) {
        Assert.assertTrue(campaignsPageLatif.iconCheckBoxName.isSelected());
        Assert.assertTrue(campaignsPageLatif.iconCheckboxCode.isSelected());
        Assert.assertTrue(campaignsPageLatif.iconCheckboxStartDate.isSelected());
        Assert.assertTrue(campaignsPageLatif.iconCheckBoxEndDate.isSelected());
        Assert.assertTrue(campaignsPageLatif.iconCheckBoxBudget.isSelected());
    }


    @Then("they can uncheck {int} or all boxes")
    public void theyCanUncheckOrAllBoxes(int arg0) {

        campaignsPageLatif.iconCheckboxCode.click();
        Assert.assertTrue(campaignsPageLatif.iconCheckboxCode.isEnabled());

        campaignsPageLatif.iconCheckBoxEndDate.click();
        Assert.assertTrue(campaignsPageLatif.iconCheckBoxEndDate.isEnabled());
        campaignsPageLatif.iconCheckBoxBudget.click();
        Assert.assertTrue(campaignsPageLatif.iconCheckBoxBudget.isEnabled());
    }
}
