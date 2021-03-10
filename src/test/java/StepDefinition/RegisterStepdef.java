package StepDefinition;

import Common.UIBasePageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterStepdef extends UIBasePageFactory {
    @And("I click on Register button on Home Page")
    public void iClickOnRegisterButtonOnHomePage() {
        registerPage.RegisterHomeClick();
    }
    @When("I enter Registration details with {string} and {string} and  {string} and {string} and {string}")
    public void iEnterRegistrationDetailsWithAndAndAndAnd(String Login, String FirstName, String LastName, String Password, String ConfirmPassword) {
        registerPage.enterDetails(Login,FirstName,LastName,Password,ConfirmPassword);
    }

    @And("I click on Register button")
    public void iClickOnRegisterButton() {
        registerPage.RegisterClick();
    }

    @Then("I should be able to Register")
    public void iShouldBeAbleToRegister() {
        Assert.assertTrue( "Registration is successful",registerPage.isRegistrationSuccess());
    }


}
