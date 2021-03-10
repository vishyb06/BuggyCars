package StepDefinition;

import ApplicationPages.PopularMake;
import Common.UIBasePageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PopularMakeStepDef extends UIBasePageFactory {
    public static Logger log = LogManager.getLogger(LoginStepDef.class.getName());

    @When("I click on Popular Make image")
    public void iClickOnPopularMakeImage() throws InterruptedException {
        PopularMake.popularMakeClick();
        Thread.sleep(3000);
    }

    @And("I can see list of Popular model cars with rank and votes")
    public void iCanSeeListOfPopularModelCarsWithRankAndVotes() {

    }

    @And("I click on Next page")
    public void iClickOnNextPage() throws InterruptedException {
        popularMake.clickOnNextPage();
        Thread.sleep(3000);
    }
}
