package StepDefinition;

import ApplicationPages.PopularMake;
import ApplicationPages.PopularModel;
import Common.UIBasePageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class PopularModelStepDef extends UIBasePageFactory {
    public static Logger log = LogManager.getLogger(LoginStepDef.class.getName());

    @And("I click on Popular Model image")
    public void iClickOnPopularModelImage() throws InterruptedException {
        PopularModel.popularModelClick();
        Thread.sleep(3000);
    }


    @And("I can see Popular model car details")
    public void iCanSeePopularModelCarDetails()  throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Specification section is displayed",popularModel.isSpecificationSectionDisplayed());
        Assert.assertTrue("Date Column is displayed",popularModel.isDateDisplayed());
        Assert.assertTrue("Author Column is displayed",popularModel.isAuthorDisplayed());
        Assert.assertTrue("Comment Column is displayed",popularModel.isCommentDisplayed());
    }
}
