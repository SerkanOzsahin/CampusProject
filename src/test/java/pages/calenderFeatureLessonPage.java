package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class calenderFeatureLessonPage extends Parent {
    public calenderFeatureLessonPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class=\"mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden\"])[1]")
    public WebElement calenderClick;

    @FindBy(xpath = "//*[@id=\"container-3\"]/courses-calendar/div/ms-course-schedule-board/ms-browse/div/div/table/tbody/tr[1]/td[4]/div[2]/div/div/div")
    public WebElement matDers;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[23]")
    public WebElement closeWindow;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[17]")
    public WebElement backButton;

    @FindBy(xpath = "//*[@id=\"container-3\"]/courses-calendar/div/ms-course-schedule-board/ms-browse/div/div/table/tbody/tr[4]/td[5]/div/div/div/div")
    public WebElement spanishButton;
}
