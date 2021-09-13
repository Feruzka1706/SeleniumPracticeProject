package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRM_LoginFunction {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //WebElement usernameBox= driver.findElement(By.name("USER_LOGIN"));
        ArrayList<String> credentials= new ArrayList<>();

        credentials.addAll(Arrays.asList("helpdesk3@cybertekschool.com","helpdesk4@cybertekschool.com",
                "marketing3@cybertekschool.com","marketing4@cybertekschool.com",
                "hr3@cybertekschool.com","hr4@cybertekschool.com"));

        for(String eachCredential : credentials){

            WebDriver driver=new ChromeDriver();
            driver.get("https://login.nextbasecrm.com/");
            driver.manage().window().maximize();

            WebElement usernameBox=driver.findElement(By.name("USER_LOGIN"));
            usernameBox.sendKeys(eachCredential);

            Thread.sleep(2000);
            WebElement passwordBox=driver.findElement(By.name("USER_PASSWORD"));
            passwordBox.sendKeys("UserUser");

            Thread.sleep(2000);

            WebElement loginBtn=driver.findElement(By.className("login-btn"));
            loginBtn.click();
            Thread.sleep(2000);

            driver.navigate().back();
            driver.quit();
        }





    }
}
