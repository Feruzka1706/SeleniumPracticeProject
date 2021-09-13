package com.cybertek.day04_commonElements_xpath_cssIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCSSSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("https://search.yahoo.com/");

        //TODO: Identify searchbox using CSS selector
        //try different way, by id, by name

       // WebElement searchBox=driver.findElement(By.cssSelector("#yschsp"));
        //WebElement searchBox=driver.findElement(By.cssSelector("input[name='p']"));
        //WebElement searchBox=driver.findElement(By.cssSelector("input[id='yschsp']"));
        WebElement searchBox=driver.findElement(By.cssSelector("input[name='p'][type='text'] "));

        searchBox.sendKeys("CSS SELECTOR");

        Thread.sleep(2000);
       //the x icon
        WebElement clearIcon =driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();
        searchBox.sendKeys("XPATH");


        WebElement searchIcon=driver.findElement(By.cssSelector("span[title='Search']"));
        searchIcon.click();


        //driver.quit();





    }
}
