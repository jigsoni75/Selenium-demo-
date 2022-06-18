package org.example;

import org.openqa.selenium.By;

public class Desktop extends Utils{

    private By _clickOnComputer = By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]");

    public void clickOnBuildOwnComputer() {
       //click on computer

        clickOnElement( _clickOnComputer);

    }
}

