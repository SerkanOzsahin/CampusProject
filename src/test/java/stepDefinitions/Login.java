package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BD;
import utilities.DialogContent;

import java.time.Duration;

public class Login {

  DialogContent dc = new DialogContent();

  @Given("Attend to Campus Page")
  public void attend_to_campus_page() {
    BD.getDriver().get("https://test.mersys.io/");
  }
  @When("Enter username and password")
  public void enter_username_and_password() {

     WebDriverWait wait =new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));
     wait.until(ExpectedConditions.visibilityOf(dc.username));

    dc.username.click();
    dc.username.sendKeys("Student_4 ");
    dc.password.click();
    dc.password.sendKeys("S12345");
    dc.loginButton.click();

  }

}
