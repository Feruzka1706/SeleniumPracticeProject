package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_File {
    public static void main(String[] args) {


        //set up chrome driver, open chrome browser
        WebDriverManager.chromedriver().setup();

        //navigate to that html file using that path you copied from the browser
        WebDriver driver=new ChromeDriver();

        // file:///Users/feruzajonzokova/Desktop/HTML_class/Day2.html
        driver.get("file:///Users/feruzajonzokova/Desktop/HTML_class/Day2.html");


        //close the browser
        driver.quit();


    }
}
