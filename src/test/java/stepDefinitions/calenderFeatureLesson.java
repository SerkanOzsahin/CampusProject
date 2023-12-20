package stepDefinitions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.calenderFeatureLessonPage;
import utilities.BD;

public class calenderFeatureLesson {
    calenderFeatureLessonPage dc=new calenderFeatureLessonPage();
    @io.cucumber.java.en.Given("The student should be able to access the information of the relevant course")
    public void theStudentShouldBeAbleToAccessTheInformationOfTheRelevantCourse() {
        BD.getDriver().get("https://test.mersys.io/");
        dc.mySendKeys(dc.username, "Student_4");
        dc.mySendKeys(dc.password, "S12345");
        dc.myClick(dc.loginBtn);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.calenderClick));
        dc.myClick(dc.calenderClick);


    }

    @io.cucumber.java.en.When("The student should be able to see the name of the course in the pop-up window")
    public void theStudentShouldBeAbleToSeeTheNameOfTheCourseInThePopUpWindow() {
     // dc.wait.until(ExpectedConditions.elementToBeClickable(dc.weeklyPlan));

       dc.myClick(dc.biologyDers);
       // Assert.assertTrue(true,"Course Meeting has not been started yet");

    }

    @io.cucumber.java.en.And("You should see in the pop-up window whether the lesson has started or not.")
    public void youShouldSeeInThePopUpWindowWhetherTheLessonHasStartedOrNot() {
    }

    @io.cucumber.java.en.Then("Student, published\\(P), started\\(S), or finished\\(E) information when clicking on a lesson should see the screen.")
    public void studentPublishedPStartedSOrFinishedEInformationWhenClickingOnALessonShouldSeeTheScreen() {
    }
}
