package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GeneralHelper {
    private static WebDriver driver;
    public GeneralHelper(WebDriver driver){
        this.driver = driver;
    }
    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 03/30/2022
     * This method is to click on an element.
     * @param element is the element we want the mouse to interact with.
     */
    public static void clickOn(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 03/30/2022
     * This method allows us hover the mouse over an element.
     * @param element is the element we want the mouse to interact with.
     */
    public static void hoverMouse(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        WebElement webElement = driver.findElement(element);
        Actions action = new Actions(driver);
        action.moveToElement(webElement).perform();
    }

    public static int countLinks(){
        List<WebElement> links = driver.findElements(By.tagName("a"));
        return links.size();
    }

}
