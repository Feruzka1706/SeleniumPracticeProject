package com.cybertek.day04_commonElements_xpath_cssIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

        WebElement langDropDownElement=driver.findElement(By.name("Languages"));

        Select langSelectObject=new Select(langDropDownElement);

        System.out.println("langSelectObject.isMultiple() = " + langSelectObject.isMultiple());
        langSelectObject.selectByIndex(2);
        langSelectObject.selectByValue("c");
        langSelectObject.selectByVisibleText("Java");
        //at this moment selected 3 options at the same time


        //now deselect
        /*
        langSelectObject.deselectByIndex(2);
        langSelectObject.deselectByValue("c");
        langSelectObject.deselectByVisibleText("java");

        //deselect all
        langSelectObject.deselectAll();

         */



    }
}
