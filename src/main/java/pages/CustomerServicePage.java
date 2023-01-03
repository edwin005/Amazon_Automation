package pages;

import actions.RepetitiveActions;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class CustomerServicePage {
    private WebDriver driver;
    private String title = "Amazon Customer Service Support – Amazon.com";

    public CustomerServicePage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }

    public void verifyTitle(){
        Assert.assertEquals(getTitle(), title);
    }
}
