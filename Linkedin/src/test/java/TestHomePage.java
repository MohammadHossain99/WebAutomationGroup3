import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage homePage;
    String homePageUrl = "https://www.linkedin.com/";

    @BeforeMethod
    public void initialize(){
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }

    @Test
    public void getTitleOfHomePage(){
        driver.getTitle();
    }

    @Test
    public void enterFirstName(){
        homePage.inputFirstName("Selenium");
    }

    @Test
    public void enterLastName(){
        homePage.inputLastName("Test");
    }

    @Test
    public void enterEmail(){
        homePage.inputEmail("stest7380@gmail.com");
    }

    @Test
    public void enterPassword(){
        homePage.inputPassword("stest312@t");
    }

    @Test
    public void registerButton(){
        homePage.submitRegistration();
    }

    @Test(priority = 6)
    public void registerForLinkedIn() throws Exception{
        enterFirstName();
        enterLastName();
        enterEmail();
        enterPassword();
        registerButton();
        Thread.sleep(4000);
//        String urlExpected = "https://www.linkedin.com/onboarding/start/profile-location/new/";
//        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);

    }

    @Test
    public void registerWithNoLastName() throws Exception{
        enterFirstName();
        enterEmail();
        enterPassword();
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your last name";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);
        System.out.println(homePage.alert.getText());
    }

    @Test
    public void registerWithNoEmail() throws Exception{
        enterFirstName();
        enterLastName();
        enterPassword();
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your email address";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);
        System.out.println(homePage.alert.getText());

    }
    @Test
    public void registerWithNoPassword() throws Exception{
        enterFirstName();
        enterLastName();
        enterEmail();
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your password";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);
        System.out.println(homePage.alert.getText());

    }

    @Test
    public void registerWithNoCredentials() throws Exception{
        registerButton();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your first name";
        Assert.assertEquals(homePage.alert.getText(), expectedAlert);
        System.out.println(homePage.alert.getText());
    }

    @Test
    public void emailLogin(){
        homePage.enterEmailLogin("stest7380@gmail.com");
    }

    @Test
    public void passwordLogin(){
        homePage.enterPasswordLogin("stest312@t");
    }


    @Test
    public void signIn() throws Exception{
        emailLogin();
        passwordLogin();
        homePage.logIn();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl );
    }

    @Test
    public void invalidLogInCredentials() throws Exception{
        homePage.enterEmailLogin("blah blah blah");
        homePage.enterPasswordLogin("blah blah");
        homePage.logIn();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/uas/login-submit?loginSubmitSource=GUEST_HOME";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void navigateToForgotPasswordPage() throws Exception{
        homePage.setForgotPassword();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/uas/request-password-reset?trk=uno-reg-guest-home-forgot-password";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void viewSignUpPage(){homePage.signUpPage();}

    @Test
    public void viewHelpCenterPage(){homePage.helpCenterPage();}

    @Test
    public void viewAboutPage(){homePage.aboutPage();}

    @Test
    public void viewPressPage(){homePage.pressPage();}

    @Test
    public void viewBlogPage(){homePage.blogPage();}

    @Test
    public void viewCareersPage(){homePage.careersPage();}

    @Test
    public void viewDevelopersPage(){homePage.developersPage();}

    @Test
    public void viewTalentPage(){homePage.talentPage();}

    @Test
    public void viewMarketingPage(){homePage.marketingPage();}

    @Test
    public void viewSalesPage(){homePage.salesPage();}

    @Test
    public void a(){}



}
