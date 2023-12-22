package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Finance_235$_page;
import utilities.BD;

public class FinancePay {

    Finance_235$_page fp = new Finance_235$_page();
    String creditCardNumber = "4242424242424242";
    Actions actions = new Actions(BD.getDriver());

    @Given("Go to My Finance page")
    public void go_to_my_finance_page() {
        fp.wait.until(ExpectedConditions.visibilityOf(fp.hamburgerButton));
        fp.myClick(fp.hamburgerButton);
        actions.click((fp.financeButton)).perform();
        fp.wait.until(ExpectedConditions.visibilityOf(fp.myFinanceButton));
        fp.myClick(fp.myFinanceButton);
        fp.waitSec();
        fp.myClick(fp.eyeButton);
        fp.waitSec();
        actions.click(fp.stripeButton).perform();
        fp.waitSec();
    }

    @When("Make payment via Stripe")
    public void makePaymentViaStripe() {
        actions.click(fp.payButton).build().perform();
        fp.mySendKeys(fp.amountText, "235");
        fp.myClick(fp.onlinePaymentText);
        fp.myClick(fp.payAmountButton);
        By frame = By.xpath("//*[@id='payment-element']/div/iframe");
        fp.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        fp.mySendKeys(fp.creditCard, creditCardNumber);
        fp.mySendKeys(fp.expiration, "1232");
        fp.mySendKeys(fp.CVC, "777");
        BD.getDriver().switchTo().parentFrame();
        fp.wait.until(ExpectedConditions.elementToBeClickable(fp.stripePayButton));
        fp.myClick(fp.stripePayButton);
    }

    @Then("User should see Payment accepted")
    public void userShouldSeePaymentAccepted() {
        fp.verifyContainsText(fp.paymentSuccess, "successfully");
    }
}
