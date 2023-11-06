package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.PinbarPage;
import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;


public class US03_PinbarStepDefs {

    PinbarPage pinbarPage = new PinbarPage();


    //DashboardPage dashboardPage = new DashboardPage();


    @And("the user click on the {string} link")
    public void theUserClickOnTheLink(String arg0) {

        BrowserUtils.sleep(3);
        pinbarPage.waitUntilLoaderScreenDisappear();
        pinbarPage.learnHowToUseThisSpaceLink.click();


    }
        @Then("the user should see pinbar texts")
    public void theUserShouldSeePinbarTexts() {

        BrowserUtils.sleep(3);

        String expectedText1 = "How To Use Pinbar";
        String expectedText2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        Assert.assertEquals(expectedText1, pinbarPage.howToUsePinbarText.getText());
        Assert.assertEquals(expectedText2, pinbarPage.usePinIconText.getText());





    }

    @Then("the users should see an image on the page")
    public void theUsersShouldSeeAnImageOnThePage() {

       pinbarPage.waitUntilLoaderScreenDisappear();

        String expectedUrl = "https://qa.navfort.com/bundles/oronavigation/images/pinbar-location.jpg";



        String actualSrc = String.valueOf(Driver.getDriver().findElement(By.xpath("//img")).getAttribute("src"));

        Assert.assertEquals(expectedUrl,actualSrc);


    }

}