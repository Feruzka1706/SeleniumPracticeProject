package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();


        //1. Open Chrome and Navigate to https://facebook.com
        driver.get("https://facebook.com");


        WebElement username=driver.findElement(By.id("email"));
        Thread.sleep(2000);
        //2. Enter username `invalid username` into username box
        username.sendKeys("abc@gmail.com");

        Thread.sleep(3000);
        WebElement password= driver.findElement(By.name("pass"));

        //3. Enter password `some password` password box
        password.sendKeys("Blahblah@17");

        Thread.sleep(3000);
        WebElement login=driver.findElement(By.name("login"));

        //4. Click on the Login button and wait few seconds until error comes back
        login.click();
        //Thread.sleep(3000);

       //5. Navigate back to login screen
        //driver.navigate().back();
        Thread.sleep(3000);
        WebElement forgetPassword=driver.findElement(By.linkText("Forgot Password?"));

       // 6. Click on `forget password` link
        forgetPassword.click();
        Thread.sleep(3000);

        WebElement mobileNumber=driver.findElement(By.id("identify_email"));

       // 7. Enter `something` into Mobile number text box `123456789`
        mobileNumber.sendKeys("123456789");

        //  8. Click on the search button
        WebElement searchBtn =driver.findElement(By.name("did_submit"));
        searchBtn.click();

        Thread.sleep(3000);


        //9. Click on the cancel button
        WebElement cancel=driver.findElement(By.linkText("Cancel"));
        Thread.sleep(2000);
        cancel.click();

        Thread.sleep(2000);

        //10. Quit the browser
        driver.close();



    }
}
/*
1. Open Chrome and Navigate to https://facebook.com
2. Enter username `invalid username` into username box
3. Enter password `some password` password box
4. Click on the Login button and wait few seconds until error comes back
5. Navigate back to login screen
6. Click on `forget password` link
7. Enter `something` into Mobile number text box `123456789`
8. Click on the search button
9. Click on the cancel button
10. Quit the browser
 */