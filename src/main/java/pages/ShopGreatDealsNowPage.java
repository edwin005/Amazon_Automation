package pages;

import org.openqa.selenium.WebDriver;

public class ShopGreatDealsNowPage {
    private WebDriver driver;

    public ShopGreatDealsNowPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
