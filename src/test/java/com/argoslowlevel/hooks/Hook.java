package com.argoslowlevel.hooks;

import com.argoslowlevel.driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setUp() {
        driverFactory.openBrowser();
    }

    @After
    public void tearDown() {
        driverFactory.close();
    }

}
