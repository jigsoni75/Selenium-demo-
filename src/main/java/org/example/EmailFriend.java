package org.example;

import org.openqa.selenium.By;



public class EmailFriend extends Utils{
    LoadProp loadProp =new LoadProp();


    private By _emailFriendButton = By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");
    private By _FriendEmails  = By.xpath("//*[@id=\"FriendEmail\"]");
    private By _enterOwnEmailAddress = By.xpath("//*[@id=\"YourEmailAddress\"]");
    private By  _enterPersonalMessage = By.xpath("//*[@id=\"PersonalMessage\"]");
    private By _sendEmailButton = By.name("send-email");

    public void EmailFriendPage(){


      // email friend button

        clickOnElement(_emailFriendButton );

        // type in Your email address

        sendKeys(_FriendEmails,loadProp.getProperty("FriendEmails"));

        //enter your email address
        sendKeys(_enterOwnEmailAddress, " ");

        sendKeys(_enterPersonalMessage, "This computer is a very nice and good price.");

        //clik on send email Button

        clickOnElement(_sendEmailButton);
    }
}
