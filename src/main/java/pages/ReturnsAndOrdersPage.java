package pages;

import org.openqa.selenium.WebDriver;

public class ReturnsAndOrdersPage {
    private WebDriver driver;

    public ReturnsAndOrdersPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
