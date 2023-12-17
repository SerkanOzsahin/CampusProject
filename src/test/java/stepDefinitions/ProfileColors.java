package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.ProfileSettingPage;

import java.util.Random;

public class ProfileColors {

    ProfileSettingPage ps = new ProfileSettingPage();

    @Given("the student is on their profile settings page")
    public void theStudentIsOnTheirProfileSettingsPage() {
        ps.wait.until(ExpectedConditions.visibilityOf(ps.profileButton));
        ps.myClick(ps.profileButton);
        ps.myClick(ps.settingsButton);
    }

    @When("they navigate to the color customization and choose colors")
    public void theyNavigateToTheColorCustomizationAndChooseColors() {
        ps.wait.until(ExpectedConditions.visibilityOf(ps.profileText));
        ps.myClick(ps.themeButton);
        Random random = new Random();
        int randomIndex = random.nextInt(ps.themeNames.size());
        ps.themeNames.get(randomIndex).click();
        ps.myClick(ps.saveButton);
    }

    @Then("the profile color should change")
    public void theProfileColorShouldChange() {
        ps.verifyContainsText(ps.profileSuccessMessage, "updated");
    }
}
