package ApplicationPages;

import Common.UIBasePageFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopularModel extends UIBasePageFactory {

    //start UI Elements
    @FindBy(xpath="//img[@title='Diablo']")
    public static WebElement PopularModelImg;

    @FindBy(xpath="//h4[normalize-space()='Specification']")
    public static WebElement specificationSection;

    @FindBy(xpath="//th[normalize-space()='Date']")
    public static WebElement date;

    @FindBy(xpath="//th[normalize-space()='Author']")
    public static WebElement author;

    @FindBy(xpath="//th[normalize-space()='Comment']")
    public static WebElement comment;

    //start UI actions
    public static void popularModelClick(){
        PopularModelImg.click();
    }

    public boolean isSpecificationSectionDisplayed() {
        try {
            return specificationSection.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDateDisplayed() {
        try {
            return date.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isAuthorDisplayed() {
        try {
            return author.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isCommentDisplayed() {
        try {
            return comment.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }




}

