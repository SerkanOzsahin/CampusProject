package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

import javax.swing.text.html.CSS;

public class TopNav extends Parent {

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

    @FindBy(css= "[id='mat-badge-content-6']")
    public WebElement Messages;

    @FindBy(xpath = "//*[@class='avatar-mini ng-star-inserted']")
    public WebElement Profile;

    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="[aria-label='Close dialog']")
    public WebElement closeButton;


    public void waitSec(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
