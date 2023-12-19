package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.FinanceTrackingPage;
import utilities.BD;
import utilities.ConfigReader;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FinanceTracking {
    FinanceTrackingPage ft=new FinanceTrackingPage();
    @Given("User selects Finance from hamburger menu.")
    public void userSelectsFinanceFromHamburgerMenu() {
        ft.myClick(ft.hamburgerBtn);
        new Actions(BD.getDriver()).moveToElement(ft.financeBtn).click().build().perform();
        ft.wait.until(ExpectedConditions.visibilityOf(ft.myFinanceBtn));
        ft.myClick(ft.myFinanceBtn);
    }

    @When("Three-dot drop-down menu button on user checkout page clickable.")
    public void threeDotDropDownMenuButtonOnUserCheckoutPageClickable(){
        ft.wait.until(ExpectedConditions.visibilityOf(ft.threePoints));
        ft.myClick(ft.threePoints);
    }

    @Then("The user can select and download the desired reporting method from the drop-down menu.")
    public void theUserCanSelectAndDownloadTheDesiredReportingMethodFromTheDropDownMenu() throws AWTException {
        Robot robot=new Robot();
        ft.wait.until(ExpectedConditions.visibilityOf(ft.exelExport));
        new Actions(BD.getDriver()).moveToElement(ft.exelExport).click().build().perform();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ft.myClick(ft.threePoints);
        ft.wait.until(ExpectedConditions.visibilityOf(ft.pdfExport));
        new Actions(BD.getDriver()).moveToElement(ft.pdfExport).click().build().perform();
    }
}
