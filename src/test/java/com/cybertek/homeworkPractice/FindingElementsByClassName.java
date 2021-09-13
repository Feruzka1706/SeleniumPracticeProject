package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingElementsByClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("http:////practice.cybertekschool.com/");
        //we will get the first matching element by using By.className

        WebElement element= driver.findElement(By.className("h1y"));
        System.out.println("firstElement.getText() = " + element.getText());

        WebElement firstElement=driver.findElement(By.className("list-group-item"));
        System.out.println(firstElement.getText());

        List<WebElement> allLinks=driver.findElements(By.className("list-group-item"));
        //finding elements By.className will get all matching elements from the page
        System.out.println("allLinks.size() = " + allLinks.size());


        driver.quit();
    }
}
