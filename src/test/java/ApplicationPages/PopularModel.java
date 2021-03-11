package ApplicationPages;

import Common.UIBasePageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopularModel extends UIBasePageFactory {

    //start UI Elements
    @FindBy(xpath="//img[@title='Diablo']")
    public static WebElement PopularModelImg;

    @FindBy(xpath="//h4[normalize-space()='Specification']")
    public static WebElement specificationSection;

    @FindBy(id="comment")
    public static WebElement CommentTextBox;

    @FindBy(xpath="//button[normalize-space()='Vote!']")
    public static WebElement voteButton;
    //end UI Elements



   //start UI actions
   public static void popularModelClick(){
       PopularModelImg.click();
    }

    public static void enterComment(String comment){
        CommentTextBox.sendKeys(comment);
    }

    public static void voteButtonClick(){
        voteButton.click();
    }


    //end UI actions

}

