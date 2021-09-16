package com.cybertek.tests.day06_junit_practice_utilityMethods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomePage(){
     driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search" ;
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);

    }

    @Test
    public void testYahooSearchResultPage() throws InterruptedException {
        driver.get("https://search.yahoo.com/");

        driver.findElement(By.cssSelector("#yschsp")).sendKeys("selenium"+ Keys.ENTER);
        Thread.sleep(3000);
        //boolean result=driver.getTitle().startsWith("selenium");
        assertTrue( driver.getTitle().startsWith("selenium") );
    }
}
