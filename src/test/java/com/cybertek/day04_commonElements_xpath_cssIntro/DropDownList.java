package com.cybertek.day04_commonElements_xpath_cssIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

        WebElement yearDropDownElement=driver.findElement(By.id("year"));
        //TODO: to make colorful comments :)

        Select yearSelectObj=new Select(yearDropDownElement);
        //TODO: Selecting objects with 3 diff ways

        // Select 3rd item
        yearSelectObj.selectByIndex(2);

        // Select item with value attribute 2000
        yearSelectObj.selectByValue("2000");

        // Select item with visible text 1990
        yearSelectObj.selectByVisibleText("1990");

        //it will throw exception if you have wrong option
        //yearSelectObj.selectByVisibleText("Bla Bla Bla");

        WebElement monthDropdown=driver.findElement(By.id("month"));

        Select monthSelectObject=new Select(monthDropdown);

        monthSelectObject.selectByIndex(4);
        monthSelectObject.selectByValue("7");
        monthSelectObject.selectByVisibleText("December");


     driver.quit();
    }
}
