package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.hamburgerMenuMsgPage;
import utilities.BD;

public class hamburgerMenuMsg {
    hamburgerMenuMsgPage dc = new hamburgerMenuMsgPage();

    @Given("The user opens the hamburger menu and selects message")
    public void theUserOpensTheHamburgerMenuAndSelectsMessage() {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.username, "Student_4");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.loginBtn);
        dc.myClick(dc.menu);
    }

    @io.cucumber.java.en.Then("Student should be able to view and click on the link new message inbox outbox trash")
    public void studentShouldBeAbleToViewAndClickOnTheLinkNewMessageInboxOutboxTrash() throws InterruptedException {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
        dc.myClick(dc.message);
        dc.myClick(dc.newMessage);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.newMessage));
        Thread.sleep(2000);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.anaMenu));
        dc.myClick(dc.anaMenu);
//        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
//        dc.myClick(dc.inbox);
//        dc.myClick(dc.anaMenu);
//        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
//        dc.myClick(dc.outbox);
//        dc.myClick(dc.anaMenu);
//        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.message));
//        dc.myClick(dc.trash);
//        dc.myClick(dc.anaMenu);
    }
}
