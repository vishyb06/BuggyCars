package ApplicationPages;

import Common.UIBasePageFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends UIBasePageFactory {

    //start UI Elements
    @FindBy(name="login")
    public static WebElement loginTxtBox;

    @FindBy(name="password")
    public static WebElement passwordTxtBox;

    @FindBy(xpath ="//button[normalize-space()='Login']")
    public  static WebElement loginButton;

    @FindBy(xpath = "//h1[normalize-space()='BuggyCarsRating']")
    public  static WebElement Heading;

    @FindBy(xpath ="//a[normalize-space()='Profile']")
    public  static WebElement profile;
    //end UI Elements


    //start UI actions
    public static void enterDetails(String username, String password)
    {
        loginTxtBox.isDisplayed();
        loginTxtBox.sendKeys(username);
        passwordTxtBox.isDisplayed();
        passwordTxtBox.sendKeys(password);

    }
    public static void LoginClick(){
        loginButton.click();
    }

    public boolean isHomePageDisplayed() {
        try {
            return Heading.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isProfileDisplayed() {
        try {
            return profile.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    //end UI actions
}

