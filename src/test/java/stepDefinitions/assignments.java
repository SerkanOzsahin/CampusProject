package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.assignmentsPage;
import utilities.BD;
import utilities.ConfigReader;

public class assignments {

    assignmentsPage sp = new assignmentsPage();

    @Given("The user achieves tasks")
    public void theUserAchievesTasks() {
        sp.myClick(sp.assignments);
        sp.myClick(sp.showAllButton);
    }

    @When("The user clicks on tasks")
    public void theUserClicksOnTasks() {
    }
}
//Since the assignments are empty,only the assignments can be clicked.