package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BD;

public class assignmentsPage extends Parent {
    public assignmentsPage() {
        PageFactory.initElements(BD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Assignments'])[1]")
    public WebElement assignments;

    @FindBy(xpath = "//span[text()='Show All']")
    public WebElement showAllButton;
}
