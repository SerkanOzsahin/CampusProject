package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class deleteMessagePage extends Parent {

    public deleteMessagePage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerButton;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingButton;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outboxButton;

    @FindBy(xpath = "//div[text()='asdf']")
    public WebElement message;

    @FindBy(xpath = "//span[text()='Move to Trash']")
    public WebElement trashButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement yesButton;

    @FindBy(xpath = "//div[text()='Message successfully moved to trash!']")
    public WebElement deleteSuccess;
}
