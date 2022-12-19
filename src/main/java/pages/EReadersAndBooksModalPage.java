package pages;

import org.openqa.selenium.WebDriver;

public class EReadersAndBooksModalPage {

    private WebDriver driver;

    public EReadersAndBooksModalPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
