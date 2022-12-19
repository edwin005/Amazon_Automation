package pages;

import org.openqa.selenium.WebDriver;

public class GiftCardsPage {
    private WebDriver driver;

    public GiftCardsPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
