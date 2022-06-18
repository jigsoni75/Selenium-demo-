package org.example;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static java.awt.SystemColor.text;


public class Utils extends BasePage {


    public static void sendKeys(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String randomDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
        return formatter.format(date);
    }

    public static void elementToBeClickable(int time, By by) {
        WebDriverWait waitForClickable = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        ((WebElement) waitForClickable.until(ExpectedConditions.elementToBeClickable(by))).click();
    }

    public static void urlContainsFraction(int time, String fraction) {
        WebDriverWait wait01 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait01.until(ExpectedConditions.urlContains(fraction));
    }

    public static void driverWaitTextToBePresentInElementLocated(int time, By by) {
        WebDriverWait wait02 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait02.until(ExpectedConditions.textToBePresentInElementLocated(by, String.valueOf(text)));
    }

    public static void driverWaitTitleContains(int time, String title) {
        WebDriverWait wait03 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait03.until(ExpectedConditions.titleContains(title));
    }

    public static void driverWaitTitleContainsURL(int time, String title) {
        WebDriverWait wait04 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait04.until(ExpectedConditions.urlContains(title));
    }

    public static void driverWaitPresenceOfElementLocated(int time, By by) {
        WebDriverWait wait05 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait05.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void driverWaitUntilInvisibilityOfWebElement(int time, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf(element));
}

    public static void driverWaitInvisibleOfElement(int time, By by) {
        WebDriverWait wait06 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait06.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void driverWaitAttributeContains(int time, By by, String attribute, String value) {
        WebDriverWait wait06 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait06.until(ExpectedConditions.attributeContains(by, attribute, value));
    }

    public static void driverWaitAttributeToBe(int time, By by, String value, String attribute) {
        WebDriverWait wait07 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait07.until(ExpectedConditions.attributeToBe(by, value, attribute));
    }

    public static void driverWaitAttributeToBeNotEmpty(int time, By by, String attribute) {
        WebDriverWait wait08 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait08.until(ExpectedConditions.attributeToBeNotEmpty((WebElement) by, attribute));
    }

    public static void driverWaitElementToBeClickable(int time, By by) {
        WebDriverWait wait09 = new WebDriverWait(driver, Duration.ofSeconds((long) time));
        wait09.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void selectDropdownByValue(By by, String value) {
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByValue(value);
    }

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    public void selectByValueDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }


    public static void sleep(int time) {
        try {
            Thread.sleep((long) (time * 1000L));
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }

    public static void takeSpanShot(String a) {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenShots method to creat image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // copy file at destination

        try {
            FileUtils.copyFile(srcFile, new File("Screenshots\\" + a + randomDate() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void driverWaitUntilVisibilityOfAllElementsLocatedBy(int time, By by) {

    }
}

