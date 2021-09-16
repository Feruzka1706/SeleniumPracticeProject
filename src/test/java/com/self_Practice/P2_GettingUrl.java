package com.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_GettingUrl {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://google.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        System.out.println("====================================================");
        System.out.println("driver.getPageSource() = " + driver.getPageSource());

        driver.quit();

    }
}
