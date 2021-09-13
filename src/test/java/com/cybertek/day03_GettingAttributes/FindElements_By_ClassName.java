package com.cybertek.day03_GettingAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements_By_ClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/");

        WebElement element1=driver.findElement(By.className("h1y"));

        System.out.println("element1.getText() = " + element1.getText());

        WebElement firstLiItem= driver.findElement(By.className("list-group-item"));
        System.out.println("firstLiItem.getText() = " + firstLiItem.getText());

        List<WebElement> allLiItems=driver.findElements(By.className("list-group-item"));
        System.out.println("allLiItems.size() = " + allLiItems.size());

        for(WebElement eachLiItem : allLiItems){
            System.out.println("eachLiItem.getText() = " + eachLiItem.getText());
        }

        driver.quit();
    }
}
