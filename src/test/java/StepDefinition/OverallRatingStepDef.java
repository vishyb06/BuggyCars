package StepDefinition;

import Common.UIBasePageFactory;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OverallRatingStepDef extends UIBasePageFactory {
    public static Logger log = LogManager.getLogger(LoginStepDef.class.getName());

    @And("I click on Overall Rating image")
    public void iClickOnOverallRatingImage() throws InterruptedException {
        Thread.sleep(3000);
        overallRating.clickOnOverallRatingImg();
        Thread.sleep(3000);
    }

    @And("I select a Car for voting")
    public void iSelectACarForVoting() throws InterruptedException {
        overallRating.clickOnLamborghiniImg();
        Thread.sleep(3000);
    }

    @And("I enter details for {string}")
    public void iEnterDetailsFor(String comment) {
        overallRating.enterComment(comment);
    }


    @And("I click on Vote button")
    public void iClickOnVoteButton() throws InterruptedException {
        overallRating.voteButtonClick();
        Thread.sleep(3000);
    }

  }
