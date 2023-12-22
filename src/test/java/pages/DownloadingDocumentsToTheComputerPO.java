package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class DownloadingDocumentsToTheComputerPO extends Parent {

    public DownloadingDocumentsToTheComputerPO() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "[caption='NAV.GRADING.TITLE']")
    public WebElement gradingButton;

    @FindBy(xpath = "//span[contains(text(),'Student Transcript')]")
    public WebElement studentTranscript;

    @FindBy(xpath = "//span[contains(text(),'Course Grade')]")
    public WebElement courseGrade;

    @FindBy(xpath = "//span[contains(text(),'Print')]")
    public WebElement printButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[18]")
    public WebElement coursePrintButton;
}
