package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

public class FindingElementByPartialLinkText {
    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        WebElement giftLink=driver.findElement(By.partialLinkText("These creative things"));

        Thread.sleep(2000);
        giftLink.click();

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);
        driver.quit();




    }
}
