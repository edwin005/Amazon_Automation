package pages;

import org.openqa.selenium.WebDriver;

public class AmazonMusicModalPage {
    private WebDriver driver;

    public AmazonMusicModalPage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }
}
