package tests.session;

import base.BaseTests;
import org.testng.annotations.*;
import pages.SignInPage;
import pages.menus.AccountAndListsMenu;
import pages.menus.AllMenu;

import static actions.RepetitiveActions.getInstanceRepetitiveActions;

public class Logout extends BaseTests {

    @BeforeMethod
    public void refreshPage(){
        getInstanceRepetitiveActions().navigateTo("https://www.amazon.com");
    }

    @Test(priority = 0)
    public void logoutThruHoverOnAccountAndListsMenu(){
        getInstanceRepetitiveActions().login();
        homePage.verifySignedInHelloLabel();
        AccountAndListsMenu accountAndListsMenu = homePage.hoverOverAccountAndListTab();
        SignInPage signInPage = accountAndListsMenu.clickOnSignOutButton();
        signInPage.verifyTitle();
    }

    @Test(priority = 1)
    public void logoutThruAllMenu(){
        getInstanceRepetitiveActions().login();
        homePage.verifySignedInHelloLabel();
        AllMenu allModal = homePage.clickOnAllMenuTab();
        SignInPage signInPage = allModal.clickOnSignOutButton();
        signInPage.verifyTitle();
    }
}
