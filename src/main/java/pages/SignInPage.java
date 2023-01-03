package pages;

import actions.RepetitiveActions;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private String username = "automationtestingemail1@gmail.com";
    private String password = "Automationtesting";

    private String problemMessageHeader = "There was a problem";
    private String invalidEmailMessage = "We cannot find an account with that email address";
    private String incorrectPasswordMessage = "Your password is incorrect";

    private WebDriver driver;
    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    private String title = "Amazon Sign-In";
    private By emailAndPhoneInput = By.id("ap_email");
    private By continueButton = By.id("continue");
    private By passwordInput = By.id("ap_password");
    private By signInButton = By.id("signInSubmit");

    private By errorMessageHeader = By.xpath("//div[@class='a-box-inner a-alert-container']/h4");
    private By errorMessageBody = By.xpath("//ul/li/span[@class='a-list-item']");

    public String getTitle(){
        return driver.getTitle();
    }

    public void verifyTitle(){
        Assert.assertEquals(getTitle(), title);
    }

    public void typeUsername(){
        RepetitiveActions.getInstanceRepetitiveActions().setText(emailAndPhoneInput, username);
    }

    public void typePassword(){
        RepetitiveActions.getInstanceRepetitiveActions().setText(passwordInput, password);
    }

    public void typeUsername(String username){
        RepetitiveActions.getInstanceRepetitiveActions().setText(emailAndPhoneInput, username);
    }

    public void typePassword(String password){
        RepetitiveActions.getInstanceRepetitiveActions().setText(passwordInput, password);
    }

    public void clickOnContinueButton(){
        RepetitiveActions.getInstanceRepetitiveActions().clickOn(continueButton);
    }

    public HomePage clickOnSignInButton(){
        RepetitiveActions.getInstanceRepetitiveActions().clickOn(signInButton);
        return new HomePage(driver);
    }

    public void verifyProblemHeader(){
        RepetitiveActions.getInstanceRepetitiveActions().verifyText(errorMessageHeader, problemMessageHeader);
    }

    public void verifyInvalidEmailMessage(){
        RepetitiveActions.getInstanceRepetitiveActions().verifyText(errorMessageBody, invalidEmailMessage);
    }

    public void verifyIncorrectPasswordMessage(){
        RepetitiveActions.getInstanceRepetitiveActions().verifyText(errorMessageBody, incorrectPasswordMessage);
    }
}
