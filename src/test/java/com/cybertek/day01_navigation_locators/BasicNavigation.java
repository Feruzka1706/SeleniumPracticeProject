package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) {
        //set up chrome driver
        WebDriverManager.chromedriver().setup();
        //it will do download or set up for me

        //create ChromeDriver Object
        WebDriver driver =new ChromeDriver();

        //navigate to https://yahoo.com
        driver.get("https://amazon.com");
        /*
        there is two ways to navigate:
            -get("url");
            -navigate().to("url");
            -navigate().back();
            -navigate().forward();
            -navigate().refresh();
         */
        //navigate().to("url");
        driver.navigate().to("https://google.com");

        //navigate().back();
        driver.navigate().back();
        //navigate().forward();
        driver.navigate().forward();

        //closing browser
        /*
        * close() method, will close current tab
        * quit() method, will close all tabs if there is more than one
        */
        //driver.close();
        driver.quit();



    }
}
