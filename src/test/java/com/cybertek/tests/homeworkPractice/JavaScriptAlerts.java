package com.cybertek.tests.homeworkPractice;

import com.cybertek.tests.test_Util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JavaScriptAlerts extends TestBase {

    @Test
    public void testAlert(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        // 1- way this one

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert confirmationAlert=driver.switchTo().alert();
        confirmationAlert.dismiss();
        //2-way to handle it with creating Alert Object

        WebElement promptAlert=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptAlert.click();

        driver.switchTo().alert().sendKeys("Practicing JS alerts");
        driver.switchTo().alert().accept();

        System.out.println("The end");
    }
}
