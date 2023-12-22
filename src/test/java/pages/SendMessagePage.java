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

    @FindBy(xpath = "//*[text()='Users (Fullname, Username or E-mail) was successfully added']")
    public WebElement sendMessageSucces;

    @FindBy(css = "ms-text-field > input")
    public WebElement subject;

    @FindBy(css = "body[id='tinymce']")
    public WebElement messages;

    @FindBy(xpath = "//button//span[text()='Attach Files...']")
    public WebElement attachFiles;

    @FindBy(xpath = "//*[text()='From Local']")
    public WebElement fromLocal;

    @FindBy(xpath = "//*[text()='Send']")
    public WebElement buttonSend;

    @FindBy(xpath = "//*[text()='Message Successfully sent']")
    public WebElement successMessage;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerBtn;

    @FindBy(xpath = "//*[text()='Messaging']")
    public WebElement messagingBtn;

    @FindBy(xpath = "//*[text()='Outbox']")
    public WebElement outboxBtn;

    @FindBy(xpath = "//ms-standard-button[@icon='sync']")
    public WebElement refreshBtn;

    @FindBy(xpath = "//*[text()='Campus Project']")
    public WebElement fileVerification;
}
