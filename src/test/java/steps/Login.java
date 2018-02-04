package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
    @Given("^i navigate to app URL$")
    public void iNavigateToAppURL() {
        System.out.println("i navigate to app URL");
    }

    @And("^i enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String username) {
        System.out.println("i enter username as " + username);
    }

    @And("^i enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        System.out.println("i enter password as " + password);
    }

    @Then("^i should see home page$")
    public void iShouldSeeHomePage() {
        System.out.println("i should see home page");
    }


}
