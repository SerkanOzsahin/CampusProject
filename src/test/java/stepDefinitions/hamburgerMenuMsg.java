package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.hamburgerMenuMsgPage;

public class hamburgerMenuMsg {
    hamburgerMenuMsgPage dc = new hamburgerMenuMsgPage();

    @Given("The user opens the hamburger menu and selects message")
    public void theUserOpensTheHamburgerMenuAndSelectsMessage() {
        dc.myClick(dc.menu);
    }
    @io.cucumber.java.en.Then("Student should be able to view and click on the link new message inbox outbox trash")
    public void studentShouldBeAbleToViewAndClickOnTheLinkNewMessageInboxOutboxTrash() throws InterruptedException {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
        dc.myClick(dc.message);
        dc.myClick(dc.newMessage);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.newMessage));
        Thread.sleep(2000);
        dc.myClick(dc.menu);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
        dc.myClick(dc.message);
        dc.myClick(dc.inbox);
        dc.myClick(dc.menu);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
        dc.myClick(dc.message);
        dc.myClick(dc.outbox);
        dc.myClick(dc.menu);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
        dc.myClick(dc.message);
        dc.myClick(dc.trash);
    }
}
