package pages;

import org.openqa.selenium.WebDriver;

public class CustomerServicePage {
    private WebDriver driver;

    public CustomerServicePage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
