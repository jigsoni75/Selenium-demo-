package org.example;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {


    static Properties properties =new Properties();
    static FileInputStream inputStream;
    static String propertiesFileLocation = "src/test/java/TestData/TestConfig.properties";

    public String getProperty (String key){

        try {
            inputStream = new FileInputStream(propertiesFileLocation);
            properties.load(inputStream);
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
        }
    }


