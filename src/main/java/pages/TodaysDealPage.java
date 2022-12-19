package pages;

import org.openqa.selenium.WebDriver;

public class TodaysDealPage {
    private WebDriver driver;

    public TodaysDealPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
