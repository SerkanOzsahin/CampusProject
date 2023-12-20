package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class hamburgerMenuMsgPage extends Parent {
    public hamburgerMenuMsgPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    public WebElement username;
    @FindBy(id = "mat-input-1")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//*[@class=\"svg-inline--fa fa-bars\"])[1]")
    public  WebElement menu;

    @FindBy(xpath = "//span[text()='Messaging']")
    public  WebElement message;
    @FindBy(xpath = "//span[text()='New Message']")
    public  WebElement newMessage;
    @FindBy(xpath = "//span[text()='Inbox']")
    public  WebElement inbox;
    @FindBy(xpath = "//span[text()='Outbox']")
    public  WebElement outbox;
    @FindBy(xpath = "//span[text()='Trash']")
    public  WebElement trash;

    @FindBy(xpath = "(//*[@class=\"mat-ripple mat-mdc-button-ripple\"])[6]")
    public WebElement anaMenu;


}
