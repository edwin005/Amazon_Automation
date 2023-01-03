package pages;


import actions.RepetitiveActions;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.menus.AccountAndListsMenu;
import pages.menus.AllMenu;

import static actions.RepetitiveActions.getInstanceRepetitiveActions;

public class HomePage {
    private static WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private String signedInHelloLabel = "Hello, Automation";
    private String signedOutHelloLabel = "Hello, sign in";
    private By helloLabel = By.id("nav-link-accountList-nav-line-1");
    private By todaysDealTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']");
    private By customerServiceTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_customerservice']");
    private By registryTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_registry']");
    private By giftCardsTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_gc']");
    private By sellTab = By.xpath("//a[@data-csa-c-content-id='nav_cs_sell']");
    private By allMenu = By.xpath("//a[@id='nav-hamburger-menu']");
    private By shopGreatDealsNowTab = By.xpath("//a[@id='swm-link']");
    private By shoppingCarticon = By.xpath("//a[@id='nav-cart']");
    private By laguageFlag = By.xpath("//a[@id='icp-nav-flyout']");
    private By accountAndListsTab = By.id("nav-link-accountList");

    public String getTitle(){
        return driver.getTitle();
    }

    public void verifySignedInHelloLabel(){
        Assert.assertEquals(signedInHelloLabel, driver.findElement(helloLabel).getText());
    }

    public void verifySignedOutHelloLabel() {
        Assert.assertEquals(signedOutHelloLabel, driver.findElement(helloLabel).getText());
    }

    public Object clickOnAccountAndListTab(){
        if(driver.findElement(helloLabel).getText().equalsIgnoreCase(signedOutHelloLabel)){
            getInstanceRepetitiveActions().clickOn(accountAndListsTab);
            return new SignInPage(driver);
        }else{
            //TODO
            return null;
        }
    }
    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Todays Deal" by on the respective option located in the header.
     */
    public TodaysDealPage clickOnTodaysDealTab(){
        try{

            getInstanceRepetitiveActions().clickOn(todaysDealTab);
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
            getInstanceRepetitiveActions().clickOn(sellTab);
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
            RepetitiveActions.getInstanceRepetitiveActions().clickOn(registryTab);
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
            getInstanceRepetitiveActions().clickOn(giftCardsTab);
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
            getInstanceRepetitiveActions().clickOn(customerServiceTab);
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
    public AllMenu clickOnAllMenuTab(){
        try{
            getInstanceRepetitiveActions().clickOn(allMenu);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnAllMenuTab. Exception: " + e.getMessage());
        }finally {
            return new AllMenu(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Shop Great Deals Now" by on the respective option located in the header.
     */
    public ShopGreatDealsNowPage clickOnShopGreatDealsNowTab(){
        try{
            getInstanceRepetitiveActions().clickOn(shopGreatDealsNowTab);
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
            getInstanceRepetitiveActions().clickOn(laguageFlag);
        }catch (Exception e){
            System.err.println("Exception occured. Method: clickOnCareersPage. Exception: " + e.getMessage());
        }finally {
            return new LanguagePage(driver);
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 12/12/2022
     * This method takes the user to the page "Customer Service" by on the respective option located in the header.
     */
    public AccountAndListsMenu hoverOverAccountAndListTab (){
        try{
            getInstanceRepetitiveActions().hoverMouse(accountAndListsTab);
        }catch (Exception e){
            System.err.println("Exception occured. Method: hoverOverAccountAndListTab. Exception: " + e.getMessage());
        }finally {
            return new AccountAndListsMenu(driver);
        }
    }

}
