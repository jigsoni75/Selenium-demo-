package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class DriverManager extends Utils {
    static LoadProp loadProp = new LoadProp();
    public static final String USERNAME = loadProp.getProperty("bsUsername");
    public static final String AUTOMATE_KEY = loadProp.getProperty("bsAccessKey");
    public static final String BrowserStackURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    String browserName = "Chrome";
    DesiredCapabilities caps = new DesiredCapabilities();

    public void openBrowser() {

        if (browserName.equalsIgnoreCase("Chrome")) {


            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "latest");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "4.1.0");



        } else {
            System.out.println("your browser name is wrong there is connection issue ");

        }
        try {
            driver = new RemoteWebDriver(new URL(BrowserStackURL), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();

//

//        if   (browserName.equalsIgnoreCase("Chrome")) {
//
//            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
//            driver = new ChromeDriver();
//        }else if (browserName.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");
//            driver = new FirefoxDriver();
//
//        }else if (browserName.equalsIgnoreCase("Edge")) {
//            System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
//            driver = new EdgeDriver();
//
        }
        //Implicit wait method :
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizing chrome window:
        driver.manage().window().maximize();

        //Driver to type URL :
        driver.get("https://demo.nopcommerce.com/");
    }

    public void closeBrowser() {

        driver.quit();
    }
}