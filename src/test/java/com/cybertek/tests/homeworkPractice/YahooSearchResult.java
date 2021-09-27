package com.cybertek.tests.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchResult {

    WebDriver driver;
    //we need to declare here instance variable and put here as class level,
    //later on each method can initialize separetely

    @BeforeAll
    public static void setUp(){
        //before all method should be STATIC
        System.out.println("Before all setting up chrome driver");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpBrowser(){
        System.out.println("@Before each to open browser and navigate");
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com");

    }

    @AfterEach
    public void closeBrowser(){
        System.out.println("@AfterEach method to close browser");
        driver.quit();
    }

    @AfterAll
    public static void tearDown(){

    }
}
