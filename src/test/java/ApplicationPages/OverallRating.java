package ApplicationPages;

import Common.UIBasePageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverallRating extends UIBasePageFactory {

    //start UI Elements
    @FindBy(xpath="//img[@src='/img/overall.jpg']")
    public static WebElement overallRatingImg;

    @FindBy(xpath=" //div[@class='row']//div[@class='pull-xs-right']")
    public static WebElement nextPage;

    @FindBy(xpath=" //a[normalize-space()='Model']")
    public static WebElement model;

    @FindBy(xpath=" //a[normalize-space()='Rank']")
    public static WebElement rank;

    @FindBy(xpath=" //a[normalize-space()='Votes']")
    public static WebElement Votes;

    @FindBy(xpath="//th[@class='comments']")
    public static WebElement comments;

    @FindBy(xpath="//img[@title='Lamborghini Diablo']")
    public static WebElement lamborghiniImg;

    @FindBy(xpath="//textarea[@id='comment']")
    public static WebElement CommentTextBox;

    @FindBy(xpath="//button[normalize-space()='Vote!']")
    public static WebElement voteButton;

    @FindBy(xpath="//tbody/tr[1]/td[7]/a[1]")
    public static WebElement viewMoreLink;

    //end UI Elements



    //start UI actions
    public static void clickOnOverallRatingImg()
    {
        overallRatingImg.click();
    }

    public static void clickOnLamborghiniImg()
    {
        lamborghiniImg.click();
    }

    public static void enterComment(String comment){
        CommentTextBox.sendKeys(comment);
    }

    public static void voteButtonClick(){
        voteButton.click();
    }
    public static void viewMoreLinkClick()
    {
    viewMoreLink.click();
    }

    //end UI actions

}

