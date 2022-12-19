package pages;

import org.openqa.selenium.WebDriver;

public class SellPage {

    private WebDriver driver;

    public SellPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }

}
