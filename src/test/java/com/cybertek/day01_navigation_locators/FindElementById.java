package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        //locate search box and enter selenium
        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));

        //enter the search button and click (or submit)
        searchBox.sendKeys("Selenium");




        //locate search button anc click (or submit)
        WebElement searchButton=driver.findElement(By.id("ybar-search") );
       // searchButton.click();
        searchButton.submit();//only work with button in the form !!!!

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //quit browser
        driver.quit();

    }
}
