package tests;

import actions.RepetitiveActions;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class todaysDealTests extends BaseTests {
    // private String fileLocation = "C:\\Users\\admin\\Desktop\\My Desktop\\Selenium Project\\Task-Automation GBH\\data\\GBH_Web_Site.xlsx";

   // private String innovationSquadTitle = getValueFromExcel(1,0);



//    private String getValueFromExcel(int rowIndex, int columnIndex){
//        return Util.getUtilInstance().readExcel(fileLocation, 0, rowIndex, columnIndex);
//    }


    @Test(priority = 0)
    public void VerifyPageTitle(){
        TodaysDealPage todaysDealPage = homePage.clickOnTodaysDealTab();
        todaysDealPage.verifyTitle();
    }
}