package com.fleet_b30g2.pages;

import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends BasePage{

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    private final By dashboardModules = By.xpath("//*[@class='title title-level-1']");

    public List<String> modulesList(){

        List<String> modulesText = new ArrayList<>();
        List<WebElement> modules = Driver.getDriver().findElements(dashboardModules);

        for (WebElement elm: modules) {

            modulesText.add(elm.getText().trim());
        }
        return modulesText;
    }
}
