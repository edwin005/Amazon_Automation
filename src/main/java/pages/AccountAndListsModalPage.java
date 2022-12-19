package pages;

import org.openqa.selenium.WebDriver;

public class AccountAndListsModalPage {
    private WebDriver driver;

    public AccountAndListsModalPage(WebDriver driver){ this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
