package com.cybertek.tests.day06_junit_practice_utilityMethods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait()  {
    //  //button[text()='Add']  << Add button

      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        //Thread.sleep(5000);

        WebElement goneText=driver.findElement(By.id("message"));
        System.out.println("goneText.getText() = " + goneText.getText());

        System.out.println("THE END");
    }
}
