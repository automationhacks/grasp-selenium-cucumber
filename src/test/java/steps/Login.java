package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class Login {
    @Given("^i navigate to app URL$")
    public void iNavigateToAppURL() {
        System.out.println("i navigate to app URL");
    }

    @Then("^i should see home page$")
    public void iShouldSeeHomePage() {
        System.out.println("i should see home page");
    }

    @And("^i enter below login details$")
    public void iEnterBelowLoginDetails(DataTable table) {

        /*List<List<String>> data = table.raw();

        System.out.println("Value of (0,0) is" + data.get(0).get(0));
        System.out.println("Value of (0,1) is " + data.get(0).get(1));*/

        List<User> users = table.asList(User.class);

        for (User user: users) {
            System.out.println("Username is: " + user.username);
            System.out.println("Password is: " + user.password);
        }
    }

    @And("^i click login button$")
    public void iClickLoginButton() {
        System.out.println("i click login button");
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
