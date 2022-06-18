package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourownComputer extends Utils {

    private  By _processor = By.id("product_attribute_1");

    private  By _ram2gb = By.id("product_attribute_2");

    private  By _hddRadio320 = By.xpath("//label[@for=\"product_attribute_3_6\"]");

    private  By _osVistaPremium = By.xpath("//label[@for=\"product_attribute_4_9\"]");

    private  By _microsoftOffice = By.xpath("//label[@for=\"product_attribute_5_11\"] ");

    private  By _acrobatReader =By.xpath("//input[@value=\"12\"]");

    private  By _totalCommander = By.xpath("//button[@id=\"add-to-cart-button-1\"]");

    private  By _buildAddToCart = By.xpath("//span[@class=\"cart-label\"]");


public void buildComputer(){

    Select Processor = new Select(driver.findElement(_processor));
    Processor.selectByValue("1");

    //select on RAM  2 GB
    Select Ram = new Select(driver.findElement(_ram2gb));
    Ram.selectByValue("3");

    //click on HDD radio 320gb
    clickOnElement(_hddRadio320);

    //click on OS vista premium
    clickOnElement(_osVistaPremium);

    //tick  on Microsoft Office [+$50.00]
    clickOnElement(_microsoftOffice );

    //tick  on Acrobat Reader [+$10.00]
    clickOnElement(_acrobatReader);

    //tick on  Total Commander [+$5.00]
    clickOnElement(_totalCommander);

    //click on Add to CART
    clickOnElement(_buildAddToCart);

    //clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

}

}
