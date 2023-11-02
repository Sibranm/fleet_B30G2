package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderEventsPage extends BasePage{
    public CalenderEventsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calenderEvents;

    @FindBy(css = ".btn.main-group.btn-primary.pull-right")
    public WebElement createCalenderEventBtn;

    @FindBy(xpath = "//input[starts-with(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "(//input[@data-related-field='interval'])[1]")
    public WebElement repeatDayInputBox;

    @FindBy(css = ".validation-failed")
    public WebElement errorMsg;


}
