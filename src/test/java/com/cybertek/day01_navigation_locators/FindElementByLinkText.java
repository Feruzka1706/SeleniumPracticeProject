package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {

    public static void main(String[] args) throws InterruptedException{
        // set up chrome driver , open chrome
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        // navigate to https://google.com
        driver.navigate().to("https://google.com");//or driver.get("url");

        WebElement searchBox=driver.findElement(By.name("q"));

        searchBox.sendKeys("Everything is OSON");

        WebElement searchBtn=driver.findElement(By.name("btnK"));
        searchBtn.submit();

        driver.navigate().back();
        Thread.sleep(3000);

        WebElement aboutLink=driver.findElement(By.linkText("About") );
        aboutLink.click();

        // try to identify search box using both name and id


    }








    // submit the search by clicking on the search button

    // navigate back to google home page

    // wait few second

    // click on about link


    // wait few seconds

    // close the browser

}
