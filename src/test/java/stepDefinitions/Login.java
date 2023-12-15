package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.OnlinePaymentPage;
import utilities.BD;
import utilities.ConfigReader;

public class Login {

    OnlinePaymentPage op = new OnlinePaymentPage();

    @Given("the user navigates to campus website")
    public void theUserNavigatesToCampusWebsite() {
        BD.getDriver().get("https://test.mersys.io/");
    }

    @When("the user logs in with the valid username and password")
    public void theUserLogsInWithTheValidUsernameAndPassword() {
        op.mySendKeys(op.username, ConfigReader.getProperty("username"));
        op.mySendKeys(op.password, ConfigReader.getProperty("password"));
        op.myClick(op.signButton);
    }

    @Then("the user is successfully redirected to the homepage")
    public void theUserIsSuccessfullyRedirectedToTheHomepage() {
        op.wait.until(ExpectedConditions.visibilityOf(op.welcomeMessage));
        op.verifyContainsText(op.welcomeMessage, "Welcome");
    }
}
