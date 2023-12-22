package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class ProfileFeaturePage extends Parent{
    public ProfileFeaturePage() {PageFactory.initElements(BD.getDriver(),this);}

    @FindBy(css = "span[class='mdc-button__label'] > div")
    public WebElement profileBtn;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsBtn;

    @FindBy(xpath = "(//div/div/img)[10]")
    public WebElement uploadPicture;

    @FindBy(css = "svg[data-icon='upload']")
    public WebElement upload;

    @FindBy(xpath = " //span[text()=' Upload ']")
    public WebElement uploadButton;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveProfile;

    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement profileSussessfully;

    @FindBy(xpath = "//span[text()=' Yes '] ")
    public WebElement deleteYes;



}
