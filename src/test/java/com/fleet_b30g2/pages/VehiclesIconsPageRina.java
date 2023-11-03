package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VehiclesIconsPageRina extends BasePage {


    public VehiclesIconsPageRina(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "_username")
    public WebElement inputUsername;

    @FindBy(name="_password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(),' Fleet')]")
    public WebElement fleet;

    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public WebElement vehicles;

    @FindBy(xpath = "(//div[@class='dropdown'])[1]")
    public WebElement dropdown;


    @FindBy(xpath = "//i[@class='fa-eye hide-text']")
    public WebElement viewIcon;


    @FindBy(xpath = "//i[@class='fa-pencil-square-o hide-text']")
    public WebElement editIcon;

    @FindBy(xpath = "//i[@class='fa-trash-o hide-text']")
    public WebElement deleteIcon;
}
