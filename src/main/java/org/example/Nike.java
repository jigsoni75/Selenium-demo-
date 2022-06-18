package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.BasePage.driver;

public class Nike extends Utils {

    private By _checkProduct = By.xpath("//div[@class=\"products-wrapper\"]");
    private By _product = By.xpath("//*[@id=\"small-searchterms\"]");
    private By _element1= By.xpath("//*[@id=\"small-search-box-form\"]/button");



    public void searchNike() {

          sendKeys(_product,"Nike");//change Nike or apple for search bar


        clickOnElement(_element1);

        // product title WebElement
        List<WebElement> productTitles = driver.findElements(_checkProduct);

        for (WebElement e : productTitles) {

            System.out.println(e.getText());

        }
    }
}