package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.weeklyLessonPage;

public class weeklyLesson {
    weeklyLessonPage lp=new weeklyLessonPage();
    @Given("The user accesses weekly lesson schedule")
    public void theUserAccessesWeeklyLessonSchedule() {
        lp.myClick(lp.calendarButton);
        lp.myClick(lp.biology);
        lp.myClick(lp.closeButton);
    }

    @When("The user clicks on the weekly course plan")
    public void theUserClicksOnTheWeeklyCoursePlan() {
        lp.myClick(lp.previousButton);
        lp.wait.until(ExpectedConditions.elementToBeClickable(lp.todayButton));
        lp.myClick(lp.todayButton);
        lp.myClick(lp.nextButton);
        lp.myClick(lp.weeklyCoursePlan);
    }
}

