package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage extends BasePage{

        public PinbarPage(){
                PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//a[normalize-space()='Learn how to use this space']")
        public WebElement learnHowToUseThisSpaceLink;

        @FindBy(xpath = "//h3[normalize-space()='How To Use Pinbar']")
        public WebElement howToUsePinbarText;


        @FindBy(xpath = "//p[contains(text(),'Use pin icon on the right top corner of page to cr')]")
        public WebElement usePinIconText;

        @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")

        public WebElement image;





}

