package com.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_IdentifiyingElement_PartialLinktext {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://techterms.com/definition/framework");

        Thread.sleep(3000);


        WebElement results =driver.findElement(By.tagName("a"));
        System.out.println("results.getText() = " + results.getText());
        System.out.println("results.getAttribute(\"class\") = "
                + results.getAttribute("class"));


        Thread.sleep(4000);

        driver.quit();

    }
}
