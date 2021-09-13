package com.cybertek.day04_commonElements_xpath_cssIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_ByXPath_Intro {

   //    inspect element--> right click --> copy --> copy full xpath
    //    /html/body/div/div[2]/div/div/div/h1/span
    //XPath can be used to navigate through elements and attributes in a html document

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        WebElement headerSpan =driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        WebElement headerSpan2=driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

        //driver.quit();

        //  /html/body/div/div[2]/div/form/span[1]  full XPath
        // //*[@id="box1"]

        driver.findElement(By.xpath("//li/a [text() = 'Checkboxes'] ")).click();

        WebElement header =driver.findElement(By.xpath("//h3[text () ='Checkboxes']"));
        System.out.println("header.getText() = " + header.getText());

        WebElement firstCheckbox=driver.findElement(By.xpath("//input[@id='box1']"));

        driver.quit();



    }

}
