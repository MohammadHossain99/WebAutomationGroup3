package testulta;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import ulta.UltaSignUpPage;

public class UltaTestSignUpPage extends CommonAPI {

    UltaSignUpPage ultaSignUpPage;
    String signUpPageUrl = "https://pages.exacttarget.com/ulta-email-signup/";

    @BeforeMethod

    public void initialize() {
        driver.navigate().to(signUpPageUrl);
        ultaSignUpPage = PageFactory.initElements(driver, UltaSignUpPage.class);

    }

    @Test
    public void getTitle(){
        TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"get title of signUp page");
        driver.getTitle();
    }

    @Test
    public void testEnterFirstName() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter first name");
        ultaSignUpPage.enterFirstName("Sylvana");
    }

    @Test
    public void testEnterLastName() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter last name");
        ultaSignUpPage.enterLastName("Rahman");
    }

    @Test
    public void testEnterEmail() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter email");
        ultaSignUpPage.enterEmail("stest1010@gmail.com");
    }

    @Test
    public void testEnterZipCode() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter zipcode");
        ultaSignUpPage.enterZipCode("11208");
    }

    @Test
    public void testEnterCellBox1() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter cellbox 1");
        ultaSignUpPage.enterCellBox1("347");
    }

    @Test
    public void testEnterCellBox2() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter cellbox 2");
        ultaSignUpPage.enterCellBox2("499");
    }

    @Test
    public void testEnterCellBox3() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter cellbox 3");
        ultaSignUpPage.enterCellBox3("7676");
    }

    @Test
    public void testClickSubmit() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"click submit");
        ultaSignUpPage.clickSubmit();
    }

    @Test
    public void testSeeTermsAndConditions() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"see terms and conditions");
        ultaSignUpPage.seeTermsAndConditions();
    }

    @Test

    public void testSeePrivacyPolicy()throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"see privacy policy");
        ultaSignUpPage.seePrivacyPolicy();
    }


}
