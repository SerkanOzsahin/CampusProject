package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.FinanceTrackingPage;
import utilities.BD;
import utilities.ConfigReader;

public class FinanceTracking {
    FinanceTrackingPage ft=new FinanceTrackingPage();
    @Given("User selects Finance from hamburger menu.")
    public void userSelectsFinanceFromHamburgerMenu() {
        BD.getDriver().get("https://test.mersys.io/");
        ft.mySendKeys(ft.username, ConfigReader.getProperty("username"));
        ft.mySendKeys(ft.password, ConfigReader.getProperty("password"));
        ft.myClick(ft.loginButton);
        ft.myClick(ft.hamburgerBtn);
        new Actions(BD.getDriver()).moveToElement(ft.financeBtn).click().build().perform();
        ft.wait.until(ExpectedConditions.visibilityOf(ft.myFinanceBtn));
        ft.myClick(ft.myFinanceBtn);
    }

    @When("Three-dot drop-down menu button on user checkout page clickable.")
    public void threeDotDropDownMenuButtonOnUserCheckoutPageClickable() {
        //ft.wait.until(ExpectedConditions.visibilityOf(ft.));
        //ft.myClick(ft.);
    }

    @Then("The user can select and download the desired reporting method from the drop-down menu.")
    public void theUserCanSelectAndDownloadTheDesiredReportingMethodFromTheDropDownMenu() {
    }
}
