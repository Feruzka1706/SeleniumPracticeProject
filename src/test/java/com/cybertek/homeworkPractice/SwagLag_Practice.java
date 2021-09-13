package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

import java.util.List;

public class SwagLag_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        //driver.navigate().to("https://www.saucedemo.com/");
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        String title=driver.getTitle();
        System.out.println("Page title: "+title);

        Thread.sleep(2000);
        WebElement usernameBox=driver.findElement(By.id("user-name"));
        usernameBox.sendKeys("standard_user");

        WebElement passwordBox=driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");

        Thread.sleep(2000);

        WebElement loginBtn= driver.findElement(By.id("login-button"));
        loginBtn.submit();

        WebElement firstElement=driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstElement.getText() = " + firstElement.getText());
        System.out.println("firstElement.getAttribute(\"id\") = "
                + firstElement.getAttribute("id"));
        //we can use class name or linkText


        List<WebElement> allElements=driver.findElements(By.className("inventory_item_name"));
        System.out.println("allElements.size() = " + allElements.size());

        for(WebElement eachElement:allElements){
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }

        Thread.sleep(2000);

        WebElement shoppingCart= driver.findElement(By.className("shopping_cart_link"));
        shoppingCart.click();

        Thread.sleep(2000);

        WebElement continueShopping=driver.findElement(By.id("continue-shopping"));
        continueShopping.click();

        Thread.sleep(2000);
        WebElement menuIcon=driver.findElement(By.id("react-burger-menu-btn"));
        menuIcon.click();
        Thread.sleep(1000);

        WebElement logoutBtn=driver.findElement(By.id("logout_sidebar_link"));
        Thread.sleep(2000);
        logoutBtn.click();

        Thread.sleep(2000);
        driver.quit();




    }
}
