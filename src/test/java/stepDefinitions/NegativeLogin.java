package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class NegativeLogin {

    LoginPage lp = new LoginPage();

    @When("the user logs in with the invalid {string} and {string}")
    public void theUserLogsInWithTheInvalidAnd(String username, String password) {
        lp.mySendKeys(lp.username, username);
        lp.mySendKeys(lp.password, password);
        lp.myClick(lp.signButton);
    }

    @Then("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        lp.verifyContainsText(lp.invalidMessage, "Invalid");
    }
}
