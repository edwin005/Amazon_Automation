package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import pages.SignInPage;
import pages.menus.AccountAndListsMenu;
import pages.menus.AllMenu;

import java.time.Duration;
import java.util.List;

public class RepetitiveActions {

    private RepetitiveActions(){}
    private static RepetitiveActions instanceRepetitiveActions = null;

    private volatile WebDriver driver;

    public static RepetitiveActions getInstanceRepetitiveActions(){
        if(instanceRepetitiveActions == null){
            synchronized (RepetitiveActions.class){
                if(instanceRepetitiveActions == null){
                    instanceRepetitiveActions = new RepetitiveActions();
                }
            }
        }
        return instanceRepetitiveActions;
    }

    public WebDriver getInstanceDriver(){
        if(driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public WebDriver setUp(String url){
        try{
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
            driver = getInstanceDriver();
            visit(url);
            driver.manage().window().maximize();
        } catch (Exception e){
            System.err.println("Exception in method setUP: " + e.getMessage());
        } finally {
            return driver;
        }
    }

    public void tearDown(){
        try{
            driver.quit();
        }catch (Exception e){
            System.err.println("Exception in method tearDown: " + e.getMessage());
        }
    }

    public void visit(String url){
        try{
            driver.get(url);
        }catch (Exception e){
            System.err.println("Exception in method visit: " + e.getMessage());
        }
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public void clickOnDontChangebtn(){
        try{
            WebElement dontChange = driver.findElement(By.xpath("//input[@data-action-type=\"DISMISS\"]"));
            dontChange.click();
        }catch (Exception e){
            System.err.println("Exception in method clickOnDontChangebtn: " + e.getMessage());
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/28/2022
     * This method is to click on an element.
     * @param element is the element we want the mouse to interact with.
     */
    public void clickOn(By element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
        }catch (Exception e){
            System.err.println("Exception in method clickOn: " + e.getMessage());
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/30/2022
     * This method allows us to set the text in an input element.
     * @param element is the element we want to interact with.
     */
    public void setText(By element, String text){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).sendKeys(text);
        }catch (Exception e){
            System.err.println("Exception in method setText: " + e.getMessage());
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/30/2022
     * This method allows us to verify the text in an input element.
     * @param element is the element we want to interact with.
     */
    public void verifyText(By element, String text){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            Assert.assertEquals(driver.findElement(element).getText(), text);
        }catch (Exception e){
            System.err.println("Exception in method verifyText: " + e.getMessage());
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/28/2022
     * This method allows us to hover the mouse over an element.
     * @param element is the element we want the mouse to interact with.
     */
    public void hoverMouse(By element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            WebElement webElement = driver.findElement(element);
            Actions action = new Actions(driver);
            action.moveToElement(webElement).perform();
        }catch (Exception e){
            System.err.println("Exception in method hoverMouse: " + e.getMessage());
        }
    }

    public int countLinks(){
        List<WebElement> links = driver.findElements(By.tagName("a"));
        return links.size();
    }

    public HomePage login(){
        try {
            HomePage homePage = new HomePage(driver);
            AccountAndListsMenu accountAndListsMenu = homePage.hoverOverAccountAndListTab();
            SignInPage signInPage = accountAndListsMenu.clickOnSignInButton();
            signInPage.verifyTitle();
            signInPage.typeUsername();
            signInPage.clickOnContinueButton();
            signInPage.typePassword();
            signInPage.clickOnSignInButton();
        } catch (Exception e){
            System.err.println("Exception in method login: " + e.getMessage());
        }finally {
            return new HomePage(driver);
        }
    }

    public SignInPage logout() throws Exception{
        HomePage homePage = new HomePage(driver);
        AllMenu allMenu = homePage.clickOnAllMenuTab();
        return allMenu.clickOnSignOutButton();
    }
}
