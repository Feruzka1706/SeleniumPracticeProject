package com.cybertek.tests.homeworkPractice;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

public class ActionClass extends TestBase {

    @Test
    public void testActionClass(){

        driver.get("http://practice.cybertekschool.com/hovers");
        //https://demos.telerik.com/kendo-ui/dragdrop/index
        //https://google.com

        /**hover over to the first image
        *   div[@class='figure'][1]
         *   //h5[.='name: user1']
        */

        WebElement firstImage=driver.findElement(By.xpath("//div[@class='figure'][1]") );

        WebElement firstImageText=driver.findElement(By.xpath("//h5[.='name: user1']") );
        System.out.println(" Before firstImageText.isDisplayed() = " + firstImageText.isDisplayed());
        assertFalse( firstImageText.isDisplayed() );

        Actions action =new Actions(driver);

        action.moveToElement(firstImage).perform();

        System.out.println("After hover firstImageText.isDisplayed() = " + firstImageText.isDisplayed());
        assertTrue( firstImageText.isDisplayed() );


        System.out.println("END");
    }

    @Test
    public void testDrag_Drop(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle=driver.findElement(By.id("draggable"));
        WebElement bigCircle=driver.findElement(By.id("droptarget"));

        BrowserUtil.waitFor(2);

        System.out.println("bigCircle.getText() = " + bigCircle.getText());
        Actions actions=new Actions(driver);
       // actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.moveToElement(smallCircle).pause(2000)
                .clickAndHold().pause(2000)
                .moveToElement(bigCircle).pause(2000)
                .release().perform();

        assertEquals("You did great!", bigCircle.getText() );
        BrowserUtil.waitFor(2);
    }
}
