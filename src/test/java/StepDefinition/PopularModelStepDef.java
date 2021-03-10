package StepDefinition;

import ApplicationPages.PopularMake;
import ApplicationPages.PopularModel;
import Common.UIBasePageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PopularModelStepDef extends UIBasePageFactory {
    public static Logger log = LogManager.getLogger(LoginStepDef.class.getName());

    @And("I click on Popular Model image")
    public void iClickOnPopularModelImage() throws InterruptedException {
        PopularModel.popularModelClick();
        Thread.sleep(3000);
    }
}
