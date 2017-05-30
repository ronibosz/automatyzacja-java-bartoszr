package com.codesprinters.pos;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    private final String GECKO_PROPERTY_NAME ="webdriver.gecko.driver";
    private final String GECKO_PATH ="C:\\bin\\geckodriver-v0.16.1-win64\\geckodriver.exe";
    private final String FIREFOX_PROPERTY_NAME ="webdriver.firefox.bin";
    private final String FIREFOX_PATH ="C:\\Program Files\\Mozilla Firefox new\\firefox.exe";
    protected WebDriver driver;

    @Before
    public void init(){

        System.setProperty(GECKO_PROPERTY_NAME, GECKO_PATH);
        System.setProperty(FIREFOX_PROPERTY_NAME, FIREFOX_PATH);

        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void testTeardown(){
        if (driver!=null) {
            driver.quit();
        }
    }
}
