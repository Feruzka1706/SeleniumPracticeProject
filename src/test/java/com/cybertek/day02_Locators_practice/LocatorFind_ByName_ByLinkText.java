package com.cybertek.day02_Locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFind_ByName_ByLinkText {
    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //click on first link "A/B Testing"
        //WebElement firstLink= driver.findElement(By.linkText("A/B Testing"));
        //firstLink.click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("A/B Testing")).click();
        Thread.sleep(2000);

        //navigate back to home page
        driver.navigate().back();
        Thread.sleep(2000);

        //maximize the screen here
        driver.manage().window().maximize();

        //click on second link
        Thread.sleep(2000);
        WebElement secondLink=driver.findElement(By.partialLinkText("Add/Remove"));
        secondLink.click();

        Thread.sleep(2000);

        //click on "Home" link to go back homepage
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(2000);


        //click on "Redirect Link"
        driver.findElement(By.linkText("Redirect Link")).click();


        //close browser
        //driver.close();




    }
}
