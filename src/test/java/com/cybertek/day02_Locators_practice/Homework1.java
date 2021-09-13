package com.cybertek.day02_Locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        Thread.sleep(2000);
        WebElement searchBtn= driver.findElement(By.name("btnK"));
        searchBtn.click();

        WebElement result=driver.findElement(By.id("result-stats"));

        System.out.println("result.getText() = " + result.getText());

        List<WebElement> allResults = driver.findElements(By.partialLinkText("Selenium"));

        System.out.println("allResults.size() = " + allResults.size());

        WebElement firstResult=allResults.get(0);
        //System.out.println("firstResult.getText() = " + firstResult.getText());
        System.out.println("allResults.get(0).getText() = " + allResults.get(0).getText());

        WebElement lastResult=allResults.get(allResults.size()-1);
        //System.out.println("lastResult.getText() = " + lastResult.getText());
        System.out.println("allResults.get(allResults.size()-1).getText() = " + allResults.get(allResults.size()-1).getText());

        for(WebElement eachResult: allResults){
            System.out.println("eachResult.getText() = " + eachResult.getText());
        }

        //driver.navigate().back();

        /*

        List<WebElement> totalResults= driver.findElements(By.tagName("a"));
        for(WebElement eachElement:totalResults){
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }
         */

         driver.quit();

    }
}
/*
 navigate to https://google.com
2. search for `selenium`
3. click google search button
4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
5. get the text of that element
6. Optionally , if you want some java practice , go ahead and extract
the number of result and save it into long variable OPTIONALLy
7. get all the link that contain text `selenium` into a List<WebElement>
8. get the count
9. get the first one text
10. get the last one text
11. iterate over the list and print the text of each link
12. watch the short to learn more about `findElement(By.tagName("tag here"))`
13. watch the short to learn more about `element.getAttribute("attribute goes here")`
 */