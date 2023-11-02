package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesOpened_Latif {

    public VehiclesOpened_Latif(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@type='checkbox'])[20]")
    public WebElement clickCheckBox;


    @FindBy(xpath = "(//input[@type='checkbox'])[27]")
    public WebElement clickCar1;

    @FindBy(xpath = "(//input[@type='checkbox'])[28]")
    public WebElement clickCar2;

    @FindBy(xpath = "(//input[@type='checkbox'])[29]")
    public WebElement clickCar3;
}
