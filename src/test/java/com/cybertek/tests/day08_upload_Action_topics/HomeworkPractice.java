package com.cybertek.tests.day08_upload_Action_topics;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkPractice extends TestBase {
    /**
     * 1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
     * 2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
     * 3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
     * 4. It will open the link in new tab
     * 5. Click on the Dropdown Link again to open it.
     * 6. Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.
     * 7. It will open the link in another windows.
     * 8. Repeat the same process for Facebook
     * 9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
     * 10. Optionally , if the title contains Facebook, Close the window|tab.
     * 11. Optionally, if the title contains Amazon , Hover over to Prime from menu option
     * (in between Best Sellers and Customer Service), it will show
     * "Try Prime" link , Verify it isDisplayed.
     * 12. Optionally, if the title contains Etsy , Scroll until the Enter Your Email input box is in the view.
     * 13. These exercise can be done separately instead of switching to the window,
     * do your best judgement to do them together or separately.
     */

    @Test
    public void testHomework(){
       // 1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
        driver.get("http://practice.cybertekschool.com/dropdown");
        String currentWindow=driver.getWindowHandle();

        BrowserUtil.waitFor(2);

        WebElement dropdownBar=driver.findElement(By.xpath("//div/a[@id='dropdownMenuLink']") );
        dropdownBar.click();
        BrowserUtil.waitFor(2);

        WebElement googleLink=driver.findElement(By.xpath("//div/a[@class='dropdown-item'][1]"));
        WebElement amazonLink=driver.findElement(By.xpath("//div/a[@class='dropdown-item'][2]"));
        WebElement facebookLink=driver.findElement(By.xpath("//div/a[@class='dropdown-item'][4]"));
        WebElement etsyLink=driver.findElement(By.xpath("//div/a[@class='dropdown-item'][5]"));
        //div/a[@class='dropdown-item'][2] >> Amazon
        //div/a[@class='dropdown-item'][4] >> Facebook
        //div/a[@class='dropdown-item'][5] >> Etsy

        Actions actions=new Actions(driver);
        actions.keyDown(Keys.COMMAND).pause(2000)
                .click(googleLink).keyUp(Keys.COMMAND).perform();


        BrowserUtil.waitFor(2);
        dropdownBar.click();

        actions.keyDown(Keys.COMMAND).pause(2000)
                .click(amazonLink).keyUp(Keys.COMMAND).perform();

        BrowserUtil.waitFor(2);
        dropdownBar.click();

        actions.keyDown(Keys.COMMAND).pause(2000)
                .click(etsyLink).keyUp(Keys.COMMAND).perform();

        BrowserUtil.waitFor(2);
        dropdownBar.click();

        actions.keyDown(Keys.COMMAND).pause(2000)
                .click(facebookLink).keyUp(Keys.COMMAND).perform();


        BrowserUtil.waitFor(2);

        Set<String> allWindows=driver.getWindowHandles();

        for(String eachWindow: allWindows){

             driver.switchTo().window(eachWindow);
            System.out.println("Title of the Page = " + driver.getTitle());

            if(driver.getTitle().contains("Amazon")){
                WebElement prime  = driver.findElement(By.id("nav-link-prime"));
                System.out.println("prime.getText() = " + prime.getText());
                actions.moveToElement(prime).perform();
                assertTrue(prime.isDisplayed());
                BrowserUtil.waitFor(2);
            }

            if(driver.getTitle().contains("Etsy")){
                WebElement email = driver.findElement(By.xpath("//input[@name='email_address']"));
                BrowserUtil.waitFor(2);
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("arguments[0].scrollIntoView(true)" ,  email  );
                BrowserUtil.waitFor(2);
            }

            if(driver.getTitle().contains("Facebook")){
                driver.close();
            }

            driver.switchTo().window(currentWindow);

            BrowserUtil.waitFor(3);

        }

        BrowserUtil.waitFor(4);

        System.out.println("END");




    }
}
