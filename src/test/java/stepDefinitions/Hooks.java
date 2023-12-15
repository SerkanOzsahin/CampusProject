package stepDefinitions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.BD;

public class Hooks {

    @BeforeClass
    public void before() {
        System.out.println("Scenario Started : ");
    }

    @AfterClass
    public void after() {
        BD.getDriver().quit();
    }
}
