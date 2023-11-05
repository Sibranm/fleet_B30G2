package com.fleet_b30g2.step_definitions;

import com.fleet_b30g2.pages.OronicDocumentationPage;
import com.fleet_b30g2.pages.VehiclesOdometerPage_Latif;
import com.fleet_b30g2.utilities.BrowserUtils;
import com.fleet_b30g2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;

import java.util.Set;

public class US02_StepDefs {

    OronicDocumentationPage oronicDocumentation = new OronicDocumentationPage();



    @When("the users clicks on the question mark")
    public void the_users_clicks_on_the_question_mark() {

        oronicDocumentation.questionMarkButton.click();
    }

    @Then("the users should see the Oronic Documentation page")
    public void the_users_should_see_the_oronic_documentation_page() {

        BrowserUtils.switchWindowAndVerify("https://doc.oroinc.com/","Welcome to Oro Documentation");

    }

}
