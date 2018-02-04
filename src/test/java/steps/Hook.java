package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {


    @Before
    public void setUpTest() {
        System.out.println("\n == Launching mock browser == ");
    }

    @After
    public void tearDownTest(Scenario scenario) {

        // We can pass scenario object to do some post processing stuff here.
        if(scenario.isFailed()) {
            System.out.println(scenario.getName());
            // Take screenshot
        }
        System.out.println("\n ==Closing mock browser== ");
    }
}
