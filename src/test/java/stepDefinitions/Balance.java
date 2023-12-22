package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.balancePage;
import utilities.BD;

public class Balance {

    balancePage bp = new balancePage();
    String creditCardNumber = "4242424242424242";

    @Given("The user displays the remaining amount")
    public void theUserDisplaysTheRemainingAmount() {
        bp.wait.until(ExpectedConditions.visibilityOf(bp.hamburgerButton));
        bp.myClick(bp.hamburgerButton);
        new Actions(BD.getDriver()).moveToElement(bp.financeButton).click().build().perform();
        bp.wait.until(ExpectedConditions.visibilityOf(bp.myFinanceButton));
        bp.myClick(bp.myFinanceButton);
        bp.wait.until(ExpectedConditions.visibilityOf(bp.eyeButton));
        bp.myClick(bp.eyeButton);
        bp.myClick(bp.stripe);
    }

    @When("The user makes the payment")
    public void theUserMakesThePayment() {
        bp.myClick(bp.pay);
        bp.mySendKeys(bp.amountText, "2");
        bp.myClick(bp.onlinePaymentText);
        bp.myClick(bp.payAmountButton);
        By frame = By.xpath("//*[@id='payment-element']/div/iframe");
        bp.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        bp.mySendKeys(bp.creditCard, creditCardNumber);
        bp.mySendKeys(bp.expiration, "530");
        bp.mySendKeys(bp.CVC, "100");
        BD.getDriver().switchTo().parentFrame();
        bp.wait.until(ExpectedConditions.elementToBeClickable(bp.stripePayButton));
        bp.myClick(bp.stripePayButton);
        bp.verifyContainsText(bp.paymentSuccess, "Student Payment successfully created");
        bp.myClick(bp.balanceDetail);
    }
}
