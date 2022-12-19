package pages;

import org.openqa.selenium.WebDriver;

public class RegistryPage {
    private WebDriver driver;

    public RegistryPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
