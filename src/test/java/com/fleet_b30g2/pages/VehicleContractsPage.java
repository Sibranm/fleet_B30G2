package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleContractsPage extends BasePage{

    public VehicleContractsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),' Fleet')]")
    public WebElement fleetDropdown;

    @FindBy(xpath = "//*[contains(text(),'Vehicle Contracts')]")
    public WebElement vehicleContracts;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement permissionMessage;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement driverFleet;


}
