package test;

import base.CommonAPI;
import homePage.BbcCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcCart extends CommonAPI {
    BbcCart bbcCart;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/");
        bbcCart = PageFactory.initElements(driver, BbcCart.class);
    }

    @Test
    public void testsearchInput() {
        bbcCart.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
