package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class GradingPage extends Parent {

    public GradingPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "ms-layout-menu-button[page='GRADING']")
    public WebElement gradingButton;

    @FindBy(xpath = "//span[text()='Course Grade']")
    public WebElement courseGrade;

    @FindBy(css = "thead[role='rowgroup'] > tr > th:nth-child(1)")
    public WebElement courseNameText;

    @FindBy(xpath = "//span[text()='Student Transcript']")
    public WebElement studentTranscript;

    @FindBy(css = "thead[role='rowgroup'] > tr > th:nth-child(2)")
    public WebElement courseCodeText;

    @FindBy(xpath = "//span[text()='Transcript By Subject']")
    public WebElement subjectTranscript;

    @FindBy(xpath = "(//tbody[@role='rowgroup'] / tr)[1]")
    public WebElement subjectText;
}
