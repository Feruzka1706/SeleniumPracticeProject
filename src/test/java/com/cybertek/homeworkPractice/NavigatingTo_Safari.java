package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigatingTo_Safari {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver=new SafariDriver();

        driver.get("https://google.com/");

        Thread.sleep(3000);

        driver.quit();

    }
}
