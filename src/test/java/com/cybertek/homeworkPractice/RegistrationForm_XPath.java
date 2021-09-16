package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationForm_XPath {

    WebDriver driver;

    @BeforeEach
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @AfterEach
    public void closeDriver(){
      driver.close();
    }

    @Test
    public void registrationFormTest() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/registration_form");
        String expectedPageTitle="Practice";
        String actualResult=driver.getTitle();

        assertEquals(expectedPageTitle,actualResult);
       // assertTrue(driver.getTitle().equals(expectedPageTitle));

        WebElement inputFirstName=driver.findElement(By.xpath("//div/input[@name='firstname']"));
        inputFirstName.sendKeys("Feruza");

        Thread.sleep(3000);

        WebElement inputLastName=driver.findElement(By.xpath("//div/input[@name='lastname']"));
        inputLastName.sendKeys("Jonzokova");

        Thread.sleep(3000);


        WebElement inputUsername=driver.findElement(By.xpath("//div/input[@name='username']"));
        inputUsername.sendKeys("feruzka1706");

        Thread.sleep(3000);


        WebElement inputEmail=driver.findElement(By.xpath("//div/input[@name='email']"));
        inputEmail.sendKeys("someone@somewhere.com");

        Thread.sleep(3000);


        WebElement inputPassword=driver.findElement(By.xpath("//div/input[@type='password']"));
        inputPassword.sendKeys("SuperPassword23");

        Thread.sleep(3000);


        WebElement inputPhoneNum=driver.findElement(By.xpath("//div/input[@type='tel']"));
        inputPhoneNum.sendKeys("916-224-9178");

        Thread.sleep(3000);

        WebElement chooseGender=driver.findElement(By.xpath("//label/input[@value='female']"));
        // male gender: //label/input[@value='male']  other gender: //label/input[@value='other']
        chooseGender.click();

        Thread.sleep(3000);

        WebElement inputDateOfBirth=driver.findElement(By.xpath("//div/input[@name='birthday']"));
        inputDateOfBirth.sendKeys("06/17/1993");

        Thread.sleep(3000);

        WebElement department=driver.findElement(By.xpath("//div/select[@name='department']"));

        Select departmentOption=new Select(department);
        departmentOption.selectByVisibleText("Tourism Office");

        Thread.sleep(3000);

        WebElement jobTitle=driver.findElement(By.xpath("//div/select[@name='job_title']"));
        Select titleOption=new Select(jobTitle);
        titleOption.selectByIndex(5);

        Thread.sleep(3000);


        driver.findElement(By.xpath("//div/input[@id='inlineCheckbox2']")).click();

        Thread.sleep(3000);


        WebElement signUp=driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUp.click();

        Thread.sleep(3000);


        WebElement successMsg=driver.findElement(By.xpath("//div[@role='alert']"));
        assertTrue( successMsg.isDisplayed() );
        System.out.println("Success message after submitting form= " + successMsg.getText());

        Thread.sleep(3000);


    }

    @Test
    public void saucedemoTest() throws InterruptedException {

        driver.navigate().to("https://www.saucedemo.com/");

        Thread.sleep(2000);

        String expectedTitle="Swag Labs";
        assertEquals(expectedTitle,driver.getTitle());

      //addCart btn ===//div/button[text()='Add to cart']
        Thread.sleep(2000);
        WebElement usernameBox=driver.findElement(By.xpath("//div/input[@id='user-name']"));
        usernameBox.sendKeys("standard_user");

        WebElement passwordBox=driver.findElement(By.xpath("//div/input[@id='password']"));
        passwordBox.sendKeys("secret_sauce");

        Thread.sleep(2000);

        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.submit();

        WebElement firstElement=driver.findElement(By.xpath("//div/div[@class='inventory_item'][1]"));
        System.out.println("firstElement.getText() = " + firstElement.getText());
        System.out.println("firstElement.getAttribute(\"id\") = "
                + firstElement.getAttribute("id"));
        //we can use class name or linkText


        List<WebElement> allElements=driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int listElements=6;
        assertEquals(allElements.size(), listElements);
        System.out.println("allElements.size() = " + allElements.size());

        for(WebElement eachElement:allElements){
            System.out.println("eachElement.getText() = " + eachElement.getText());
            WebElement addCartBtn=driver.findElement(By.xpath("//div/button[text()='Add to cart']"));
            addCartBtn.click();
        }

        Thread.sleep(2000);

        WebElement shoppingCart= driver.findElement(By.xpath("//div/a[@class='shopping_cart_link']"));
        shoppingCart.click();

        Thread.sleep(2000);

        WebElement continueShopping=driver.findElement(By.xpath("//div/button[@id='continue-shopping']"));
        continueShopping.click();

        Thread.sleep(2000);
        WebElement menuIcon=driver.findElement(By.xpath("//div/button[@id='react-burger-menu-btn']"));
        menuIcon.click();
        Thread.sleep(1000);

        WebElement logoutBtn=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        Thread.sleep(2000);
        logoutBtn.click();

        Thread.sleep(2000);
    }

}
