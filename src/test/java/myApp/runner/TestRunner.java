package myApp.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"             //to preduce cucumber report
        },
        features = "src\\test\\resources\\features",
        glue = "myApp\\step_definitions",
        dryRun = false
)
public class TestRunner {

}
