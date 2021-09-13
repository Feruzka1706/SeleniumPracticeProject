package com.cybertek.homeworkPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Managing_Browser_Window {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");
        //maximize browser window

        Thread.sleep(3000);
        driver.manage().window().maximize();
        // full screen
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        Thread.sleep(3000);
        //set the position of window by providing from top and left offset
        driver.manage().window().setPosition(new Point(300,200) );

        //get the current position of the window
        System.out.println("driver.manage().window().getPosition()="
                               +driver.manage().window().getPosition() );

        //change the window size dimension
        driver.manage().window().setSize(new Dimension(200,300) );

        //get the window size dimension
        System.out.println("driver.manage().window().getSize() = "
                + driver.manage().window().getSize());


    }
}
