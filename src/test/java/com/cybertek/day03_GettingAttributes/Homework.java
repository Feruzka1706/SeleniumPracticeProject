package com.cybertek.day03_GettingAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://google.com");

        WebElement googleSearch=driver.findElement(By.name("btnK"));

        //get attribute class:
        System.out.println("googleSearch.getAttribute(\"class\") = "
                + googleSearch.getAttribute("class"));

        //get attribute type :
        System.out.println("googleSearch.getAttribute(\"type\") = "
                + googleSearch.getAttribute("type"));

        //get attribute value:
        System.out.println("googleSearch.getAttribute(\"value\") = "
                + googleSearch.getAttribute("value"));

        //get attribute aria-label
        System.out.println("googleSearch.getAttribute(\"aria-label\") = "
                + googleSearch.getAttribute("aria-label"));

        //get attribute data-ved
        System.out.println("googleSearch.getAttribute(\"data-ved\") = "
                + googleSearch.getAttribute("data-ved"));

        //get attribute name:
        System.out.println("googleSearch.getAttribute(\"name\") = "
                + googleSearch.getAttribute("name"));

        driver.quit();

    }
}
