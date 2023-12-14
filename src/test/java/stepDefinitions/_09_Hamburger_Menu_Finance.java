package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages._09_Hamburger_Menu_FinancePO;
import utilities.BD;

import javax.swing.*;

public class _09_Hamburger_Menu_Finance {
    _09_Hamburger_Menu_FinancePO dc = new _09_Hamburger_Menu_FinancePO();
    Actions actions = new Actions(BD.getDriver());
    @Given("Navigate to site")
    public void navigateToSite() {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.userName, "Student_4");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.login);
    }

    @When("The user should be able to click on the finance button below the hamburger button")
    public void theUserShouldBeAbleToClickOnTheFinanceButtonBelowTheHamburgerButton() {
        dc.myClick(dc.hamburgerButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.finance));
        dc.myClick(dc.finance);
    }

    @Then("The user should be able to click my finance button")
    public void theUserShouldBeAbleToClickMyFinanceButton() {

        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.myFinance));
        dc.myClick(dc.myFinance);
        dc.myClick(dc.student);
        dc.myClick(dc.onlinePayment);
        actions.moveToElement(dc.stripeButton).click().perform();
        actions.moveToElement(dc.payButton).click().perform();
        actions.moveToElement(dc.amount).click().sendKeys("263").perform();
        actions.moveToElement(dc.pay).click().perform();
        dc.myClick(dc.pay);
    }

    @And("The user can complete the payment transaction")
    public void theUserCanCompleteThePaymentTransaction(){
        By frame = By.xpath("//*[@id='payment-element']/div/iframe");
        dc.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        dc.wait.until(ExpectedConditions.visibilityOf(dc.cardNumber));
        dc.mySendKeys(dc.cardNumber, "4242424242424242");
        dc.mySendKeys(dc.expiration, "01,26");
        dc.mySendKeys(dc.cvc, "565");
        BD.getDriver().switchTo().parentFrame();
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.stripePayButton));
        dc.myClick(dc.stripePayButton);
    }

    @Then("The user can see the message that the payment transaction is completed")
    public void theUserCanSeeTheMessageThatThePaymentTransactionIsCompleted() {
        dc.verifyContainsText(dc.successMessage, "success");

    }
}
