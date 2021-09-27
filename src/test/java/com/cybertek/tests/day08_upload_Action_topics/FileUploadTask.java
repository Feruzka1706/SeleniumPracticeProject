package com.cybertek.tests.day08_upload_Action_topics;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class FileUploadTask extends TestBase {

    @Test
    public void testFileUpload()  {
        driver.get("http://practice.cybertekschool.com/upload");

        WebElement inputField=driver.findElement(By.cssSelector("input[id='file-upload'] "));
        //By.id("file-upload")
        //By.xpath("//input[@id='file-upload']")


        //find the full  path of your file in your computer and send key into above input field

        String filePath="/Users/feruzajonzokova/Desktop/Background_Pictures/background2.webp";
        inputField.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

       // Thread.sleep(3000);
        BrowserUtil.waitFor(2);

        //Success message page: //h3[.='File Uploaded!']
        WebElement successMsg=driver.findElement(By.xpath("//h3[.='File Uploaded!']"));

        assertTrue( successMsg.isDisplayed() );

        // Thread.sleep(2000); is needed sometimes , but we are forced to deal with checked exception
        // objective : have a human-readable utility method so we can call like this
        //  BrowserUtil.waitFor(2) ; === >> no exception handling just wait for 2 seconds
        //  Create a class called BrowserUtil under utility package
        //  create a static void method called waitFor accept int as second to wait
    }
}
