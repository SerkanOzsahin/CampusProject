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
        tp.myClick(tp.Assignments); tp.waitSec();
        tp.myClick(tp.Attandance); tp.waitSec();
        tp.myClick(tp.Grading); tp.waitSec();

        new Actions(BD.getDriver()).moveToElement
                (tp.Chat).click().build().perform(); tp.waitSec();
       tp.myClick(tp.closeButton); tp.waitSec();

       tp.myClick(tp.HamburgerMenu); tp.waitSec();

        new Actions(BD.getDriver()).moveToElement
                (tp.Profile).click().build().perform(); tp.waitSec();

        tp.myClick(tp.Profile); tp.waitSec();

        new Actions(BD.getDriver()).moveToElement
                (tp.Courses).click().build().perform(); tp.waitSec();

        tp.myClick(tp.Courses); tp.waitSec();

        new Actions(BD.getDriver()).moveToElement
                (tp.Messages).click().build().perform(); tp.waitSec();

        tp.myClick(tp.closeButton); tp.waitSec();


          BD.quitDriver();
    }


}
