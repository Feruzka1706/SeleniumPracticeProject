package com.cybertek.day02_Locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetTextMessage {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/");

        //identify the link with text "Disappearing Elements"
        //using partial link text then get the full text out using new method getText

        WebElement myLink= driver.findElement(By.partialLinkText("Disappearing"));

        //System.out.println("myLink.getText() = " + myLink.getText());

        String fullLinkText= myLink.getText();
        System.out.println(fullLinkText);

        //what if I just provide partial link as letter A
        WebElement aLink=driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());

    }
}
