package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.className;


public class RegistrationPage extends Utils {
    LoadProp loadProp = new LoadProp();
    //locators are  stored in variable
    private By _genderMale = By.id("gender-male");

    private By _firstName = By.xpath("//input[@name='FirstName']");

    private By _lastName = By.id("LastName");

    private By _dateOfBirth = By.name("DateOfBirthDay");

    private By _dateOfMonth = By.name("DateOfBirthMonth");

    private By _dateOfBirthYear = By.name("DateOfBirthYear");

    private By _emailAddress = By.id("Email");

    private By _enterYourPassword = By.id("Password");

    private By _confirmPassword = By.id("ConfirmPassword");

    private By _registerButton = By.id("register-button");

    public void UserShouldBeAbleTORegisterSuccessfully() {

        //click on gender
        clickOnElement(_genderMale);

        // enter your  firstname
        sendKeys(_firstName, loadProp.getProperty("firstName"));

        //enter your lastname
        // driver.findElement(By.id("LastName")).sendKeys("LastNameTest");
        sendKeys(_lastName, loadProp.getProperty("lastName"));
        //>>>>>>>>>>>>>>>>>>>>>>select birthday >>>>>>>>>>>>>>>>>>>>
//        Select birthDay = new Select(driver.findElement(_dateOfBirth));//select on the day
//        birthDay.selectByIndex(28);

        selectByValueDropDown(_dateOfBirth, loadProp.getProperty("dateOfBirth"));

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>select Month >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        Select birtMonth = new Select(driver.findElement(_dateOfMonth ));//select on month
//        birtMonth.selectByIndex(3);
        selectByValueDropDown(_dateOfMonth, loadProp.getProperty("dateOfMonth"));
//        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>select year  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        Select birthYear = new Select(driver.findElement(_dateOfBirthYear));//select on year
//        birthYear.selectByVisibleText("1984");
        selectByValueDropDown(_dateOfBirthYear, loadProp.getProperty("dateOfBirthYear"));

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Enter your Email addresss  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // driver.findElement(By.id("Email")).sendKeys("Jigar75@gmail.com");
        // sendKeys(_emailAddress, loadProp.getProperty("jigar75" + randomDate() + "@gmail.com"));

        sendKeys(_emailAddress, "jigar75"+randomDate()+"@yahoo.com");


        //Enter your password
        //driver.findElement(By.id("Password")).sendKeys("Jb1984sn");
        sendKeys(_enterYourPassword, loadProp.getProperty("enterYourPassword"));

        // Enter Confirm Password

        //driver.findElement(By.id("ConfirmPassword")).sendKeys("Jb1984sn");
        sendKeys(_confirmPassword, loadProp.getProperty("confirmPassword"));
        //  Enter register Button
        clickOnElement(_registerButton);

        // clickOnElement By(className("button-1 register-continue-button"));
        // clickOnElement(By.className("button-1 register-continue-button"));

    }

}
