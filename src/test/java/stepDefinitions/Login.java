package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;
import utilities.BD;
import utilities.ConfigReader;

public class Login {

    LoginPage lp = new LoginPage();

    @Given("the user navigates to campus website")
    public void theUserNavigatesToCampusWebsite() {
        BD.getDriver().get("https://test.mersys.io/");
    }

    @When("the user logs in with the valid username and password")
    public void theUserLogsInWithTheValidUsernameAndPassword() {
        lp.mySendKeys(lp.username, ConfigReader.getProperty("username"));
        lp.mySendKeys(lp.password, ConfigReader.getProperty("password"));
        lp.myClick(lp.signButton);
    }

    @Then("the user is successfully redirected to the homepage")
    public void theUserIsSuccessfullyRedirectedToTheHomepage() {
        lp.wait.until(ExpectedConditions.visibilityOf(lp.welcomeMessage));
        lp.verifyContainsText(lp.welcomeMessage, "Welcome");
    }
}
