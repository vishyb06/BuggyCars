package ApplicationPages;

import Common.UIBasePageFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegisterPage extends UIBasePageFactory {

    //start UI Elements
    @FindBy(id="username")
    public static WebElement LoginTextBox;

    @FindBy(id="firstName")
    public static WebElement FirstNameTestBox;

    @FindBy(id="lastName")
    public static WebElement LastNameTextBox;

    @FindBy(id="password")
    public static WebElement PasswordTextBox;

    @FindBy(id="confirmPassword")
    public static WebElement ConfirmPasswordTextBox;


    @FindBy(xpath ="//button[normalize-space()='Register']")
    public  static WebElement registerButton;

    @FindBy(how = How.CSS, using ="btn")
    public  static WebElement cancelLink;

    @FindBy(xpath ="//a[normalize-space()='Register']")
    public  static WebElement registerHomeButton;

    @FindBy(xpath ="//div[@class='result alert alert-success']")
    public  static WebElement registrationSuccess;
    //end UI Elements


    //start UI actions
    public static void enterDetails(String Login, String FirstName, String LastName, String Password, String ConfirmPassword)
    {
        LoginTextBox.isDisplayed();
        LoginTextBox.sendKeys(Login);
        FirstNameTestBox.isDisplayed();
        FirstNameTestBox.sendKeys(FirstName);
        LastNameTextBox.isDisplayed();
        LastNameTextBox.sendKeys(LastName);
        PasswordTextBox.isDisplayed();
        PasswordTextBox.sendKeys(Password);
        ConfirmPasswordTextBox.isDisplayed();
        ConfirmPasswordTextBox.sendKeys(ConfirmPassword);

    }

    public static void cancel(){
        if(cancelLink.isDisplayed()){
            cancelLink.click();
        }
    }

    public void RegisterClick() {
        registerButton.click();
    }

    public void RegisterHomeClick() {
        registerHomeButton.click();
    }


    public boolean isRegistrationSuccess() {
        try {
            return registrationSuccess.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    //end UI actions
}


