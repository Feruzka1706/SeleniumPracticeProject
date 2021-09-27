package com.cybertek.tests.day06_junit_practice_utilityMethods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPracticeTest extends TestBase {
   //  regular(ok), confirm(ok and cancel), prompt(enter text)
    @Test
    public void testJavaScriptaAert() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        //driver first need to switch to the alert box since it's not part of html
        //.alert() method return a type Alert from Selenium
        //and it has 4 type of methods:
        //~ accept() -->> click ok button
        // ~ dismiss() --> click on cancel button
        //~ sendKey( yourText ) --> Enter text into prompt
        //- getText() -->> get the text of the alert box

        System.out.println("getting the text of alert = "
                + driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();


       // Alert alertObj=driver.switchTo().alert();
        //alertObj.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        driver.switchTo().alert().dismiss();
        //this will click on dismiss button on the confirmation box


        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("Hello");
        //this is how we can enter text into prompt

        driver.switchTo().alert().accept();

        Thread.sleep(2000);

        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("message.getText() = " + message.getText());
        //


        System.out.println("THE END");

    }

}
