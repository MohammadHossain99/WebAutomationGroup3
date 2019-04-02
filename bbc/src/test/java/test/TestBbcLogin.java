package test;

import base.CommonAPI;
import homePage.BbcAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcLogin extends CommonAPI {
    BbcAccount bbcAccount;
    //String bbcxpath = "//*[@id=\"orb-nav-links\"]/ul/li[2]";

    @BeforeMethod
    public void initializing() {
        driver.get("https://account.bbc.com/signin/");
        driver.findElement(By.name("username")).sendKeys("mshossain1166@gmail.com");
        driver.findElement(By.name("password")).sendKeys("seci1994");
         bbcAccount = PageFactory.initElements(driver, BbcAccount.class);
    }

    @Test
    public void testsearchInput() {
        bbcAccount.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}
