package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.BD;

@CucumberOptions(
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RunnerParalell extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserType")
    public void beforeClass(String browserName) {
        BD.threadBrowserName.set(browserName);
    }
}
