package test;

import base.CommonAPI;
import homePage.BbcAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcAccount extends CommonAPI {
    BbcAccount bbcAccount;

    @BeforeMethod
    public void initializing() {
        driver.get("https://account.bbc.com/signin/");
        bbcAccount = PageFactory.initElements(driver, BbcAccount.class);
    }

    @Test
    public void testsearchInput() {
        bbcAccount.setInputSearch();
    }
}