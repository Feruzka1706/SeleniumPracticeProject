package com.cybertek.day02_Locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();

        driver.navigate().to("http://zero.webappsecurity.com/");

        driver.manage().window().maximize();

        String title=driver.getTitle();
        System.out.println(title);

        if(title.equals("Zero - Personal Banking - Loans - Credit Cards")){
            System.out.println("Actual result is matching, current homepage title is: "+title);
        }else{
            System.out.println("Expected result is not matching, actual title is: "+title);
            driver.get("http://zero.webappsecurity.com/");
        }

        Thread.sleep(2000);

        WebElement sigInBtn= driver.findElement(By.id("signin_button"));
        sigInBtn.click();

        String loginTitle=driver.getTitle();

        if(loginTitle.equals("Zero-Log in")){
            System.out.println("Requirement is matching with actual result");
        }else {
            System.out.println("Actual result iw not matching, current login page title is: "+loginTitle);
            //driver.navigate().back();
        }

        WebElement usernameBox=driver.findElement(By.id("user_login"));
        usernameBox.sendKeys("username");

        Thread.sleep(2000);

        WebElement passwordBox= driver.findElement(By.id("user_password"));
        passwordBox.sendKeys("password");

        WebElement submitBtn=driver.findElement(By.name("submit"));
        submitBtn.click();

        Thread.sleep(2000);

        WebElement advancedBtn=driver.findElement(By.id("details-button"));
        advancedBtn.click();
        Thread.sleep(2000);

        WebElement proceedBtn=driver.findElement(By.partialLinkText("Proceed to zero."));
        proceedBtn.click();

        String accountSumTitle=driver.getTitle();
        if(title.equals("Zero - Account Summary")){
            System.out.println("Result is matching with requirement");
        }else {
            System.out.println("Actual result didn't match with the requirement, curren Account Summary page title is: "+title);
        }

        Thread.sleep(2000);

        WebElement accountActivity=driver.findElement(By.linkText("Account Activity"));
        accountActivity.click();

        Thread.sleep(3000);

        for (int i = 1; i <3; i++) {
            driver.navigate().back();
            Thread.sleep(2000);
        }

       // driver.quit();



    }
}

/*
 open chrome and navigate to http://zero.webappsecurity.com/
2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
3. click on `sign in button`
4. verify the title is "Zero- Log in"
5. enter text as "username" into username box
6. enter text "password" into password box
7. submit by clicking login button
8. verify you are at "Zero - Account Summary" page by checking title
9. now use your imagination to play around here and explore ,
automate within the capacity we already have so far.

 */