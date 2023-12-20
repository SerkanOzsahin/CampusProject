package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.GradingPage;

public class Grading {

    GradingPage gp = new GradingPage();

    @When("The student clicks on Grading")
    public void theStudentClicksOnGrading() {
        gp.wait.until(ExpectedConditions.visibilityOf(gp.gradingButton));
        gp.myClick(gp.gradingButton);
    }

    @Then("The student should see course grades and transcripts")
    public void theStudentShouldSeeCourseGradesAndTranscripts() {
        gp.wait.until(ExpectedConditions.visibilityOf(gp.courseGrade));
        gp.myClick(gp.courseGrade);
        gp.verifyContainsText(gp.courseNameText, "Course Name");
        gp.myClick(gp.studentTranscript);
        gp.verifyContainsText(gp.courseCodeText, "Course Code");
        gp.myClick(gp.subjectTranscript);
        gp.verifyContainsText(gp.subjectText, "Subject");
    }
}
