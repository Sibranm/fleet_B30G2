package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage extends BasePage{

    @FindBy (xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement hoverFleetButton;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[6]")
    public WebElement vehicleContracts;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement permissionMessage;


}
