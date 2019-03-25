package TestSignInPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import signInPage.SignInOnly;

public class TestSignInonly extends CommonAPI {

    String homeUrl ="https://www.facebook.com/";
    SignInOnly signInOnly;

    @BeforeMethod
    public void initializing(){

        driver.get(homeUrl);
        signInOnly = PageFactory.initElements(driver,SignInOnly.class);
    }

    @Test
    public void testLogInEmail(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInOnly.setLoginEmail("taherjuwel362@gmail.com");
    }
    @Test
    public void testLogInPass(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInOnly.setLoginPassword("Juwel1234");
    }
    @Test
    public void testLogInTab(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInOnly.setLoginTab();
    }
}
