package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketingCampaignsPage_Latif {

    public MarketingCampaignsPage_Latif(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[contains(text(),' Marketing')])[1]")
    public WebElement viewMarketing;

    @FindBy(xpath = "//span[contains(text(),'Campaigns')]")
    public WebElement clickCampaigns;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement clickFilters;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement menageFilters;

    @FindBy(id = "ui-multiselect-0-0-option-0")
    public WebElement iconCheckBoxName;

    @FindBy(id = "ui-multiselect-0-0-option-1")
    public WebElement iconCheckboxCode;

    @FindBy(id = "ui-multiselect-0-0-option-2")
    public WebElement iconCheckboxStartDate;

    @FindBy(id = "ui-multiselect-0-0-option-3")
    public WebElement iconCheckBoxEndDate;

    @FindBy(id = "ui-multiselect-0-0-option-4")
    public WebElement iconCheckBoxBudget;


}
