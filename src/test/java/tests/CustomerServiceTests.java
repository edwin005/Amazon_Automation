package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerServicePage;

public class CustomerServiceTests extends BaseTests {
    private String todaysDealPageTitle = "Amazon.com - Today's Deals";

    @Test
    public void VerifyPageTitle(){
        CustomerServicePage customerServicePage = homePage.clickOnCustomerServiceTab();
        Assert.assertEquals(customerServicePage, todaysDealPageTitle);
    }
}
