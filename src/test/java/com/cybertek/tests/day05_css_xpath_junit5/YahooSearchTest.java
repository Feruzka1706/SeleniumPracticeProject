package com.cybertek.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchTest {
    /*
    TODO: write 2 tests:
        1. navigate to https://search.yahoo.som
         get the title... it should be under header section
         Title should be "Yahoo Search - Web Search"


         test method name : testYahooSearchResultPageTitle
          test navigate to yahoo page
           and search for Selenium
            the page title should start with selenium
     */

    WebDriver driver;

    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void teardown(){
        System.out.println("@After all, nothing to do here");
    }

    @Test
    public void testYahooSearchPage(){

        driver.get("https://search.yahoo.com/");
        String expectedTitle="Yahoo Search - Web Search";
        String actualTitle=driver.getTitle();

        //Assertions.assertEquals(expectedTitle, actualTitle);
        assertEquals(expectedTitle, actualTitle);

    }

    @Test
    public void testYahooSearchResultPageTitle(){

        driver.navigate().to("https://search.yahoo.com/");
        WebElement searchInput=driver.findElement(By.xpath("//input[@id='yschsp']"));
        searchInput.sendKeys("Selenium"+ Keys.ENTER);

        //WebElement searchBtn=driver.findElement(By.ti)
        //String expectedPageTitle="Selenium";

        String actualPageTitle=driver.getTitle();

        assertTrue(actualPageTitle.startsWith("Selenium") );

    }





}
