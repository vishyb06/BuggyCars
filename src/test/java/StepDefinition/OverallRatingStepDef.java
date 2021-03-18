package StepDefinition;

import Common.UIBasePageFactory;
import Common.WaitHelper;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OverallRatingStepDef extends UIBasePageFactory {
    public static Logger log = LogManager.getLogger(LoginStepDef.class.getName());

    @And("I click on Overall Rating image")
    public void iClickOnOverallRatingImage() throws InterruptedException {
        WaitHelper.waitPageForLoad();
        overallRating.clickOnOverallRatingImg();
    }

    @And("I select a Car for voting")
    public void iSelectACarForVoting() throws InterruptedException {
        overallRating.clickOnLamborghiniImg();
        WaitHelper.waitPageForLoad();
    }

    @And("I enter details for {string}")
    public void iEnterDetailsFor(String comment) {
        overallRating.enterComment(comment);
    }


    @And("I click on Vote button")
    public void iClickOnVoteButton() throws InterruptedException {
        overallRating.voteButtonClick();
        WaitHelper.waitPageForLoad();
    }

  }
