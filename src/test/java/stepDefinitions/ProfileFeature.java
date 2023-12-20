package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.ProfileFeaturePage;
import utilities.BD;
import utilities.ConfigReader;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ProfileFeature {
    ProfileFeaturePage pf=new ProfileFeaturePage();
    @Given("The student accesses the profile settings and clicks on the profile picture, which opens a window where they can change the picture.")
    public void userAccessesProfileSettingsAndSeesThemeMenu() {
        pf.myClick(pf.profileBtn);
        pf.wait.until(ExpectedConditions.visibilityOf(pf.settingsBtn));
        pf.myClick(pf.settingsBtn);
        pf.myClick(pf.uploadPicture);
    }

    @When("when you click on the General User upload button, a page appears where you can upload the image you want.")
    public void userCanChangeThemeFromDropdownMenu() throws AWTException {
        Robot robot= new Robot();
        pf.wait.until(ExpectedConditions.visibilityOf(pf.upload));
        pf.myClick(pf.upload);

        StringSelection picturePath=new StringSelection("\"C:\\Users\\90546\\OneDrive\\Pictures\\Screenshots\\ENGLISH.png\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(picturePath, null);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        pf.myClick(pf.deleteYes);
        pf.myClick(pf.uploadButton);
        pf.wait.until(ExpectedConditions.visibilityOf(pf.saveProfile));
        pf.myClick(pf.saveProfile);
    }


    @Then("The user should receive a success message when the profile picture is uploaded.")
    public void theUserShouldReceiveASuccessMessageWhenTheProfilePictureIsUploaded() {
        pf.wait.until(ExpectedConditions.visibilityOf(pf.profileSussessfully));
        pf.verifyContainsText(pf.profileSussessfully,"successfully");
    }
}
