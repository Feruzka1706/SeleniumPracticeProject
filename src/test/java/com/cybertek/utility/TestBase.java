package com.cybertek.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public  abstract class TestBase {

    protected WebDriver driver;


    @BeforeEach
    public void setUpWebDriver() {

        driver=Driver.getDriver();
       // driver=WebDriverFactory.getDriver("chrome");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterEach
    public void closeBrowser(){
        //quit browser + make it null so we can get new one when we ask for it again
       Driver.closeBrowser();
    }

}
