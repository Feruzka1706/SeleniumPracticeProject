package com.cybertek.day05_CSS_Selectors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        /**
         * input[name='email']
         *  form input[name='email']
         *  #forgot_password input[name='email']
         * form#forgot_password input[name='email']
         */


        WebElement emailBox=driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("someone@somewhere.com");

        Thread.sleep(3000);
        /**
         * #form_submit
         * button#form_submit
         * button#form_submit.radius
         * button[id='form_submit'][class='radius']
         */
        WebElement retrieveBtn=driver.findElement(By.cssSelector("#form_submit"));
        retrieveBtn.click();

        Thread.sleep(3000);

        //identify the success message and print out the text
        /**
         * h4[name='confirmation_message']
         * div > h4[name='confirmation_message']
         * div#content > h4[name='confirmation_message']

         */
        WebElement confMessage=driver.findElement(By.cssSelector("h4[name='confirmation_message']"));
        System.out.println("confMessage.getText() = " + confMessage.getText());


        driver.quit();
    }
}
