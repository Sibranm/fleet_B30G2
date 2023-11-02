package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesModelPageSibran extends BasePage{

    public VehiclesModelPageSibran(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='grid-header-cell__label']")// //span[@class='grid-header-cell__label']
    public List<WebElement> columns;


    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement vehiclesModelOption;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement noPermissionMessage;




}
