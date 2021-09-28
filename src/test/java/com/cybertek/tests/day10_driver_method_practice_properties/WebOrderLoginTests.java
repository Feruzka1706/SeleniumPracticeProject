package com.cybertek.tests.day10_driver_method_practice_properties;

import com.cybertek.utility.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        assertEquals("Web Orders",driver.getTitle());
        assertTrue( WebOrderUtility.isAtOrderPage() );
        assertTrue( WebOrderUtility.verifyUserName("Tester") );
        System.out.println(WebOrderUtility.getUserNameFromWelcomeMessage());
        assertEquals("Tester",WebOrderUtility.getUserNameFromWelcomeMessage() );

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
        //BrowserUtil.waitFor(2);
       // assertFalse( WebOrderUtility.isAtOrderPage() );
       // BrowserUtil.waitFor(2);
        WebElement invalidMsg= Driver.getDriver().findElement(By.id("ctl00_MainContent_status"));
        //assertTrue(invalidMsg.isDisplayed());
        //assertEquals(invalidMsg.getText(),"Invalid Login or Password.");

        //check for element exists using the browser util we just created
       assertTrue(WebOrderUtility.loginErrorMsgVisible());
        //Optional
        System.out.println(invalidMsg.getText());


    }

    @Test
    public void testClearInputBox(){
        WebOrderUtility.openWebOrderApp();
        WebElement usernameField=driver.findElement(By.id("ctl00_MainContent_username"));
        usernameField.sendKeys("ASKJDHASKJDHASKJDHAKJSHDAKSJHD");
        BrowserUtil.waitFor(2);
        //usernameField.clear(); // remove anything inside input element
        //You also can use action class to COMMAND+A and Press BACK_SPACE to delete
        //also you can run JavaScript code like this
        //theInputElement.value="" ;
        BrowserUtil.waitFor(2);

    }


    @Test
    public void demonstratingBrowserCloseIssue(){
        WebOrderUtility.openWebOrderApp();
        //Driver.getDriver().quit();

        Driver.getDriver().get("https://google.com");
    }


    public static class SeleniumWithProperties extends TestBase {

        @Test
        public void testWebOrderLogin(){

            //use ConfigReader everywhere
            String url= ConfigReader.read("weborder_url");
            String username=ConfigReader.read("weborder_username");
            String password=ConfigReader.read("weborder_password");

            System.out.println("url = " + url);
            System.out.println("username = " + username);
            System.out.println("password = " + password);
            //navigate using configurator by passing value you got from properties file
            //Driver.getDriver().get(url);
            //if you wan to directly use the reurned value instead of saving it
            Driver.getDriver().get(ConfigReader.read("url"));
            //WebOrderUtility.openWebOrderApp();
            WebOrderUtility.login(username,password);

            System.out.println("END");
        }

    }
}
