package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsOverview {
    public static void main(String[] args)throws InterruptedException {

        //By.id();
        //By.name();
        //By.linkText();
        //By.partialLinkText();
        //By.tagName();
        //By.className();
        //By.cssSelector();
        //By.xPath();

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://yahoo.com");
        WebElement inputBox=driver.findElement(By.id("ybar-sbq"));
        inputBox.sendKeys("Hello");

        WebElement clickBtn=driver.findElement(By.id("ybar-search"));
        clickBtn.click();
        Thread.sleep(3000);

       String pageTitle=driver.getTitle();
        System.out.println(pageTitle);

        Thread.sleep(3000);

        driver.quit();



    }
}
