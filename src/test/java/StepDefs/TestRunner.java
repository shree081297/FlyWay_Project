package StepDefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin= {"pretty","json:target/cucumber.json","html:target/html-cucumber"},
		features="src/test/java/Features",
		glue="StepDefs",
		tags= {"@FlyWay"}
		//tags= {"@Regression"},
		//tags= {"@Sanity"}
		)


public class TestRunner {

}
