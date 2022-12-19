package pages;

import org.checkerframework.checker.builder.qual.CalledMethods;
import org.openqa.selenium.WebDriver;

public class LanguagePage {
    private WebDriver driver;

    public LanguagePage(WebDriver driver){this.driver = driver;}

    public String getTitle(){
        return driver.getTitle();
    }

}
