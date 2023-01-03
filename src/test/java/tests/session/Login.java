package tests.session;

import io.qameta.allure.Description;
import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import pages.menus.AllMenu;

import static actions.RepetitiveActions.getInstanceRepetitiveActions;

public class Login extends BaseTests {

    @BeforeMethod
    public void refreshPage(){
        getInstanceRepetitiveActions().navigateTo("https://www.amazon.com");
    }

    @Test(priority = 0)
    @Description("log in through hover on Account and Lists menu.")
    public void loginThruHoverOnAccountAndListsMenu() throws Exception {
       homePage.verifySignedOutHelloLabel();
       getInstanceRepetitiveActions().login();
       homePage.verifySignedInHelloLabel();
       getInstanceRepetitiveActions().logout();
    }

    @Test(priority = 1)
    @Description("Log in through click on Account and Lists menu.")
    public void loginThruClickOnAccountAndListsMenu() throws Exception {
        homePage.verifySignedOutHelloLabel();
        SignInPage signInPage = (SignInPage) homePage.clickOnAccountAndListTab();
        signInPage.verifyTitle();
        signInPage.typeUsername();
        signInPage.clickOnContinueButton();
        signInPage.typePassword();
        HomePage signedInHomePage = signInPage.clickOnSignInButton();
        signedInHomePage.verifySignedInHelloLabel();
        getInstanceRepetitiveActions().logout();
    }

    @Test(priority = 2)
    @Description("Log in through click on Sign in button on All menu.")
    public void loginThruClickOnAllMenuSignInButton() throws Exception {
        homePage.verifySignedOutHelloLabel();
        AllMenu allMenu = homePage.clickOnAllMenuTab();
        SignInPage signInPage = allMenu.clickOnSignInButton();
        signInPage.verifyTitle();
        signInPage.typeUsername();
        signInPage.clickOnContinueButton();
        signInPage.typePassword();
        HomePage signedInHomePage = signInPage.clickOnSignInButton();
        signedInHomePage.verifySignedInHelloLabel();
        getInstanceRepetitiveActions().logout();
    }

    @Test(priority = 3)
    @Description("Try to log in with invalid email.")
    public void loginWithInvalidEmail() throws Exception {
        homePage.verifySignedOutHelloLabel();
        AllMenu allMenu = homePage.clickOnAllMenuTab();
        SignInPage signInPage = allMenu.clickOnSignInButton();
        signInPage.verifyTitle();
        signInPage.typeUsername("testing");
        signInPage.clickOnContinueButton();
        signInPage.verifyProblemHeader();
        signInPage.verifyInvalidEmailMessage();
    }

    @Test(priority = 4)
    @Description("Try to log in with invalid email.")
    public void loginWithIncorrectPassword() throws Exception {
        homePage.verifySignedOutHelloLabel();
        AllMenu allMenu = homePage.clickOnAllMenuTab();
        SignInPage signInPage = allMenu.clickOnSignInButton();
        signInPage.verifyTitle();
        signInPage.typeUsername();
        signInPage.clickOnContinueButton();
        signInPage.typePassword("Testing");
        signInPage.clickOnSignInButton();
        signInPage.verifyProblemHeader();
        signInPage.verifyIncorrectPasswordMessage();
    }
}
