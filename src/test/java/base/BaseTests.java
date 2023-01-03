package base;

import actions.RepetitiveActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CustomerServicePage;
import pages.HomePage;

import java.time.Duration;
import java.util.List;

public class BaseTests {
    WebDriver driver;
    private String url = "https://www.amazon.com/";
    protected HomePage homePage;
    RepetitiveActions repetitiveActions = RepetitiveActions.getInstanceRepetitiveActions();
    @BeforeClass
    public void setUp(){
        driver = repetitiveActions.setUp(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        homePage = new HomePage(driver);
        RepetitiveActions.getInstanceRepetitiveActions().clickOnDontChangebtn();
    }

    @AfterClass
    public void tearDown(){
        repetitiveActions.tearDown();
    }

}
