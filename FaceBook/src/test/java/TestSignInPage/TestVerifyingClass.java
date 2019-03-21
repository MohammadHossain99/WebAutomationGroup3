package TestSignInPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signInPage.VerfyingLogInPage;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testFaceBookLogoIsDisplayed(){
        verfyingLogInPage.setTestFaceBookLogo();
    }

    String  DOB = "09-May-1992";
    String[] arrayDob = DOB.split("-");

    @Test
    public void selectingMonth(){
        WebElement month = driver.findElement(By.id("month"));
        verfyingLogInPage.setMonthInDropDown(month,arrayDob[1]);
    }
    @Test
    public void selectingday(){
        WebElement day= driver.findElement(By.id("day"));
        verfyingLogInPage.setMonthInDropDown(day,arrayDob[0]);
    }
    @Test
    public void selectingyear(){
        WebElement year = driver.findElement(By.id("year"));
        verfyingLogInPage.setMonthInDropDown(year,arrayDob[2]);
    }


    @Test
    public void getElement(){
       List<Integer> str = new ArrayList<Integer>();
    //  str= driver.findElements(By.id("year"));

    }






}
