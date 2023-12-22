package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class FinanceTrackingPage extends Parent{
    public FinanceTrackingPage() {PageFactory.initElements(BD.getDriver(), this);}
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerBtn;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeBtn;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceBtn;

    @FindBy(xpath = " //*[@id=\"ms-table-0\"]/div/div/div/button/span[3] ")
    public WebElement threePoints;

    @FindBy(xpath = "//span[text()=' Excel Export ']")
    public WebElement exelExport;

    @FindBy(xpath = "//span[text()=' Pdf Export ']")
    public WebElement pdfExport;

}
