package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistryPage {
    private WebDriver driver;
    private String title = "Amazon Registry & Gifting";
    public RegistryPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }

    public void verifyTitle(){
        Assert.assertEquals(getTitle(), title);
    }
}
