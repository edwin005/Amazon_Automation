package pages;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class TodaysDealPage {
    private WebDriver driver;
    private String todaysDealPageTitle = "Amazon.com - Today's Deals";
    public TodaysDealPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }

    public void verifyTitle(){
        Assert.assertEquals(getTitle(), todaysDealPageTitle);
    }
}
