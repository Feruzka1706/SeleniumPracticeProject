package com.cybertek.utility;

import com.cybertek.tests.day09_ExplicitWait.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public  abstract class TestBase {

    protected WebDriver driver;


    @BeforeEach
    public void setUpWebDriver() {

        Driver.getDriver();
       // driver=WebDriverFactory.getDriver("chrome");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterEach
    public void closeBrowser(){
        Driver.getDriver().quit();
    }

}
