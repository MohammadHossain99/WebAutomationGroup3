package test;

import base.CommonAPI;
import homePage.LoginAuthentication;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginAuthentication extends CommonAPI {
    LoginAuthentication loginAuthentication;

    @BeforeMethod
    public void initializing() {
        driver.get("https://account.bbc.com/signin/");
        driver.findElement(By.name("username")).sendKeys("enter username");
        driver.findElement(By.name("password")).sendKeys("enter password");
        loginAuthentication = PageFactory.initElements(driver, LoginAuthentication.class);
    }

    @Test
    public void testsearchInput() {
        loginAuthentication.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
