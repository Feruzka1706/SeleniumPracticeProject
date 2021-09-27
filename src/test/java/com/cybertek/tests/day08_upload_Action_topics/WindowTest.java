package com.cybertek.tests.day08_upload_Action_topics;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

public class WindowTest extends TestBase {

    @Test
    public void testWindowOrTab(){

        driver.get("http://practice.cybertekschool.com/windows");

        //save window handle of this tab intro currentHandle variable
        String currentHandle=driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        Set<String> allHandles=driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        WebElement clickHereLink =driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        System.out.println("After clicking driver.getWindowHandle() = " + driver.getWindowHandle());

        System.out.println("After clicking driver.getWindowHandles() = " + driver.getWindowHandles());

        //our objective is to iterate over each and avery handles
        //and use switch method to switch to the window

        //this is reassigning the variable to new handles
        allHandles=driver.getWindowHandles();
        //iterate over Collection, you can use for each loop
        for(String eachHandle: allHandles){

            System.out.println("eachHandle = " + eachHandle);

            //this how to switch to diff window| tab
            driver.switchTo().window(eachHandle);
            //now we can print out the title to know which tab we are in now
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        System.out.println("SWITCHING BACK TO MAIN ORIGINAL TAB");
        driver.switchTo().window(currentHandle) ;
        System.out.println("Current tab title = " + driver.getTitle());

        assertEquals("Practice", driver.getTitle());







    }
}
