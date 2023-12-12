package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav extends BD{

    public TopNav() {
        PageFactory.initElements(BD.getDriver(),this);
    }

    @FindBy(css = "[page='COURSES']")
    public WebElement Courses;

    @FindBy(css = "[page='CALENDAR']")
    public WebElement Calendar;

    @FindBy(css = "[page='ATTENDANCE']")
    public WebElement Attandance;

    @FindBy(css = "[page='ASSIGNMENT']")
    public WebElement Assignments;

    @FindBy(css = "[page='GRADING']")
    public WebElement Grading;

    @FindBy(xpath = "//*[@aria-haspopup='menu'][1]")
    public WebElement HamburgerMenu;

    @FindBy(xpath = "//*[@class='ng-fa-icon nav-link-icon'][1]")
    public WebElement Chat;

    @FindBy(xpath = "//*[@class='ng-fa-icon nav-link-icon'][2]")
    public WebElement Messages;

    @FindBy(xpath = "//*[@class='avatar-mini ng-star-inserted']")
    public WebElement Profile;




}
