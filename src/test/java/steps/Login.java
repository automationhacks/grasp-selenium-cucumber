package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class Login {
    @Given("^i navigate to app URL$")
    public void iNavigateToAppURL() {
        System.out.println("\n i navigate to app URL");
    }

    @Then("^i should see home page$")
    public void iShouldSeeHomePage() {
        System.out.println("\n i should see home page");
    }

    @And("^i enter below login details$")
    public void iEnterBelowLoginDetails(DataTable table) {
        List<User> users = table.asList(User.class);

        for (User user: users) {
            System.out.println("\n Username is: " + user.username);
            System.out.println("\n Password is: " + user.password);
        }
    }

    @And("^i click login button$")
    public void iClickLoginButton() {
        System.out.println("\n i click login button");
    }

    @And("^i enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {
        System.out.println("\n >>> Username: " + username + " Password: " + password);
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
