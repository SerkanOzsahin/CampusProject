package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.deleteMessagePage;
import utilities.BD;
import utilities.ConfigReader;

public class DeleteMessage {

    deleteMessagePage dp = new deleteMessagePage();

    @Given("The user opens the outgoing messages list")
    public void theUserOpensTheOutgoingMessagesList() {
        BD.getDriver().get("https://test.mersys.io/");
        dp.mySendKeys(dp.username, ConfigReader.getProperty("username"));
        dp.mySendKeys(dp.password, ConfigReader.getProperty("password"));
        dp.myClick(dp.loginButton);
    }

    @When("The user clicks the hamburger menu,messaging and outbox")
    public void theUserClicksTheHamburgerMenuMessagingAndOutbox() {
        dp.myClick(dp.hamburgerButton);
        dp.myClick(dp.messagingButton);
        dp.myClick(dp.outboxButton);
        dp.wait.until(ExpectedConditions.visibilityOf(dp.message));
        dp.myClick(dp.message);
        dp.myClick(dp.trashButton);
        dp.myClick(dp.yesButton);
    }

    @Then("The user successfully deletes messages")
    public void theUserSuccessfullyDeletesMessages() {
        dp.verifyContainsText(dp.deleteSuccess, "Message successfully moved to trash!");
    }
}
