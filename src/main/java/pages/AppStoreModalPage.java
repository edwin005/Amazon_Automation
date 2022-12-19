package pages;

import org.openqa.selenium.WebDriver;

public class AppStoreModalPage {
    private WebDriver driver;

    public AppStoreModalPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
