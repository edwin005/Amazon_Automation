package pages;

import org.openqa.selenium.WebDriver;

public class AllModalPage {
    private WebDriver driver;

    public AllModalPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
