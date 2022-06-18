package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.openqa.selenium.By.className;

public class RegistrationSuccessive extends Utils {

private  By _actualMessage = By.className("result");
    public void verifyUserRegisteredSuccessfully(){



        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(_actualMessage).getText();

        Assert.assertEquals(expectedMessage, actualMessage, "Your registration is NOT successful");

    }


}
