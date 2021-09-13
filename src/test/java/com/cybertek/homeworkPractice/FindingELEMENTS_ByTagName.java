package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingELEMENTS_ByTagName {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        //finding elements byTagName is used less commonly

        WebElement firstLink= driver.findElement(By.tagName("a"));
        //finding one element by TagName
        System.out.println("firstLink.getText() = " + firstLink.getText());

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        for(WebElement eachElement : allLinks){

            System.out.println("eachElement.getText() = " + eachElement.getText());
        }

        Thread.sleep(2000);

        firstLink.click();
        Thread.sleep(3000);

        WebElement addRemoveLink= driver.findElement(By.partialLinkText("Add/Remove "));

        Thread.sleep(2000);
        addRemoveLink.click();

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);

        //driver.quit();

    }
}
