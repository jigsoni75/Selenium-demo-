package org.example;

import org.testng.annotations.Test;

public class TestSuit1 extends BaseTest {

    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessive registrationSuccessive = new RegistrationSuccessive();
    Desktop desktop = new Desktop();
    BuildYourownComputer buildYourownComputer = new BuildYourownComputer();
    ShoppingCartSuccess shoppingCartSuccess = new ShoppingCartSuccess();
    EmailFriend emailFriend = new EmailFriend();
    EmailFriendsAssert emailFriendsAssert = new EmailFriendsAssert();
    LoadProp loadProp =new LoadProp();
    ArrangeInOrderZtoA arrangeInOrderZtoA = new ArrangeInOrderZtoA();
    NopcommerceNewRelease nopcommerceNewRelease  = new NopcommerceNewRelease();
    FaceBookNewWindow faceBookNewWindow =new FaceBookNewWindow();
    Nike nike = new Nike();

    @Test(priority = 1)

    public void ToBEVerifyUserShouldBeAbleTORegisterSuccessfully() {

        homepage.clickOnRegisterButton();
        registrationPage.UserShouldBeAbleTORegisterSuccessfully();
        registrationSuccessive.verifyUserRegisteredSuccessfully();

    }

    @Test(priority = 2)

    public void ToBEVerifyUserShouldBeAbleToBuildOwnComputer() {
        homepage.clickOnComputers();
        homepage.clickOnDeskTop();
        desktop.clickOnBuildOwnComputer();
        buildYourownComputer.buildComputer();
        shoppingCartSuccess.ShoppingMessage();
    }

    @Test(priority = 3)

    public void ToBEVerifyRegisterUeserAbletReferToTheirFriends() {

        homepage.clickOnRegisterButton();
        registrationPage.UserShouldBeAbleTORegisterSuccessfully();
        homepage.clickOnComputers();
        homepage.clickOnDeskTop();
        desktop.clickOnBuildOwnComputer();
        emailFriend.EmailFriendPage();
        emailFriendsAssert.emailSuccessfullySent();
    }

    @Test(priority = 4)

    public void ToBeVerifyuserShouldBeatableToSuccessfullyCryptocurrency() {

        homepage.clickOnCurrency();

    }

    @Test (priority = 5)

    public void ToBeVerifyregisteruserShouldBeAbleToVotForCommunityPoll() {

       homepage.verifyIfNonRegisteredUserIsAbleToVote();
       ToBEVerifyUserShouldBeAbleTORegisterSuccessfully();
       homepage.verifyRegisteredUserIsAbleToVote();

    }
    @Test (priority = 6)
    // to veryfy product title are on order
    public void veryfyProductTitleOnOrder(){

      homepage.getProductTitle();

    }
    @Test (priority = 7 )

    public void voteAlert(){

        homepage.clickOnVoteAlert();
    }

    @Test(priority = 8)
    public void facebookWindowhadle(){
     homepage.faceBookNopeCommerce();
     faceBookNewWindow.NewWindowFaceBookNopeCommerce();
    }

    @Test(priority = 9)

    public void verifyUsershouldBeAbletocategorisedBynameZtoA(){
        homepage.clickOnComputers();
        homepage.clickOnDeskTop();
        arrangeInOrderZtoA.descendingOrderZtoA();
    }
  @Test (priority = 10)
   public void  ToBeVerifyUseShoudBeAbleToleaveComment() {
   homepage.newsNewRelease();
   nopcommerceNewRelease.newRelease();

   }
    @Test (priority = 11)
   public void ToBeVerifyUseShoudBeAbleToSerchNikeOrApple(){
        homepage.searchStore();
        nike.searchNike();
   }
}
