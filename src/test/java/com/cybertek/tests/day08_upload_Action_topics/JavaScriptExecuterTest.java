package com.cybertek.tests.day08_upload_Action_topics;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterTest extends TestBase {

    @Test
    public void testScrollWholeWindow(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtil.waitFor(2);

        JavascriptExecutor jse= (JavascriptExecutor) driver;
        //it use execute method to run javascript, it can accept parameter
      for(int i =0; i<=10; i++) {
          jse.executeScript("window.scrollBy(0,1000)");

          BrowserUtil.waitFor(2);
      }
    }

    @Test
    public void testScrollElementIntoView(){
        driver.get("http://practice.cybertekschool.com/large");
        //locate cybertekSchoolLink and homeLink

        JavascriptExecutor jse= (JavascriptExecutor) driver;

        //run this javascript to scroll the element into the view
        //thElementIdentified.scrollIntoView(true)
        // in order to pass our element into above method
        //we need to use arguments [specify index here]
        // whatever we pass to executeScript method after javascipt code will be argument with index
        int myScrollNumber=1000;
        jse.executeScript("window.scrollBy(0,arguments[0] )", myScrollNumber ) ;

        WebElement cybertekSchoolLink=driver.findElement(By.linkText("Cybertek School"));

        jse.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink );

        BrowserUtil.waitFor(4);




    }
}
