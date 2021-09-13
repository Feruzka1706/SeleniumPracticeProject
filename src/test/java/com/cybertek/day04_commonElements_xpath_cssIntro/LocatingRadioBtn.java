package com.cybertek.day04_commonElements_xpath_cssIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioBtn {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com/radio_buttons");


        WebElement blueRadioBtn=driver.findElement(By.id("blue"));

        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());

        System.out.println("blueRadioBtn.getAttribute(\"checked\") = "
                + blueRadioBtn.getAttribute("checked"));//true because it's already selected

        blueRadioBtn.click();//nothing will happen because it's already selected

        WebElement redRadioBtn=driver.findElement(By.id("red"));

        System.out.println(" before redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
        redRadioBtn.click();

        System.out.println(" after redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());


        WebElement greenRadio =driver.findElement(By.id("green"));
        greenRadio.click();
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());

        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        System.out.println( !greenRadio.isEnabled());

        List<WebElement> allRadioButtons= redRadioBtn.findElements(By.name("color"));
        System.out.println("allRadioButtons.size() = " + allRadioButtons.size());

        allRadioButtons.get(2).click();

        for(WebElement eachRadioBtn : allRadioButtons){
            System.out.println("eachRadioBtn.getAttribute(\"id\") = "
                    + eachRadioBtn.getAttribute("id"));
            System.out.println("eachRadioBtn.isSelected() = " + eachRadioBtn.isSelected());
            System.out.println("eachRadioBtn.isEnabled() = " + eachRadioBtn.isEnabled());
        }

        driver.quit();


    }
}
