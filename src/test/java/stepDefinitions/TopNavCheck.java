package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BD;
import utilities.DialogContent;
import utilities.TopNav;

import javax.swing.*;
import java.time.Duration;

public class TopNavCheck {



    public void waitSec() {
        try {
            Thread.sleep(Duration.ofSeconds(2).toMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("Check The TopNav")
    public void check_the_top_nav() {

        Actions action = new Actions(BD.getDriver());

       WebDriverWait wait=new WebDriverWait(BD.getDriver(),Duration.ofSeconds(20));




        DialogContent dc = new DialogContent();
        TopNav tp=new TopNav();

        waitSec();
        tp.Calendar.click();
        waitSec();

        tp.Attandance.click();
        waitSec();
        tp.Assignments.click();
        waitSec();
        tp.Grading.click();
        waitSec();


        tp.HamburgerMenu.click();
        action.moveToElement(tp.Courses).click().perform();

        waitSec();
        dc.closeButton.click();
        waitSec();
        tp.Messages.click();
        waitSec();
        dc.closeButton.click();
        waitSec();
        tp.Profile.click();
        waitSec();
        tp.Profile.click();
        waitSec();

        BD.quitDriver();

    }


}
