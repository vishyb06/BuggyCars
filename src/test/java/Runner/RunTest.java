package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "classpath:Features",
        glue = {"StepDefinition", "Runner"},
        monochrome = false,
        plugin ={"pretty",
                "json:target/cucumber.json" ,"html:target/site/cucumber-pretty"},
        tags = "@BuggyCarsRatingTest",
        publish = true

)
public class RunTest {

}
