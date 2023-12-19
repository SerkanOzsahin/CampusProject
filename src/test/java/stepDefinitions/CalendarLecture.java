package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CalendarLecturePage;

public class CalendarLecture {

    CalendarLecturePage cl = new CalendarLecturePage();

    @Given("The student is at Calendar page")
    public void theStudentIsAtCalendarPage() throws InterruptedException {
        cl.wait.until(ExpectedConditions.visibilityOf(cl.calendarButton));
        cl.myClick(cl.calendarButton);
        Thread.sleep(2000);
    }

    @When("The student goes to My Courses and chooses a completed course")
    public void theStudentGoesToMyCoursesAndChoosesACompletedCourse() {
        cl.wait.until(ExpectedConditions.visibilityOf(cl.backButton));
        cl.myClick(cl.backButton);
        cl.wait.until(ExpectedConditions.visibilityOf(cl.lessonSelect));
        cl.myClick(cl.lessonSelect);
    }

    @Then("The student should see a list of content")
    public void theStudentShouldSeeAListOfContent() {
        cl.wait.until(ExpectedConditions.visibilityOf(cl.recordingButton));
        cl.myClick(cl.recordingButton);
    }
}
