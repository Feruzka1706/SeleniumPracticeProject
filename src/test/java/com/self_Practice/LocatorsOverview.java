package com.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsOverview {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://learn.cybertekschool.com/");

        /*
        <<< LOCATORS in SELENIUM >>>
        --By.id  --> most unique
        --By.name  --> popular to use in forms
        --By.linkText
        --By.partialLinkText
        --By.tagName
        --By.className
        --By.cssSelector
        --By.xPath
         */

        WebElement userNameBox=driver.findElement(By.id("okta-signin-username"));
         userNameBox.sendKeys("feruzka1706@gmail.com");


    }
}
