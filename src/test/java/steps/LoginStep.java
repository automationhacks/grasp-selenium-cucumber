package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import transform.EmailTransformer;

import java.util.List;


public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^i navigate to app URL$")
    public void iNavigateToAppURL() {
        base.driver.navigate().to("https://demo.mahara.org/");
    }

    @Then("^i should see home page$")
    public void iShouldSeeHomePage() {
        WebElement logo = base.driver.findElement(By.id("logo-area"));
        if (logo.isDisplayed()) {
            System.out.println("Successfully navigated to login page");
        }
        else {
            System.out.println("Assertion failed!");
        }
    }

    @And("^i enter below login details$")
    public void iEnterBelowLoginDetails(DataTable table) {
        List<User> users = table.asList(User.class);

        for (User user: users) {
            base.driver.findElement(By.name("login_username")).sendKeys(user.username);
            base.driver.findElement(By.id("login_login_password")).sendKeys(user.password);
        }
    }

    @And("^i click login button$")
    public void iClickLoginButton() {
        base.driver.findElement(By.id("login_submit")).submit();
    }

    @And("^i enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {
        System.out.println("\n >>> Username: " + username + " Password: " + password);
    }

    @And("^i enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(@Transform(EmailTransformer.class) String email) {
        System.out.println("Email of user is: " + email);
    }

    public class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
