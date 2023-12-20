package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class calenderFeatureLessonPage extends Parent {
    public calenderFeatureLessonPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }
    @FindBy(id = "mat-input-0")
    public WebElement username;
    @FindBy(id = "mat-input-1")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;
    @FindBy(xpath = "(//span[@class=\"mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden\"])[1]")
    public WebElement calenderClick;
//    @FindBy(xpath = "(//button[@class=\"mat-button-toggle-button mat-focus-indicator\"])[1]")
//   public WebElement weeklyPlan;
    @FindBy(xpath = "(//td//div//div//div//span)[1]")
    public WebElement biologyDers;
//   @FindBy( = "mat-expansion-panel-header-description ng-star-inserted")
//    public WebElement messageBox;
//    @FindBy(xpath = "(//span[text()='Calendar'])[1]")
//    public WebElement calenderClick;


}
