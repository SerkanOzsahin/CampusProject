package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class SendMessagePage extends Parent {
    public SendMessagePage() {PageFactory.initElements(BD.getDriver(), this);}

    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[8]")
    public WebElement sendMessageButton;

    @FindBy(xpath = "(//button[@matbadgecolor='accent'])[3]")
    public WebElement sendEmail;

    @FindBy(xpath = "//ms-button[@icon='users-medical']")
    public WebElement addReceivers;

    @FindBy(xpath = "//td/mat-checkbox")
    public WebElement checkbox;

    @FindBy(xpath = "//span[text()='Add & Close']/ancestor::ms-button")
    public WebElement addClose;

    @FindBy(xpath ="//ms-dialog")
    public WebElement dialog;
}
