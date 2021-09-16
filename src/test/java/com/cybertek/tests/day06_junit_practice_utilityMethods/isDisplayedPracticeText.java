package com.cybertek.tests.day06_junit_practice_utilityMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class isDisplayedPracticeText {
    WebDriver driver;

    @BeforeAll
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpWebDriver() {
        driver = new ChromeDriver();
    }
    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    //navigate to the form page
    //identify the error message exists but not displayed
    //enter text "a" and check the error message displayed

    @Test
    public void testErrorMessage(){

        driver.get("http://practice.cybertekschool.com/registration_form");
       String  errorMsg="//small[text()='first name must be more than 2 and less than 64 characters long']";
        WebElement strErrorMessage=driver.findElement(By.xpath(errorMsg));
        //assertTrue( ! strErrorMessage.isDisplayed());
        assertFalse( strErrorMessage.isDisplayed());

        System.out.println("strErrorMessage.isDisplayed() = " + strErrorMessage.isDisplayed());

        WebElement inputFirstName=driver.findElement(By.name("firstname"));
        inputFirstName.sendKeys("a");

        System.out.println("strErrorMessage.isDisplayed() = " + strErrorMessage.isDisplayed());
        assertTrue( strErrorMessage.isDisplayed());
    }

}
