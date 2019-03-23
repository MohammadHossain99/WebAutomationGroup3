package TestSignInPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signInPage.SignInOnly;

public class TestSignInonly extends CommonAPI {

    String homeUrl ="https://www.facebook.com/";
    SignInOnly signInOnly;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        signInOnly = PageFactory.initElements(driver,SignInOnly.class);
    }

    @Test
    public void testLogInEmail(){
        signInOnly.setLoginEmail("taherjuwel362@gmail.com");
    }
    @Test
    public void testLogInPass(){
        signInOnly.setLoginPassword("Juwel1234");
    }
    @Test
    public void testLogInTab(){
        signInOnly.setLoginTab();
    }



}
