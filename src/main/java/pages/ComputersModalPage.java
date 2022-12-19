package pages;

import org.openqa.selenium.WebDriver;

public class ComputersModalPage {
    WebDriver driver;
    public ComputersModalPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
