package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Parent;
import utilities.BD;
import pages.TopNav;
import utilities.ConfigReader;

import java.time.Duration;

public class TopNavCheck {

    Actions actions= new Actions(BD.getDriver());

    WebDriverWait wait = new WebDriverWait(BD.getDriver(), Duration.ofSeconds(2));
    TopNav tp= new TopNav();
    @Given("Attend to Campus Page")
    public void attendToCampusPage() {
        BD.getDriver().get("https://test.mersys.io/");
        tp.mySendKeys(tp.username, ConfigReader.getProperty("username"));
        tp.mySendKeys(tp.password, ConfigReader.getProperty("password"));
        tp.myClick(tp.loginButton);

    }


    @When("Check The TopNav")
    public void checkTheTopNav() {
        tp.myClick(tp.Calendar); tp.waitSec();
        tp.myClick(tp.Attandance); tp.waitSec();
        tp.myClick(tp.Assignments); tp.waitSec();
        tp.myClick(tp.Grading); tp.waitSec();

        actions.click(tp.HamburgerMenu).perform(); tp.waitSec();

        actions.doubleClick(tp.Chat).perform(); tp.waitSec();
        tp.myClick(tp.closeButton); tp.waitSec();

       actions.click(tp.Messages).perform(); tp.waitSec();
        tp.myClick(tp.closeButton); tp.waitSec();

        actions.click(tp.Profile).perform(); tp.waitSec();

        actions.doubleClick(tp.Courses).perform();

          BD.quitDriver();
    }
}
