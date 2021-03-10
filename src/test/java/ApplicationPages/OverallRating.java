package ApplicationPages;

import Common.UIBasePageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverallRating extends UIBasePageFactory {

    //start UI Elements
    @FindBy(xpath="//img[@title='Lamborghini']")
    public static WebElement PopularMakeImg;

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

    //end UI Elements

   //start UI actions
   public static void popularMakeClick(){
       PopularMakeImg.click();
    }

    public static void clickOnNextPage()
    {
        nextPage.click();

    }
    //end UI actions

}

