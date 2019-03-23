import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(css = "#reg-firstname")
    WebElement firstNameInput;

    @FindBy(css = "#reg-lastname")
    WebElement lastNameInput;

    @FindBy(css = "#reg-email")
    WebElement emailInput;

    @FindBy(css = "#reg-password")
    WebElement passwordInput;

    @FindBy(id = "registration-submit")
    WebElement registerButton;

    @FindBy(className = "reg-alert")
    WebElement alert;

    @FindBy(id = "login-email")
    WebElement loginEmail;

    @FindBy(id="login-password")
    WebElement loginPassword;

    @FindBy(id="login-submit")
    WebElement loginButton;

    @FindBy(linkText = "Forgot password?")
    WebElement forgotPassword;

    public void inputFirstName(String fName){
        firstNameInput.sendKeys(fName);
    }

    public void inputLastName(String lName){
        lastNameInput.sendKeys(lName);
    }

    public void inputEmail(String email){
        emailInput.sendKeys(email);
    }

    public void inputPassword(String passWord){
        passwordInput.sendKeys(passWord);
    }

    public void submitRegistration(){
        registerButton.click();
    }

    public String alertText(){
        boolean alertMsg = alert.isDisplayed();
        System.out.println(alert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "";

        return expectedAlert ;
    }

    public void enterEmailLogin(String email){
        loginEmail.sendKeys(email);
    }

    public void enterPasswordLogin(String password){
        loginPassword.sendKeys(password);
    }

    public void logIn(){
        loginButton.click();
    }

    public void setForgotPassword(){
        forgotPassword.click();

    }
    //
//    public void logInLinkedIn(String email, String password ){
//        enterEmailLogin(email);
//        enterPasswordLogin(password);
//        logIn();
//    }
}
