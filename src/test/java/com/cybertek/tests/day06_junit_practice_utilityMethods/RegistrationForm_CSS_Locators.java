package com.cybertek.tests.day06_junit_practice_utilityMethods;

import com.cybertek.utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationForm_CSS_Locators  {

    WebDriver driver;

    @BeforeEach
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }

    @AfterEach
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void registrationFormTest() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/registration_form");
        String expectedPageTitle="Practice";
        assertTrue(driver.getTitle().equals(expectedPageTitle));
        //css.Selector for title --> div>h2

        WebElement inputFirstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        inputFirstName.sendKeys("Feruza");

        Thread.sleep(2000);

        WebElement inputLastName=driver.findElement(By.cssSelector("input[name='lastname']"));
        inputLastName.sendKeys("Jonzokova");

        Thread.sleep(2000);

        WebElement inputUsername=driver.findElement(By.cssSelector("input[data-bv-field='username']"));
        inputUsername.sendKeys("feruzka1706");

        Thread.sleep(2000);

        WebElement inputEmail=driver.findElement(By.cssSelector("input[data-bv-field='email']"));
        inputEmail.sendKeys("someone@somewhere.com");

        Thread.sleep(2000);

        WebElement inputPassword=driver.findElement(By.cssSelector("input[type='password']"));
        inputPassword.sendKeys("SuperPassword23");

        Thread.sleep(2000);

        WebElement inputPhoneNum=driver.findElement(By.cssSelector("input[type='tel'][name='phone']"));
        inputPhoneNum.sendKeys("916-224-9178");

        Thread.sleep(2000);
        WebElement chooseGender=driver.findElement(By.cssSelector("input[value='female'][type='radio']"));
       chooseGender.click();

       Thread.sleep(2000);
       WebElement inputDateOfBirth=driver.findElement(By.cssSelector("input[type='text'][name='birthday']"));
       inputDateOfBirth.sendKeys("06/17/1993");

       WebElement department=driver.findElement(By.cssSelector("select[name='department']"));

        Select departmentOption=new Select(department);
        departmentOption.selectByVisibleText("Tourism Office");

        Thread.sleep(2000);
        WebElement jobTitle=driver.findElement(By.cssSelector("select[name='job_title']"));
        Select titleOption=new Select(jobTitle);
        titleOption.selectByVisibleText("SDET");

        Thread.sleep(2000);

     driver.findElement(By.cssSelector("input[id='inlineCheckbox2']")).click();

     Thread.sleep(2000);

     WebElement signUp=driver.findElement(By.cssSelector("button[id='wooden_spoon']"));
     signUp.click();

     Thread.sleep(2000);

     WebElement successMsg=driver.findElement(By.cssSelector("div[class='alert alert-success']"));
       assertTrue( successMsg.isDisplayed() );
        System.out.println("Success message after submitting form= " + successMsg.getText());

    }




}
