package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BD;

public class Hooks {

    @Before
    public void before() {
        System.out.println("Scenario Started : ");
    }

    @After
    public void after() {
        BD.getDriver().quit();
    }
}
