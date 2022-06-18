package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.By.className;
import static org.testng.Assert.*;

public class Homepage extends Utils {

    private By _registerButton = className("ico-register");
    private By _computer = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
    private By _desktop = By.xpath("//img[@alt=\"Picture for category Desktops\"]");
    private By _uSDollar = By.xpath("//select[@name=\"customerCurrency\"]");
    private By _expectedMessage7 = By.xpath("//span[contains(text(),'$1,200.00')]"); //assert for Dollar
    private By _selectEuro = By.id("customerCurrency");
    private By _expectedMessage3 = By.xpath("//span [contains (text (),'€1032.00')]");//assert for euro
    private By _radioButtonGood = By.id("pollanswers-2");
    private By _clickOnVote = By.xpath("//button[@id=\"vote-poll-1\"]");
    private By _actualMessage4 = By.xpath("//*[@id=\"block-poll-vote-error-1\"]");
    private By _nopCommerceDemoHomePage = By.xpath("//img[@alt=\"nopCommerce demo store\"]");
    private By _actualMessage5 = By.xpath("//*[@id=\"poll-block-1\"]/span");
    private By _productTitleWebElement = By.xpath("//div[contains(@class, 'product-grid')]//div[@class=\"item-box\"]//h2");

    public void clickOnRegisterButton() {
        // click on register button
        clickOnElement(_registerButton);

    }  //click on computer

    public void clickOnComputers() {
        clickOnElement(_computer);
    } //click on desktop

    public void clickOnDeskTop() {

        clickOnElement(_desktop);

    }

    public void clickOnCurrency() {

        //select USDollar

        Select USDollar = new Select(driver.findElement(_uSDollar));
        USDollar.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F");


        String expectedMessage7 = driver.findElement(_expectedMessage7).getText();
        assertTrue(expectedMessage7.contains("$"));

        //select Euro

        Select Euro = new Select(driver.findElement(_selectEuro));
        Euro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");


        String expectedMessage3 = driver.findElement(_expectedMessage3).getText();
        assertTrue(expectedMessage3.contains("€"));
    }


    public void verifyIfNonRegisteredUserIsAbleToVote() {
        //click on radio button good
        clickOnElement(_radioButtonGood);

        //click on vote
        clickOnElement(_clickOnVote);
        //verify user is not able to vote without being registered

        // delays until message appears
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
        //Assert for Only registered users can vote
        String actualMessage4 = driver.findElement(_actualMessage4).getText();
        Assert.assertTrue(actualMessage4.contains("Only registered users can vote."), "non registered user is able to vote");
    }

    public void verifyRegisteredUserIsAbleToVote() {
        //get nop commerce demo home page

        clickOnElement(_nopCommerceDemoHomePage);
        //click on radio button good
        clickOnElement(_radioButtonGood);

        //click on vote
        clickOnElement(_clickOnVote);
        //verify registered user should be able to vote
        String actualMessage5 = driver.findElement(_actualMessage5).getText();
        Assert.assertTrue(actualMessage5.contains("vote(s)..."), "Registered user is not able to vote");
    }

    public void getProductTitle() {
        driver.get("https://demo.nopcommerce.com");

        // product title WebElement
        List<WebElement> productTitles = driver.findElements(_productTitleWebElement);

        for (WebElement e : productTitles) {

            System.out.println(e.getText());
        }

    }


    public void clickOnVoteAlert() {

        // click on vote button
        clickOnElement(_clickOnVote);
        // alert accept
        Alert alert = driver.switchTo().alert();
        String textOnAlert = alert.getText();
        System.out.println(textOnAlert);
        alert.getText();
        alert.accept();
    }

    public void faceBookNopeCommerce() {

        clickOnElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));

    }

    public void newsNewRelease() {

        clickOnElement(By.xpath("//div [@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]"));

    }


    public void searchStore (){
        clickOnElement(By.xpath("//*[@id=\"small-searchterms\"]"));

    }
}






