package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage_Latif {

    public VehiclesPage_Latif(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[contains(text(),' Fleet')]")
    public WebElement viewFleet;


    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public WebElement clickVehicle;

}
