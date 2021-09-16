package com.cybertek.tests.day05_css_xpath_junit5;
import org.junit.jupiter.api.*;
public class LifeCycleAnnotationDemo {
    @BeforeAll
    public static void init(){
        System.out.println("@BeforeAll run once before all test");
    }

    @BeforeEach
    public void setup(){

    }

    @Test
    public void test1(){
        System.out.println("test1 method is running");
    }

    @Test
    public void test2(){
        System.out.println("test2 method is running");
    }

    @AfterEach
    public void  tearDown(){

    }

    @AfterAll
    public static void cleanup(){
        System.out.println("@AfterAll run once after all test");
    }
}
