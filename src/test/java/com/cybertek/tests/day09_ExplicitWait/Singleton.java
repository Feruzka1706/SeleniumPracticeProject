package com.cybertek.tests.day09_ExplicitWait;

public class Singleton {
    /**
     *   Singleton is a design pattern to have a class only generate one object
     *   in order to achieve Singleton pattern
     *   1. private constructor
     *   2. private static field with data type same as class
     *   3. public getter method for private field
     *         to check if you have already created object
     *        if not -- create object for the first time
     *         if yes -- just use existing object
     */

    //static String word="my only value";
    private static Singleton obj;

    private Singleton(){

    }

    public static Singleton getObj(){
        //if object was not initially give value
        //then create object and give value
        if(obj == null) {
            System.out.println("Object has not been created, creating one");
            obj = new Singleton();
            return obj;
        }else {
            System.out.println("You already have object, use that existing object");
            return obj;
        }

    }


}
