package com.cybertek.tests.day06_junit_practice_utilityMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class LoginFormPracticeTest {
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

    @Test
    public void testLogin(){

        driver.get("http://practice.cybertekschool.com/login");

        WebElement header=driver.findElement(By.xpath("//h2[.='Login Page']"));
        System.out.println("Header of the page = " + header.getText());

       driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");


        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();

        WebElement successMsg=driver.findElement(By.xpath("//div[@id='flash']"));

        String expectedResult="You logged into a secure area!";

        //Assertions.assertEquals(expectedResult,succesMsg.getText());
        assertTrue( successMsg.getText().startsWith(expectedResult));

        //use isDisplay() method to check and element is displayed on the screen

        System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());

        String xpathStr="//div[ contains( text(), 'You logged into a secure area!') ]";
        WebElement successMsg2=driver.findElement(By.xpath(xpathStr));

        assertTrue( successMsg2.isDisplayed() );

    }
}
