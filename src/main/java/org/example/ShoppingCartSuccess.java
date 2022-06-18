package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;
import static org.openqa.selenium.By.xpath;

public class ShoppingCartSuccess extends Utils{

    private By _actualMessage  = By.xpath("//h1 [contains (text (),'Shopping cart')]");
    private By _actualMessage1 = By.className("product-name");

    public void ShoppingMessage(){

        // assert for ShoppingCart
        String expectedMessage = "Shopping cart";

        String actualMessage = driver.findElement(_actualMessage).getText();

        Assert.assertEquals(actualMessage,expectedMessage, "The product will not added to the cart ");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actualMessage1 = driver.findElement(_actualMessage1).getText();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String expectedMessage1 = "Build your own computer";

        Assert.assertEquals(actualMessage1,expectedMessage1, "build your computer not added to the cart");


    }
}
