package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BD;
import utilities.DialogContent;

import java.sql.Driver;
import java.time.Duration;

public class Login {

  DialogContent dc = new DialogContent();

  @Given("Navigate to Campus")
  public void navigate_to_campus() {
    BD.getDriver().get("https://test.mersys.io/");
  }
  @When("Enter username and password and click login button")
  public void enter_username_and_password_and_click_login_button() {

     WebDriverWait wait =new WebDriverWait(BD.getDriver(), Duration.ofSeconds(20));
     wait.until(ExpectedConditions.visibilityOf(dc.username));

    dc.username.click();
    dc.username.sendKeys("Student_4 ");
    dc.password.click();
    dc.password.sendKeys("S12345");
    dc.loginButton.click();

  }

}
