package pages.menus;

import actions.RepetitiveActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;

import static actions.RepetitiveActions.getInstanceRepetitiveActions;

public class AccountAndListsMenu {
    WebDriver driver;

    public AccountAndListsMenu(WebDriver driver){
        this.driver = driver;
    }

    private By signInButton = By.xpath("//a[@data-nav-ref='nav_signin']");
    private By signOutButton = By.id("nav-item-signout");

    public SignInPage clickOnSignInButton(){
       getInstanceRepetitiveActions().clickOn(signInButton);
       return new SignInPage(driver);
    }

    public SignInPage clickOnSignOutButton(){
        getInstanceRepetitiveActions().clickOn(signOutButton);
        return new SignInPage(driver);
    }
}
