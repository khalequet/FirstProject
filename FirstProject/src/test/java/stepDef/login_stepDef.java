package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import pageObject.login_page;

public class login_stepDef extends config {
    login_page LP = new login_page(driver);

    @Given("I am at TalentTek Homepage")
    public void iAmAtTalentTekHomepage() {
    LP.verifyHomePageTitle();
    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        LP.enterEmail(Hook.eMail);
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        
    }

    @When("I click on Login Button")
    public void iClickOnLoginButton() {
    }
}
