package com.cybertek.tests.test_Util;

import com.cybertek.utility.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {

    public WebDriver driver; //or protected

    @BeforeEach
    public void setUpBrowser(){
        driver= WebDriverFactory.getDriver("chrome");
        //we can switch to firefox or any other browsers easily
    }

    @AfterEach
    public void closeBrowser(){
        driver.close();
    }
}
