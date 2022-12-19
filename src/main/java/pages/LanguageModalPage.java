package pages;

import org.openqa.selenium.WebDriver;

public class LanguageModalPage {
    private WebDriver driver;

    public LanguageModalPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
