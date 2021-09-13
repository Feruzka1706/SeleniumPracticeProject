package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

public class FindingElementByName {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://google.com");
        Thread.sleep(2000);

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        Thread.sleep(2000);

        WebElement searchBtn=driver.findElement(By.name("btnK"));
        searchBtn.submit();//submitting form

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(4000);

        driver.quit();


    }
}
