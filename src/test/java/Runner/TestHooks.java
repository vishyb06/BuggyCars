package Runner;


import Common.BaseClass;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;


public class TestHooks extends BaseClass {

    @After()
    public void TearDown(Scenario scenario) {
        log.info("Completed scenario --" + scenario.getId()+ "--closing driver");
        this.driver.quit();
    }
}

