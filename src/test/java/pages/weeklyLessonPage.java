package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class weeklyLessonPage extends Parent {
    public weeklyLessonPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[text()='Calendar'])[1]")
    public WebElement calendarButton;

    @FindBy(xpath = "(//span[text()='Calendar'])[3]")
    public WebElement weeklyCoursePlan;

     @FindBy(xpath = "(//span[text()='11A- BIOLOGY '])[1]")
     public WebElement biology;

     @FindBy(css = "button[aria-label='Close dialog']")
     public WebElement closeButton;

    @FindBy(xpath = "(//button[@style='margin-right: 12px;'])[1]")
    public WebElement previousButton;

    @FindBy(xpath = "(//button[@style='margin-right: 12px;'])[2]")
    public WebElement todayButton;

    @FindBy(xpath = "(//button[@style='margin-right: 12px;'])[3]")
    public WebElement nextButton;














}
