package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.OnlinePaymentPage;
import utilities.BD;

public class OnlinePayment {

    OnlinePaymentPage op = new OnlinePaymentPage();
    String creditCardNumber = "4242424242424242";

    @Given("The user opens the hamburger menu and selects Finance")
    public void theUserOpensTheHamburgerMenuAndSelectsFinance() {
        op.wait.until(ExpectedConditions.visibilityOf(op.hamburgerButton));
        op.myClick(op.hamburgerButton);
        new Actions(BD.getDriver()).moveToElement(op.financeButton).click().build().perform();
        op.wait.until(ExpectedConditions.visibilityOf(op.myFinanceButton));
        op.myClick(op.myFinanceButton);
        op.wait.until(ExpectedConditions.visibilityOf(op.eyeButton));
        op.myClick(op.eyeButton);
        op.wait.until(ExpectedConditions.visibilityOf(op.onlinePaymentText));
        new Actions(BD.getDriver()).moveToElement(op.stripeButton).click().build().perform();
    }

    @When("The user enters the payment amount, selects Online Payment and clicks Make Payment")
    public void theUserEntersThePaymentAmountSelectsOnlinePaymentAndClicksMakePayment() {
        op.wait.until(ExpectedConditions.visibilityOf(op.payButton));
        new Actions(BD.getDriver()).moveToElement(op.payButton).click().build().perform();
        op.mySendKeys(op.amountText, "2");
        op.myClick(op.onlinePaymentText);
        op.myClick(op.payAmountButton);
        By frame = By.xpath("//*[@id='payment-element']/div/iframe");
        op.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        op.mySendKeys(op.creditCard, creditCardNumber);
        op.mySendKeys(op.expiration, "825");
        op.mySendKeys(op.CVC, "421");
        BD.getDriver().switchTo().parentFrame();
        op.wait.until(ExpectedConditions.elementToBeClickable(op.stripePayButton));
        op.myClick(op.stripePayButton);
    }

    @Then("The user receives a payment confirmation")
    public void theUserReceivesAPaymentConfirmation() {
        op.verifyContainsText(op.paymentSuccess, "success");
    }
}
