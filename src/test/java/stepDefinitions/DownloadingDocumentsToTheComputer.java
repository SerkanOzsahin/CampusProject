package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DownloadingDocumentsToTheComputerPO;
import utilities.BD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class DownloadingDocumentsToTheComputer {
    DownloadingDocumentsToTheComputerPO dc = new DownloadingDocumentsToTheComputerPO();
    private final Object lockObject = new Object();
    String mainPageId;


    @Given("The student should be able to click on the grading button")
    public void theStudentShouldBeAbleToClickOnTheGradingButton() {

        dc.myClick(dc.gradingButton);
        mainPageId = BD.getDriver().getWindowHandle();
    }

    @When("The student should be able to click on the student transcript and download")
    public void theStudentShouldBeAbleToClickOnTheStudentTranscriptAndDownload() throws AWTException, InterruptedException {
        synchronized (lockObject) {
            try {
                lockObject.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Robot rb = new Robot();
        dc.myClick(dc.courseGrade);
        dc.myClick(dc.studentTranscript);
        dc.myClick(dc.printButton);

        synchronized (lockObject) {
            lockObject.wait(2000);
        }

        for (int i = 0; i < 8; i++) {
            rb.keyPress(KeyEvent.VK_TAB);
            rb.keyRelease(KeyEvent.VK_TAB);
        }

        synchronized (lockObject) {
            lockObject.wait(2000);
        }

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        for (int i = 0; i < 3; i++) {
            rb.keyPress(KeyEvent.VK_TAB);
            rb.keyRelease(KeyEvent.VK_TAB);
        }
        synchronized (lockObject) {
            lockObject.wait(2000);
        }

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    @And("The student should be able to click on the course grade and download")
    public void theStudentShouldBeAbleToClickOnTheCourseGradeAndDownload() throws AWTException, InterruptedException {
        BD.getDriver().switchTo().window(mainPageId);
        Robot rb = new Robot();
        dc.myClick(dc.courseGrade);
        dc.myClick(dc.coursePrintButton);

        synchronized (lockObject) {
            lockObject.wait(2000);
        }

        for (int i = 0; i < 8; i++) {
            rb.keyPress(KeyEvent.VK_TAB);
            rb.keyRelease(KeyEvent.VK_TAB);
        }

        synchronized (lockObject) {
            lockObject.wait(2000);
        }

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        for (int i = 0; i < 3; i++) {
            rb.keyPress(KeyEvent.VK_TAB);
            rb.keyRelease(KeyEvent.VK_TAB);
        }
        synchronized (lockObject) {
            lockObject.wait(2000);
        }

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }
}
