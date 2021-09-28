package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.utility.Driver;
import org.junit.jupiter.api.Test;

public class SingletonPractice {

    @Test
    public void testSingleton2(){
        Driver.getDriver().get("https://google.com");


    }

    @Test
    public void testSingleton(){

        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();

    }
}
