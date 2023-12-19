package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class CalendarLecturePage extends Parent {

    public CalendarLecturePage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(css = "ms-layout-menu-button[page='CALENDAR']")
    public WebElement calendarButton;

    @FindBy(xpath = "(//div/button)[8]")
    public WebElement backButton;

    @FindBy(xpath = "//*[@id=\"container-3\"]/courses-calendar/div/ms-course-schedule-board/ms-browse/div/div/table/tbody/tr[1]/td[2]/div[2]")
    public WebElement lessonSelect;

    @FindBy(css = "ms-button[caption='MEETINGS.TITLE.RECORDING']")
    public WebElement recordingButton;

    @FindBy(css = "button[title='Play Video']")
    public WebElement playButton;
}
