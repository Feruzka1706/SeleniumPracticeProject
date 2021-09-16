package com.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17_FindingElement_ByClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://techterms.com/definition/framework");

        WebElement spanElement=driver.findElement(By.className("visuallyhidden"));

        String elementText=spanElement.getText();

        System.out.println("elementText = " + elementText);

        driver.quit();
    }
}
