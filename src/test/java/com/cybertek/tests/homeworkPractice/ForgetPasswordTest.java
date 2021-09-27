package com.cybertek.tests.homeworkPractice;

import com.cybertek.tests.test_Util.TestBase;
import com.cybertek.utility.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ForgetPasswordTest extends TestBase {


    @Test
    public void testForgetPassword() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("someone@somewhere.com"+ Keys.ENTER);
        Thread.sleep(2000);
        String currentUrl=driver.getCurrentUrl();

        assertTrue( currentUrl.endsWith("email_sent") );

    }
}
