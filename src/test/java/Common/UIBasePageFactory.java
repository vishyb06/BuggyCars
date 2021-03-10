package Common;

import ApplicationPages.*;

import org.openqa.selenium.support.PageFactory;

public class UIBasePageFactory extends BaseClass {
    static protected RegisterPage registerPage;
    static protected LoginPage loginPage;
    static protected PopularMake popularMake;
    static protected PopularModel popularModel;
    static protected OverallRating overallRating;


    public void initializePages() {
        super.initializePages();
        registerPage=PageFactory.initElements(driver, RegisterPage.class);
        loginPage=PageFactory.initElements(driver, LoginPage.class);
        popularMake=PageFactory.initElements(driver, PopularMake.class);
        popularModel=PageFactory.initElements(driver, PopularModel.class);
        overallRating=PageFactory.initElements(driver, OverallRating.class);
    }

}
