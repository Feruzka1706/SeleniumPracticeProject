package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementByLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://google.com");

        Thread.sleep(2000);

        WebElement aboutLink=driver.findElement(By.linkText("About"));
        Thread.sleep(2000);

        aboutLink.click();

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.close();


        System.out.println("===============================================================");

        WebDriver driver2 =new ChromeDriver();
        driver.navigate().to("https://www.yahoo.com/");

        Thread.sleep(2000);

        WebElement getLink= driver2.findElement(By.linkText("Get"));
        getLink.click();

        Thread.sleep(2000);

        driver2.quit();



    }
}
