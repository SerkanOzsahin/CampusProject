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

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeButton;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;

    @FindBy(css = "ms-standard-button[icon='eye']")
    public WebElement eyeButton;

    @FindBy(css = "input[value='STRIPE']")
    public WebElement stripeButton;
}
