package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BaseTest extends Utils {

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setup() {
        driverManager.openBrowser();

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            takeSpanShot(result.getName());
        }
        driverManager.closeBrowser();

    }

}






//    public static void takeSnapShot(String fileName) throws Exception {
//
//        //Convert web driver object to TakeScreenshot
//
//        TakesScreenshot scrShot = ((TakesScreenshot).driver);
//
//        //Call getScreenshotAs method to create image file
//
//        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//
//        //Move image file to new destination
//
//
//        //Copy file at destination
//
//        try {
//            FileUtils.copyFile(scrShot, new File(''));
//        }
//    }
