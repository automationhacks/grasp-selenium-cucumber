package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Below commented code is required to work with junit + cucumber
 */
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/java/features"}, glue = "steps")
//public class TestRunner {
//}

// Below code is to work with test ng
@CucumberOptions(features = {"src/test/java/features"}, format = {"json:target/cucumber.json", "html:target/site/cucumber"}, glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}