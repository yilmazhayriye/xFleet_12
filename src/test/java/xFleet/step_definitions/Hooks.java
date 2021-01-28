package xFleet.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import xFleet.utilities.Driver;

public class Hooks {


    @Before
    public void setUp(){

        System.out.println("this is coming from Before");
    }
    @After

    public void tearDown(){

        Driver.closeDriver();
    }
}
