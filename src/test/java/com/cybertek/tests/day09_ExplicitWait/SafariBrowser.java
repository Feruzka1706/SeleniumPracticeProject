package com.cybertek.tests.day09_ExplicitWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {

    @Test
    public void testSafari(){
        WebDriverManager.safaridriver().setup();
        WebDriver driver =new SafariDriver();

        driver.get("https://google.com");
    }
}
