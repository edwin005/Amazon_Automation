package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GiftCardsPage {
    private WebDriver driver;
    private String title = "Amazon.com Gift Cards";

    public GiftCardsPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }

    public void verifyTitle(){
        Assert.assertEquals(getTitle(), title);
    }
}
