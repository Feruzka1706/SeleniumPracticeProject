package com.cybertek.tests.day08_upload_Action_topics;

import com.cybertek.tests.day09_ExplicitWait.Driver;
import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

public class ActionClass extends TestBase {


    @Test
    public void testHoverAction(){
        driver.navigate().to("http://practice.cybertekschool.com/hovers");

        WebElement img1Elm=driver.findElement(By.xpath("(//div[@class= 'figure']/img)[1]"));

        //create instance of Actions class by passing driver object

        Actions actions=new Actions(driver);
        actions.moveToElement(img1Elm).perform();

        BrowserUtil.waitFor(3);

        //and verify User profile 1 displayed with text "name: user1"
        WebElement firstProfileElm=driver.findElement(By.xpath("//h5[.='name: user1']"));
        assertTrue( firstProfileElm.isDisplayed() );

        //locate 2 image and hover over tot he image
        WebElement img2Elm=driver.findElement(By.xpath("(//div[@class= 'figure']/img)[2]"));
        actions.moveToElement(img2Elm).perform();

        BrowserUtil.waitFor(3);

        actions.moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .perform();

        //TODO:  Homework: get a List<WebElement> containing those 3 images,
        // Iterate over the list to hover over

    }


    @Test
    public void testDragAndDrop(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtil.waitFor(2) ;

        WebElement smallCircle=driver.findElement(By.id("draggable"));
        WebElement bigCircle=driver.findElement(By.id("droptarget"));

        //dragAndDrop method of Actions class, accept 2 webElements and drop first one into second one
        Actions actions =new Actions(driver);
        actions.dragAndDrop(smallCircle,bigCircle).perform();

        BrowserUtil.waitFor(2);

        assertEquals("You did great!", bigCircle.getText() );


    }


    @Test
    public void testKeyboardAction(){
        Driver.getDriver().get("https://www.google.com");
        //locate searchBox

        //hold down to shift enter text "i love selenium"
        //release the shift
        //enter text "i love selenium"
        //hold down to command on mac control and enter "A"
        // release the command or control key
        // then hit backspace to delete

        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));

        //create Actions class instance
        Actions action =new Actions(Driver.getDriver());

        action.keyDown(Keys.SHIFT).sendKeys("i love selenium")
                .pause(2000).keyUp(Keys.SHIFT)
                .sendKeys("i love selenium").pause(2000)
                .keyDown(Keys.COMMAND).sendKeys("A")//command+a on mac will select all text
                //windows : control + a
                .keyUp(Keys.COMMAND).pause(2000)
                .sendKeys(Keys.BACK_SPACE)
                .perform();



    }

    @Test
    public void testDoubleClick(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);

        driver.switchTo().frame("iframeResult");

        WebElement pElm1=driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));

        Actions action =new Actions(driver) ;
        action.doubleClick(pElm1).perform() ;
        //this is how we double click

        BrowserUtil.waitFor(2);
        //TODO: go ahead and assert the Hello World showed up

        WebElement result=driver.findElement(By.xpath("//p[.='Hello World']"));
        assertTrue( result.isDisplayed() );

        BrowserUtil.waitFor(2);



    }

    @Test
    public void testRightClick(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        driver.switchTo().frame("iframeResult");
        WebElement yellowArea=driver.findElement(By.cssSelector("div[oncontextmenu='myFunction()']"));

        Actions action =new Actions(driver);
        action.contextClick(yellowArea).perform();

        BrowserUtil.waitFor(3);
        driver.switchTo().alert(). accept();

        BrowserUtil.waitFor(2);

    }
}
