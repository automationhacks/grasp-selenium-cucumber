package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void setUpTest() {
        // Set marionette to point to geckodriver for firefox browser
        // Skipping below since it does not work on FF Quantum 58. Need to troubleshoot.
//        System.setProperty("webdriver.firefox.marionette", "C:\\technical\\selenium\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\technical\\selenium\\drivers\\chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void tearDownTest(Scenario scenario) {

        // We can pass scenario object to do some post processing stuff here.
        if(scenario.isFailed()) {
            System.out.println(scenario.getName());
            // Take screenshot
        }
        base.driver.close();
        base.driver.quit();
    }
}
