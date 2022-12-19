package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.GeneralHelper;
import util.Util;

import java.time.Duration;
import java.util.List;

public class HomePage {
    private static WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By todaysDealTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']");
    private By customerServiceTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_customerservice']");
    private By registryTab = By.xpath("data-csa-c-content-id='nav_cs_registry'");
    private By giftCardsTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_gc']");
    private By sellTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_sell']");
    private By allMenu = By.xpath("//a[@id='nav-hamburger-menu']");
    private By shopGreatDealsNowTab = By.xpath("//a[@id='swm-link']");
    private By shoppingCarticon = By.xpath("//a[@id='nav-cart']");
    private By laguageFlag = By.xpath("//a[@id='icp-nav-flyout']");


    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Todays Deal" by on the respective option located in the header.
     */
    public TodaysDealPage clickOnTodaysDealTab(){
        try{
            GeneralHelper.clickOn(todaysDealTab);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnTodaysDealTab. Exception: " + e.getMessage());
        }finally {
            return new TodaysDealPage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Sell" by on the respective option located in the header.
     */
    public SellPage clickOnSellTab(){
        try{
            GeneralHelper.clickOn(sellTab);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnSellTab. Exception: " + e.getMessage());
        }finally {
            return new SellPage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Registry" by on the respective option located in the header.
     */
    public RegistryPage clickOnRegistryTab(){
        try{
            GeneralHelper.clickOn(registryTab);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnRegistryTab. Exception: " + e.getMessage());
        }finally {
            return new RegistryPage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Customer Service" by on the respective option located in the header.
     */
    public GiftCardsPage clickOnGiftCardsTab(){
        try{
            GeneralHelper.clickOn(giftCardsTab);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnGiftCardsTab. Exception: " + e.getMessage());
        }finally {
            return new GiftCardsPage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Customer Service" by on the respective option located in the header.
     */
    public CustomerServicePage clickOnCustomerServiceTab(){
        try{
            GeneralHelper.clickOn(customerServiceTab);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnCustomerServiceTab. Exception: " + e.getMessage());
        }finally {
            return new CustomerServicePage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Customer Service" by on the respective option located in the header.
     */
    public AllModalPage clickOnAllMenuTab(){
        try{
            GeneralHelper.clickOn(allMenu);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnAllMenuTab. Exception: " + e.getMessage());
        }finally {
            return new AllModalPage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Shop Great Deals Now" by on the respective option located in the header.
     */
    public ShopGreatDealsNowPage clickOnShopGreatDealsNowTab(){
        try{
            GeneralHelper.clickOn(shopGreatDealsNowTab);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnShopGreatDealsNowTab. Exception: " + e.getMessage());
        }finally {
            return new ShopGreatDealsNowPage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Customer Service" by on the respective option located in the header.
     */
    public LanguagePage clickOnLanguageFlag (){
        try{
            GeneralHelper.clickOn(laguageFlag);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnCareersPage. Exception: " + e.getMessage());
        }finally {
            return new LanguagePage(driver);
        }
    }



}
