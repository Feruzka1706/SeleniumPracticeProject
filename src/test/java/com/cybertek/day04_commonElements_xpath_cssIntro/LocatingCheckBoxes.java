package com.cybertek.day04_commonElements_xpath_cssIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) {

        //checkboxes can be checked and unchecked
        //that's the only attribute special about the element
        //we can use additional method called isSelected() to determine if it's checked

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

        System.out.println("checkBox1.getAttribute(\"checked\") = "
                + checkBox1.getAttribute("checked"));

        WebElement checkbox2= driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        System.out.println("checkbox2.getAttribute(\"checked\") = "
                + checkbox2.getAttribute("checked"));

        if(! checkBox1.isSelected()){
            checkBox1.click();
        }else {
            System.out.println("Take it easy, it's already checked checkbox1");
        }

        if(! checkbox2.isSelected()){
            checkbox2.click();
        }else {
            System.out.println("Take it easy, it's already checked checkbox2");
        }


        driver.quit();


    }
}
