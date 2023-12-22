package stepDefinitions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.calenderFeatureLessonPage;

public class CalendarLesson {

    calenderFeatureLessonPage dc = new calenderFeatureLessonPage();

    @io.cucumber.java.en.Given("The student should be able to access the information of the relevant course")
    public void theStudentShouldBeAbleToAccessTheInformationOfTheRelevantCourse() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.calenderClick));
        dc.myClick(dc.calenderClick);
    }

    @io.cucumber.java.en.When("The student should be able to see the name of the course in the pop-up window")
    public void theStudentShouldBeAbleToSeeTheNameOfTheCourseInThePopUpWindow() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.matDers));
        dc.myClick(dc.matDers);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.closeWindow));
        dc.myClick(dc.closeWindow);
    }

    @io.cucumber.java.en.And("You should see in the pop-up window whether the lesson has started or not.")
    public void youShouldSeeInThePopUpWindowWhetherTheLessonHasStartedOrNot() {
        dc.myClick(dc.backButton);
    }

    @io.cucumber.java.en.Then("Student, published\\(P), started\\(S), or finished\\(E) information when clicking on a lesson should see the screen.")
    public void studentPublishedPStartedSOrFinishedEInformationWhenClickingOnALessonShouldSeeTheScreen() throws InterruptedException {
        dc.myClick(dc.spanishButton);
    }
}
