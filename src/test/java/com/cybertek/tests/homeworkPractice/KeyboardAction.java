package com.cybertek.tests.homeworkPractice;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction extends TestBase {
   @Test
    public void testKeyboardAction(){
       driver.get("https://google.com");

       WebElement searchBox=driver.findElement(By.name("q") );

       Actions actions=new Actions(driver);
       actions.click(searchBox).pause(2000)
               .keyDown(Keys.SHIFT)
               .sendKeys("typing something here").pause(2000)
               .keyUp(Keys.SHIFT)
               .sendKeys("blah-blah-blah").pause(2000)
               .keyDown(Keys.COMMAND)
               .sendKeys("A").pause(2000)
               .keyUp(Keys.COMMAND)
               .sendKeys(Keys.BACK_SPACE)
               .perform();

       BrowserUtil.waitFor(3);

   }

}
