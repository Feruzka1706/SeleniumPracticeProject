package com.cybertek.day05_CSS_Selectors;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Locator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement forgetPassword=driver.findElement(By.xpath("//h2[text()='Forgot Password'] "));

        System.out.println("forgetPassword.getText() = " + forgetPassword.getText());

        WebElement emailBox=driver.findElement(By.xpath("//input[ @name='email' and @type='text' ]"));
        emailBox.sendKeys("someone@somewhere.com");

        WebElement retrieveBtn=driver.findElement(By.xpath("//button[@id='form_submit' and @class='radius'] "));
        retrieveBtn.click();

       // WebElement confirmationMessage=driver.findElement(By.xpath("//h4[ @name='confirmation_message']"));
        //or we can use xpath("//h4[ text() =\"Your e-mail's been sent!\"] " );
       // System.out.println("confirmationMessage.getText() = " + confirmationMessage.getText());

        String confirmationM="//h4[text()= \"Your e-mail's been sent!\"]";
        System.out.println("confirmationM = " + confirmationM);

        WebElement confirmationMsg=driver.findElement(By.xpath(confirmationM));

        driver.quit();
    }
}
