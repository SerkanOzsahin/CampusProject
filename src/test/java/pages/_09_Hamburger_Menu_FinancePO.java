package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class _09_Hamburger_Menu_FinancePO extends Parent {

    public _09_Hamburger_Menu_FinancePO() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement userName;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement login;

    @FindBy(xpath = " (//*[name()='svg'][@role='img'])[6]")
    public WebElement hamburgerButton;

    @FindBy(xpath = "(//span[contains(text(),'Finance')])[1]")
    public WebElement finance;

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-item-text'])[6]")
    public WebElement myFinance;

    @FindBy(xpath = "//span[normalize-space()='Student_4 11A']")
    public WebElement student;

    @FindBy(xpath = "//span[contains(text(),'Online Payment')]")
    public WebElement onlinePayment;

    @FindBy(css = "input[type='radio']")
    public WebElement stripeButton;

    @FindBy(xpath = "(//*[@type='radio'])[4]")
    public WebElement payButton;

    @FindBy(css = "[formcontrolname='customAmountField']")
    public WebElement amount;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'][normalize-space()='Pay'])[1]")
    public WebElement pay;

    @FindBy(xpath = "(//input[@id='Field-numberInput'])[1]")
    public WebElement cardNumber;

    @FindBy(id = "Field-expiryInput")
    public WebElement expiration;

    @FindBy(id = "Field-cvcInput")
    public WebElement cvc;

    @FindBy(xpath = "(//img[@class='stripe-img'])[1]")
    public WebElement stripePayButton;

    @FindBy(xpath = "//*[text()='Student Payment successfully created']")
    public WebElement successMessage;
}
