package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.weeklyLessonPage;
import utilities.BD;
import utilities.ConfigReader;

public class weeklyLesson {
    weeklyLessonPage lp = new weeklyLessonPage();

    @Given("The user accesses weekly lesson schedule")
    public void theUserAccessesWeeklyLessonSchedule() {
        BD.getDriver().get("https://test.mersys.io/");
        lp.mySendKeys(lp.username, ConfigReader.getProperty("username"));
        lp.mySendKeys(lp.password, ConfigReader.getProperty("password"));
        lp.myClick(lp.loginButton);
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
