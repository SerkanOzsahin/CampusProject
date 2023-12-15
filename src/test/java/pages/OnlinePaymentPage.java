package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class OnlinePaymentPage extends Parent {

    public OnlinePaymentPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    public WebElement username;

    @FindBy(id = "mat-input-1")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement signButton;

    @FindBy(xpath = "//span[contains(text(), 'Welcome')]")
    public WebElement welcomeMessage;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeButton;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;

    @FindBy(css = "ms-standard-button[icon='eye']")
    public WebElement eyeButton;

    @FindBy(xpath = "//*[text()='Online Payment']")
    public WebElement onlinePaymentText;

    @FindBy(css = "input[type='radio']")
    public WebElement stripeButton;

    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement payButton;

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
}
