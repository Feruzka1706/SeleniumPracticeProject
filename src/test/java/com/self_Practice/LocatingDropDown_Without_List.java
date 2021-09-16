package com.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingDropDown_Without_List {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownLink=driver.findElement(By.linkText("Dropdown link"));
        dropdownLink.click();

        Thread.sleep(3000);

        WebElement itemGoogle=driver.findElement(By.linkText("Google"));
        itemGoogle.click();

        Thread.sleep(3000);
        driver.navigate().back();

        /*Thread.sleep(3000);

        dropdownLink.click();
        Thread.sleep(2000);

        WebElement itemAmazon= driver.findElement(By.linkText("Amazon"));
        itemAmazon.click();

         */



     driver.quit();

    }
}
