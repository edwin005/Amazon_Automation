package pages;

import org.openqa.selenium.WebDriver;

public class Microsoft365Page {
    private WebDriver driver;

    public Microsoft365Page(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
