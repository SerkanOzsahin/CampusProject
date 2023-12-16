package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.SendMessagePage;
import utilities.BD;
import utilities.ConfigReader;

public class SendMessage {
     SendMessagePage sp=new SendMessagePage();
    @Given("the user clicks on the New Message link, they should see the people they can send messages to.")
    public void theUserClicksOnTheNewMessageLinkTheyShouldSeeThePeopleTheyCanSendMessagesTo() {
        BD.getDriver().get("https://test.mersys.io/");
        sp.mySendKeys(sp.username, ConfigReader.getProperty("username"));
        sp.mySendKeys(sp.password, ConfigReader.getProperty("password"));
        sp.myClick(sp.loginButton);
        sp.myClick(sp.sendMessageButton);
        sp.myClick(sp.sendEmail);
    }

    @When("The user can choose the person to send the message to and write the subject of the message.")
    public void theUserCanChooseThePersonToSendTheMessageToAndWriteTheSubjectOfTheMessage() {
        sp.myClick(sp.addReceivers);
        sp.wait.until(ExpectedConditions.visibilityOf(sp.dialog));
        sp.myClick(sp.checkbox);
        sp.myClick(sp.addClose);
    }

    @And("The student should receive a “Success” message when the Send message button is clicked.")
    public void theStudentShouldReceiveASuccessMessageWhenTheSendMessageButtonIsClicked() {
    }

    @Then("User can see list of sent messages")
    public void userCanSeeListOfSentMessages() {
    }
}
