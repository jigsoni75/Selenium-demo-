package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NopcommerceNewRelease extends Utils {
   private By _enterTitle =By.xpath("//strong [contains (text (),'Mr Patel')]");



    public void newRelease(){
        // assert for compare the url
        String actualPageTitle = driver.getCurrentUrl();
        String expectedPageTitle = "https://demo.nopcommerce.com/nopcommerce-new-release";
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Page title is wrong");
        System.out.println("URL matching --> Part executed");


        //type in the Title
        sendKeys(By.xpath("//*[@id=\"AddNewComment_CommentTitle\"]"),"Mr Soni");
        //type the  comment
        sendKeys(By.xpath("//*[@id=\"AddNewComment_CommentText\"]"),"Nope commerce is very useful website");
        //click on new comment button
        clickOnElement(By.xpath("//button[@name=\"add-comment\"]"));
        //  assert for nopCommerce new release!
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class=\"center-2\"]//div/div/h1")),"nopCommerce new release!");
        //assert for News comment is successfully added
        Assert.assertEquals(getTextFromElement(By.xpath("//div[contains (text (),'News comment is successfully added.')]")),"News comment is successfully added.");

        List<WebElement> comments=driver.findElements(By.xpath("//div[@class=\"comment-title\"]"));
        List<String>listOfComments=new ArrayList<>();
        for (WebElement e : comments) {
            listOfComments.add(e.getText());
        }
//        Assert.assertTrue(listOfComments.contains("mr soni"));
//        //last comment verification
//        String lastComment = listOfComments.get(listOfComments.size()-1);
//        System.out.println(lastComment);
//        Assert.assertEquals(lastComment,"Mr soni ","Comment is not in order");




    }
}
