package StepDefinition;

import ApplicationPages.LoginPage;
import Common.UIBasePageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
public class LoginStepDef extends UIBasePageFactory {
    public static Logger log = LogManager.getLogger(LoginStepDef.class.getName());


    @Given("I open BuggyCars home page")
    public void iOpenBuggyCarsHomePage() {
        log.info("Opened BuggyCars home page");
        setupDriver();
        getPage();

    }

    @When("I enter valid credentials for login with {string} and {string}")
    public void iEnterValidCredentialsForLoginWith(String username, String password) {
       loginPage.enterDetails(username,password);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() throws InterruptedException {
        loginPage.LoginClick();
        Thread.sleep(3000);
    }

    @Then("I should be able to see home page")
    public void iShouldBeAbleToSeeHomePage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Home page is displayed",loginPage.isHomePageDisplayed());
    }
}
