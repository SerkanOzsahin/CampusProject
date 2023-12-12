package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OnlinePaymentPage;
import utilities.BD;
import utilities.ConfigReader;

public class OnlinePayment {

    OnlinePaymentPage op = new OnlinePaymentPage();

    @Given("The user opens the hamburger menu and selects Finance")
    public void theUserOpensTheHamburgerMenuAndSelectsFinance() {
        BD.getDriver().get("https://test.mersys.io/");
        op.mySendKeys(op.username, ConfigReader.getProperty("username"));
        op.mySendKeys(op.password, ConfigReader.getProperty("password"));
        op.myClick(op.signButton);
        op.myClick(op.hamburgerButton);
        op.myClick(op.financeButton);
        op.myClick(op.myFinanceButton);




    }

    @When("The user enters the payment amount, selects Online Payment and clicks Make Payment")
    public void theUserEntersThePaymentAmountSelectsOnlinePaymentAndClicksMakePayment() {


    }

    @Then("The user receives a payment confirmation")
    public void theUserReceivesAPaymentConfirmation() {


    }
}
