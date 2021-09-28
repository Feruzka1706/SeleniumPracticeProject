package com.cybertek.tests.day10_driver_method_practice_properties;

import com.cybertek.utility.ConfigReader;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {

    @Test
    public void testInitialread() throws IOException {
        //Open a connection to the file using FileInputStream object
        FileInputStream in =new FileInputStream("config.properties");

        //Create empty Properties object
        Properties jbrkish =new Properties();
        //Load the FileInputStream into the Properties Object
        jbrkish.load(in);

        //close the connection by calling close method of FileInputStream object
        in.close();

        //now actually read from
        String string1= jbrkish.getProperty("hello");
        System.out.println(string1);

        System.out.println(jbrkish.getProperty("message"));

        System.out.println(jbrkish.get("weborder_url"));

    }


    @Test
    public void testReadWithTryCatch(){
        try {
            FileInputStream in =new FileInputStream("config.properties");
            Properties properties=new Properties();
            properties.load(in);
            in.close();

            System.out.println(properties.getProperty("hello"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadingUsingUtilityClass(){
        System.out.println(ConfigReader.read("hello"));
        System.out.println(ConfigReader.read("weborder_username"));
    }
}
