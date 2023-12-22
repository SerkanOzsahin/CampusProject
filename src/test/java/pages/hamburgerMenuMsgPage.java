package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class hamburgerMenuMsgPage extends Parent {

    public hamburgerMenuMsgPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class=\"svg-inline--fa fa-bars\"])[1]")
    public WebElement menu;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement message;

    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement newMessage;

    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inbox;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outbox;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trash;
}
