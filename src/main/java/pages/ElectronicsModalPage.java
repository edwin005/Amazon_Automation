package pages;

import org.openqa.selenium.WebDriver;

public class ElectronicsModalPage {

    private WebDriver driver;

    public ElectronicsModalPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
