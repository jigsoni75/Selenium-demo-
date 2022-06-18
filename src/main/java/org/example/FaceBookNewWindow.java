package org.example;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class FaceBookNewWindow extends Utils {

    public void NewWindowFaceBookNopeCommerce() {

        driver.get("https://demo.nopcommerce.com");

        clickOnElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));


    // It will return the parent window name as a String
        String parent = driver.getWindowHandle();

        Set<String> s = driver.getWindowHandles();

    // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();

            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }
        //switch to the parent window
        driver.switchTo().window(parent);

    }
}