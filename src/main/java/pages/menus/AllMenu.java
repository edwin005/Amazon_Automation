package pages.menus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;

import static actions.RepetitiveActions.getInstanceRepetitiveActions;

public class AllMenu {
    private WebDriver driver;

    public AllMenu(WebDriver driver){this.driver = driver;}

    private By signOutButton = By.xpath("//li/a[contains(text(), 'Sign Out')]");
    private By signInButton = By.xpath("//li/a[contains(text(), 'Sign in')]");

    public String getTitle(){
        return driver.getTitle();
    }

    public SignInPage clickOnSignOutButton(){
        getInstanceRepetitiveActions().clickOn(signOutButton);
        return new SignInPage(driver);
    }

    public SignInPage clickOnSignInButton(){
        getInstanceRepetitiveActions().clickOn(signInButton);
        return new SignInPage(driver);
    }
}
