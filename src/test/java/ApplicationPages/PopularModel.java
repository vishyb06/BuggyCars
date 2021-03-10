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


    @FindBy(xpath=" //a[normalize-space()='Model']")
    public static WebElement vote;



    //end UI Elements

   //start UI actions
   public static void popularModelClick(){
       PopularModelImg.click();
    }


    //end UI actions

}

