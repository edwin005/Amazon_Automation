package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.CustomerServicePage;
import pages.GiftCardsPage;
import pages.RegistryPage;
import pages.TodaysDealPage;

public class VerifyPages extends BaseTests {

    private String todaysDealPageTitle = "Amazon.com - Today's Deals";
    private String customerServiceTitle = "Amazon Customer Service Support – Amazon.com";
    private String registryTitle = "Amazon Registry & Gifting";
    private String GiftCardsTitle = "Amazon.com Gift Cards";

    @Test
    public void VerifyCustomerServicePageTitle(){
        CustomerServicePage customerServicePage = homePage.clickOnCustomerServiceTab();
        customerServicePage.verifyTitle();
    }

    @Test(priority = 0)
    public void VerifyDealsPageTitle(){
        TodaysDealPage todaysDealPage = homePage.clickOnTodaysDealTab();
        todaysDealPage.verifyTitle();
    }

    @Test(priority = 0)
    public void VerifyGiftCardPageTitle(){
        GiftCardsPage giftCardsPage = homePage.clickOnGiftCardsTab();
        giftCardsPage.verifyTitle();
    }

    @Test(priority = 0)
    public void VerifyRegistryPageTitle(){
        RegistryPage registryPage = homePage.clickOnRegistryTab();
        registryPage.verifyTitle();
    }

}
