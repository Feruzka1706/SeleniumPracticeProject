package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebOrderLoginTests extends TestBase {



    /**
     *  1. `testLoginWithCorrectCredentials`
     *        1. go to login page
     *        2. login with correct credentials
     *        3. `verify` you are at `all order page`
     *        4. `verify` Welcome message beside `logout` link contains the login `username`
     *
     */
    @Test
    public void webOrderLoginTests(){
        WebOrderUtility.openWebOrderApp();
        BrowserUtil.waitFor(2);
        WebOrderUtility.login();
        BrowserUtil.waitFor(2);
        assertTrue( WebOrderUtility.isAtOrderPage() );
        assertTrue( WebOrderUtility.verifyUserName("Tester") );

    }


    /**
     * 2. `testLoginWithInvalidCredentials`
     *       1. go to login page
     *       2. login with invalid credentials
     *       3. `verify` you are still at login page
     *       4. `verify` the error message `Invalid Login or Password.` displayed on the screen
     *
     */

    @Test
    public void testLoginWithInvalidCredentials(){
        WebOrderUtility.openWebOrderApp();
        BrowserUtil.waitFor(2);
        WebOrderUtility.login("Feruza","kuku");
        BrowserUtil.waitFor(2);
        assertFalse( WebOrderUtility.isAtOrderPage() );
        BrowserUtil.waitFor(2);
        WebElement invalidMsg=Driver.getDriver().findElement(By.id("ctl00_MainContent_status"));
        assertTrue(invalidMsg.isDisplayed());
        assertEquals(invalidMsg.getText(),"Invalid Login or Password.");
        //Optional
        System.out.println(invalidMsg.getText());


    }













}
