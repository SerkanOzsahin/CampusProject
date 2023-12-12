package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.OnlinePaymentPage;
import utilities.BD;
import utilities.ConfigReader;

public class OnlinePayment {

    OnlinePaymentPage op = new OnlinePaymentPage();
    Actions actions = new Actions(BD.getDriver());

    @Given("The user opens the hamburger menu and selects Finance")
    public void theUserOpensTheHamburgerMenuAndSelectsFinance() {
        BD.getDriver().get("https://test.mersys.io/");
        op.mySendKeys(op.username, ConfigReader.getProperty("username"));
        op.mySendKeys(op.password, ConfigReader.getProperty("password"));
        op.myClick(op.signButton);
        op.myClick(op.hamburgerButton);
        Action action = actions.moveToElement(op.financeButton).build();
        action.perform();
        op.myClick(op.myFinanceButton);
        op.myClick(op.eyeButton);
        op.myClick(op.stripeButton);
    }

    @When("The user enters the payment amount, selects Online Payment and clicks Make Payment")
    public void theUserEntersThePaymentAmountSelectsOnlinePaymentAndClicksMakePayment() {
        op.myClick(op.payButton);
        op.mySendKeys(op.amountText, "2");
        op.myClick(op.payAmountButton);
        op.mySendKeys(op.creditCard, "4242424242424242");
        op.mySendKeys(op.expiration, "825");
        op.mySendKeys(op.CVC, "421");
        op.myClick(op.stripePayButton);
    }

    @Then("The user receives a payment confirmation")
    public void theUserReceivesAPaymentConfirmation() {
        op.verifyContainsText(op.paymentSuccess, "success");
    }
}
