package linkedin;

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

    @FindBy(linkText = "Sign Up")
    WebElement signUp;

    @FindBy(linkText = "Help Center")
    WebElement helpCenter;

    @FindBy(linkText = "About")
    WebElement about;

    @FindBy(linkText = "Press")
    WebElement press;

    @FindBy(linkText = "Blog")
    WebElement blog;

    @FindBy(linkText = "Careers")
    WebElement careers;

    @FindBy(linkText = "Developers")
    WebElement developers;

    @FindBy(linkText = "Talent")
    WebElement talent;

    @FindBy(linkText = "Marketing")
    WebElement marketing;

    @FindBy(linkText = "Sales")
    WebElement sales;

    @FindBy(linkText = "Learning")
    WebElement learning;

    @FindBy(linkText = "Company Pages")
    WebElement companyPages;

    @FindBy(linkText = "Browse by country/region")
    WebElement browseByRegion;

    public void getTitleOfHomePage(){
        driver.getTitle();
        String expectedTitle="";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    public void registerLinkedIn() {
        inputFirstName("Selenium");
        inputLastName("Test");
        inputEmail("stest7380@gmail.com");
         inputPassword("stest312@t");
         submitRegistration();
        String expectedUrl="https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void registerNoLastName() throws Exception{
        inputFirstName("Selenium");
        inputEmail("stest7380@gmail.com");
        inputPassword("stest312@t");
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your last name";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());
    }

    public void registerNoEmail() throws Exception{
        inputFirstName("Selenium");
        inputLastName("Test");
        inputPassword("stest312@t");
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your email address";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());

    }

    public void registerNoPassword() throws Exception{
        inputFirstName("Selenium");
        inputLastName("Test");
        inputEmail("stest7380@gmail.com");
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your password";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());

    }

    public void registerNoCredentials() throws Exception{
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your first name";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());
    }

    public void inputFirstName(String fName){
        firstNameInput.sendKeys(fName);
        String expectedUrl="https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void inputLastName(String lName){
        lastNameInput.sendKeys(lName);
        String expectedUrl="https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void inputEmail(String email){
        emailInput.sendKeys(email);
        String expectedUrl="https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void inputPassword(String passWord){
        passwordInput.sendKeys(passWord);
        String expectedUrl="https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
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

    public void setForgotPassword() throws Exception{
        forgotPassword.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/uas/request-password-reset?trk=uno-reg-guest-home-forgot-password";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

    }

    public void invalidLogInCredentials() throws Exception{
       enterEmailLogin("blah blah blah");
       enterPasswordLogin("blah blah");
       logIn();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/uas/login-submit?loginSubmitSource=GUEST_HOME";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }


    public void logInLinkedIn(String email, String password ) throws Exception{
        enterEmailLogin(email);
        enterPasswordLogin(password);
        logIn();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );
    }

    public void signUpPage() throws Exception{signUp.click();Thread.sleep(3000);String expectedUrl = "https://www.linkedin.com/start/join?trk=uno-reg-guest-home-join";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void helpCenterPage() throws Exception{helpCenter.click();Thread.sleep(3000);String expectedUrl = "https://www.linkedin.com/help/linkedin?trk=uno-reg-guest-home-help-center&lang=en";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void aboutPage() throws Exception{about.click();Thread.sleep(3000);String expectedUrl = "https://about.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void pressPage() throws Exception{press.click();Thread.sleep(3000);String expectedUrl = "https://news.linkedin.com/?trk=uno-reg-guest-home-press";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void blogPage() throws Exception{blog.click();Thread.sleep(3000);String expectedUrl = "https://blog.linkedin.com/?trk=uno-reg-guest-home-blog";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void careersPage() throws Exception{careers.click();Thread.sleep(3000);String expectedUrl = "https://www.linkedin.com/authwall?trk=gf&trkInfo=AQFX6QoYgAvJFAAAAWm8ut4ItqmTj6r4CsvvF8rAQyTbKkzOddaxqQvGRTvpd7ciwqnTybKa13QLBhfOwnATZ_gn77Kg1EBboCrnYP5983cpim4XBmHeDJfqu0k9E3V2RBOESY0=&originalReferer=https://www.linkedin.com/&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Flinkedin%2Fcareers%3Ftrk%3Duno-reg-guest-home-careers";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void developersPage() throws Exception{developers.click();Thread.sleep(3000);String expectedUrl = "https://www.linkedin.com/developers?trk=uno-reg-guest-home-developers";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void talentPage() throws Exception{talent.click();Thread.sleep(3000);String expectedUrl = "https://business.linkedin.com/talent-solutions?src=li-footer&utm_source=linkedin&utm_medium=footer&trk=uno-reg-guest-home-enterprise-talent";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void marketingPage() throws Exception{marketing.click();Thread.sleep(3000);String expectedUrl = "https://business.linkedin.com/marketing-solutions?src=li-footer&utm_source=linkedin&utm_medium=footer&trk=uno-reg-guest-home-enterprise-marketing";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void salesPage() throws Exception{sales.click();Thread.sleep(3000);String expectedUrl = "https://business.linkedin.com/sales-solutions?src=li-footer&utm_source=linkedin&utm_medium=footer&trk=uno-reg-guest-home-enterprise-sales";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void learningPage() throws Exception{learning.click();Thread.sleep(3000);String expectedUrl = "https://learning.linkedin.com/?src=li-footer&trk=uno-reg-guest-home-enterprise-learning";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void companyPagesLink() throws Exception{companyPages.click();Thread.sleep(3000);String expectedUrl = "https://business.linkedin.com/marketing-solutions/linkedin-pages?src=li-footer&trk=uno-reg-guest-home-enterprise-company-pages";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}

    public void browsByRegionPage() throws Exception{browseByRegion.click();Thread.sleep(3000);String expectedUrl = "https://www.linkedin.com/authwall?trk=ripf&trkInfo=AQEHsFt7fRYVDQAAAWm8v4Vw_6tk3aCevomgVbdh6VWBE8XZpCzS2TPSyUr2u1xNPagn2QwrGLJ44G6U5yi6f7-vuw3MV2x_dayrs-hgS1HcmW86_A7a6C35nzPer4ZrCybUx_c=&originalReferer=https://www.linkedin.com/&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fdirectory%2Fcountry_listing%2F%3Ftrk%3Duno-reg-guest-home-country";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );}


}
