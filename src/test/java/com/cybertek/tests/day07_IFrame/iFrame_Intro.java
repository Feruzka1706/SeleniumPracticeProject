package com.cybertek.tests.day07_IFrame;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class iFrame_Intro extends TestBase {

    @Test
    public void testIFrame(){
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']") ) );
    }
}
