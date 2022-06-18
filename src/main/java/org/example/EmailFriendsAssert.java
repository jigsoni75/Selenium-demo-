package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailFriendsAssert extends Utils {

    private By _actualMessage = By.className("result");

    public void emailSuccessfullySent(){

        String actualMessage = driver.findElement(By.className("result")).getText();
          String expectedMessage = "Your message has been sent.";
         Assert.assertEquals(actualMessage, expectedMessage, " your message has not been sent");
    }

}
