package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class FinanceTrackingPage extends Parent{
    public FinanceTrackingPage() {PageFactory.initElements(BD.getDriver(), this);}
    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerBtn;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeBtn;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceBtn;
}
