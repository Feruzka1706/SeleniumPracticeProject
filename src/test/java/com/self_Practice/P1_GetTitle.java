package com.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GetTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://techterms.com/definition/framework");

       String pageTitle=driver.getTitle();

        System.out.println(pageTitle);

        if(pageTitle.equals("Framework Definition")){
            System.out.println("Test passed. Actual title of the page is matching with expected result");
            System.out.println("pageTitle = " + pageTitle);
        }

        driver.close();


    }
}
