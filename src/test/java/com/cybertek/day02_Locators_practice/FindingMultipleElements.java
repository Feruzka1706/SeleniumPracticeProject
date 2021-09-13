package com.cybertek.day02_Locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingMultipleElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //get all the links that have partial text A in it
        List<WebElement> allLink = driver.findElements(By.partialLinkText("A"));

        //get the size of this list so we know many link with partial text A
        System.out.println("allLink.size() = " + allLink.size());

        //get the first item
        WebElement firstItem=allLink.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());
        System.out.println("allLink.get(1).getText() = " + allLink.get(1).getText());
        //System.out.println("secondItem.getText() = " + secondItem.getText());

        for(WebElement eachLink: allLink){
            System.out.println("allLink.get(eachLink).getText() = " + eachLink.getText());
        }

        driver.quit();
    }
}
