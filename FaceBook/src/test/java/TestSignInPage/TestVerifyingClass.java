package TestSignInPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signInPage.VerfyingLogInPage;

public class TestVerifyingClass extends CommonAPI {

    VerfyingLogInPage verfyingLogInPage;
    String homeURL = "https://www.facebook.com";
    @BeforeClass
    public void initializing(){
        driver.get(homeURL);
        verfyingLogInPage = PageFactory.initElements(driver,VerfyingLogInPage.class);
    }

    @Test
    public void testInputEmail(){
        verfyingLogInPage.putInEmail("taherjuwel@gmail.com");
        driver.navigate().back();
    }
    @Test
    public void testInputPassword(){
        verfyingLogInPage.putInpass("juwel5415367");
    }

    @Test
    public void inputFirstName(){
        verfyingLogInPage.typeOnInputFirstName("MD ABU");
    }

//    @Test
//    public void inputSureName(){
//        verfyingLogInPage.typeOnSUreNameInput();
//    }

    @Test
    public void variFyday(){
      CommonAPI.getTextFromWebElements("day");
    }
    @Test
    public void testDayDOB(){
        verfyingLogInPage.dayfromDOB();
    }

    @Test
    public void testSurName(){
        verfyingLogInPage.setSurnameInput("Jewal Ahmed");
    }
    @Test
    public void testEmailSignUpInput(){
        verfyingLogInPage.setEmailSignUpInput("taherjuwel@424.gmail.com");
    }
    @Test
    public void testSignUpPass(){
        verfyingLogInPage.setSignupPass("Jewal12345678");
    }
    @Test
    public void testGenderSeletion(){
        verfyingLogInPage.setSelectGender();
    }
    @Test
    public void testSignUpButton(){
        verfyingLogInPage.setClickSignUp();
    }













//    @Test
//    public void test1(){
//        driver.findElement(By.id("email")).sendKeys("jewal ahmed", Keys.ENTER);
//    }

}
