package com.treino.frameworks.utils;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.treino.frameworks.webdrivers.Browser;
import com.treino.frameworks.webdrivers.DriverFactory;
import com.treino.frameworks.webdrivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({ExtentITestListenerClassAdapter.class, Report.class})
public class TicketboxBaseTest extends DriverFactory {

    @BeforeMethod
    public void setUp() {
        driver = createBrowser(Browser.CHROME);
        DriverManager.setDriver(driver);
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.closeDriver();
    }


}
