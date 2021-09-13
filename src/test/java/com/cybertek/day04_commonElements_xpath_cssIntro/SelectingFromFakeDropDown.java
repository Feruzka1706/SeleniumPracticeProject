package com.cybertek.day04_commonElements_xpath_cssIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromFakeDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

        //the only way that Select class we learned work is, if the element tag is selected
        WebElement fakeDropDown = driver.findElement(By.id("dropdownMenuLink"));
        fakeDropDown.click();

        //and select the options --it's actually another link, identify and click on it
        //identify option Google and click on it

        driver.findElement(By.linkText("Google")).click();

        //WebElement itemId=driver.findElement(By.id(i))


    }
}
