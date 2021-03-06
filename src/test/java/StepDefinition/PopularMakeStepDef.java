package StepDefinition;

import ApplicationPages.PopularMake;
import Common.UIBasePageFactory;
import Common.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PopularMakeStepDef extends UIBasePageFactory {
    public static Logger log = LogManager.getLogger(LoginStepDef.class.getName());

    @When("I click on Popular Make image")
    public void iClickOnPopularMakeImage() throws InterruptedException {
        PopularMake.popularMakeClick();
        WaitHelper.waitPageForLoad();
    }

    @And("I click on Next page")
    public void iClickOnNextPage() throws InterruptedException {
        popularMake.clickOnNextPage();
        WaitHelper.waitPageForLoad();
    }
}
