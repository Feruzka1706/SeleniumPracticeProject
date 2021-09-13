package com.cybertek.day03_GettingAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElement_By_TagName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        /*
        * Purple= tag name
        * Orange = attribute name
        * Blue = attribute value
        * Black = Text
         */

        WebElement firstLink =driver.findElement(By.tagName("a"));
        //first matching element we will get on that case

        System.out.println("firstLink.getText() = " + firstLink.getText());

        List<WebElement> allATagElements= driver.findElements(By.tagName("a"));

        System.out.println("allATagElements.size() = " + allATagElements.size());

        for(WebElement eachElement : allATagElements){
            System.out.println("eachElement.getText() = " + eachElement.getText());
            System.out.println("eachElement.getAttribute(\"href\") = "
                    + eachElement.getAttribute("href"));
        }

        //get first element with <h1> and get the text out of it

        WebElement firstH1TagElement =driver.findElement(By.tagName("h1"));
        System.out.println("firstH1TagElement.getText() = " + firstH1TagElement.getText());

        driver.quit();

    }
}
