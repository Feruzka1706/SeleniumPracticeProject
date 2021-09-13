package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPageTitle {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://cybertekschool.com");

        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);

        Thread.sleep(3000);
        driver.quit();
    }
}
