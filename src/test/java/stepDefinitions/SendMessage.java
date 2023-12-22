package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.SendMessagePage;
import utilities.BD;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class SendMessage {

    SendMessagePage sp = new SendMessagePage();

    @Given("the user clicks on the New Message link, they should see the people they can send messages to.")
    public void theUserClicksOnTheNewMessageLinkTheyShouldSeeThePeopleTheyCanSendMessagesTo() {
        sp.myClick(sp.sendMessageButton);
        sp.myClick(sp.sendEmail);
    }

    @When("The user can choose the person to send the message to and write the subject of the message.")
    public void theUserCanChooseThePersonToSendTheMessageToAndWriteTheSubjectOfTheMessage() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        sp.myClick(sp.addReceivers);
        sp.wait.until(ExpectedConditions.visibilityOf(sp.dialog));
        sp.myClick(sp.checkbox);
        sp.wait.until(ExpectedConditions.visibilityOf(sp.addClose));
        sp.myClick(sp.addClose);
        sp.wait.until(ExpectedConditions.visibilityOf(sp.sendMessageSucces));
        sp.mySendKeys(sp.subject, "Campus Project");
        By iframe = By.xpath("//*[@formcontrolname='message']/div/div//iframe");
        sp.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        sp.mySendKeys(sp.messages, "Test passed");
        BD.getDriver().switchTo().parentFrame();
        sp.wait.until(ExpectedConditions.elementToBeClickable(sp.attachFiles));
        sp.myClick(sp.attachFiles);
        sp.wait.until(ExpectedConditions.visibilityOf(sp.fromLocal));
        sp.myClick(sp.fromLocal);
        StringSelection filePath = new StringSelection("\"C:\\Users\\90546\\OneDrive\\Pictures\\Screenshots\\ENGLISH.png\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        sp.myClick(sp.buttonSend);
    }

    @And("The student should receive a “Success” message when the Send message button is clicked.")
    public void theStudentShouldReceiveASuccessMessageWhenTheSendMessageButtonIsClicked() {
        sp.wait.until(ExpectedConditions.visibilityOf(sp.successMessage));
        sp.verifyContainsText(sp.successMessage, "Successfully");
    }

    @Then("User can see list of sent messages")
    public void userCanSeeListOfSentMessages() {
        sp.wait.until(ExpectedConditions.visibilityOf(sp.hamburgerBtn));
        sp.myClick(sp.hamburgerBtn);
        new Actions(BD.getDriver()).moveToElement(sp.messagingBtn).click().build().perform();
        sp.wait.until(ExpectedConditions.visibilityOf(sp.outboxBtn));
        sp.myClick(sp.outboxBtn);
        sp.wait.until(ExpectedConditions.visibilityOf(sp.refreshBtn));
        sp.myClick(sp.refreshBtn);
        sp.wait.until(ExpectedConditions.visibilityOf(sp.fileVerification));
        sp.verifyContainsText(sp.fileVerification, "Campus Project");
    }
}
