package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage_Latif {

    public VehicleCostsPage_Latif(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(text(),' Fleet')]")
    public WebElement viewFleet;

    @FindBy(xpath = "(//*[contains(text(),'Vehicle Costs')])[3]")
    public WebElement clickVehicleCosts;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[1]")
    public WebElement verifyType;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[2]")
    public WebElement verifyTotalPrice;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[3]")
    public WebElement verifyDate;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement verifyCheckBoxCosts;


}
