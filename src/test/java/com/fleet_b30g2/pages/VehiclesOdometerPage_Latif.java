package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesOdometerPage_Latif {

    public VehiclesOdometerPage_Latif(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[contains(text(),' Fleet')]")
    public WebElement viewFleet;

    @FindBy(xpath = "//span[contains(text(),'Vehicle Odometer')]")
    public WebElement clickVehicleOdometer;


    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement startNumberPage;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement endNumberPage;



}
