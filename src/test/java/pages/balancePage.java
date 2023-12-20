package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class balancePage extends Parent {
    public balancePage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@aria-haspopup='menu'][1]")
    public WebElement hamburgerButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeButton;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;

    @FindBy(css = "ms-standard-button[icon='eye']")
    public WebElement eyeButton;

    @FindBy(xpath = "//*[text()='Online Payment']")
    public WebElement onlinePaymentText;

    @FindBy(xpath = "//label[text()='Stripe ']")
    public WebElement stripe;

    @FindBy(xpath = "//span[text()='Pay']")
    public WebElement pay;

    @FindBy(css = "input[type='text']")
    public WebElement amountText;

    @FindBy(css = "ms-button > button")
    public WebElement payAmountButton;

    @FindBy(id = "Field-numberInput")
    public WebElement creditCard;

    @FindBy(id = "Field-expiryInput")
    public WebElement expiration;

    @FindBy(id = "Field-cvcInput")
    public WebElement CVC;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[15]")
    public WebElement stripePayButton;

    @FindBy(xpath = "//*[text()='Student Payment successfully created']")
    public WebElement paymentSuccess;

    @FindBy(css = "div[class='mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted']")
    public WebElement balanceDetail;
}
