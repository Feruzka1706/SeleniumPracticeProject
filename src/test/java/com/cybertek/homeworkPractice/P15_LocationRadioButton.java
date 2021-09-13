package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_LocationRadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");


        WebElement blueRadioBtn=driver.findElement(By.id("blue"));
        System.out.println("blueRadioBtn.isSelected() = "
                + blueRadioBtn.isSelected());

        blueRadioBtn.click();

        WebElement redRadioBtn=driver.findElement(By.id("red"));
        System.out.println("redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        redRadioBtn.click();

    }
}
