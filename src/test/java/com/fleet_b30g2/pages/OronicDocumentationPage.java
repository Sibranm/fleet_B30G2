package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class OronicDocumentationPage {

    public OronicDocumentationPage(){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//i[@title='Get help']")
    public WebElement questionMarkButton;

}
