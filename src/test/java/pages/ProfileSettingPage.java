package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class ProfileSettingPage extends Parent {

    public ProfileSettingPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "span[class='mdc-button__label'] > div")
    public WebElement profileButton;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//span[text()='Profile']")
    public WebElement profileText;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
    public WebElement themeButton;

    @FindBy(xpath = "//span[text()=' Purple Theme ']")
    public WebElement purpleTheme;

    @FindBy(xpath = "//ms-save-button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='Profile successfully updated']")
    public WebElement profileSuccessMessage;
}
