package test;

import base.CommonAPI;
import homePage.BbcAddCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcAddCart extends CommonAPI {

    BbcAddCart bbcAddCart;
    @BeforeMethod
    public void initializing() {
        driver.get("https://bbc.com/");
        bbcAddCart = PageFactory.initElements(driver, BbcAddCart.class);
    }

    @Test
    public void testsearchInput() {
        bbcAddCart.setInputSearch();
        System.out.println("Navigate to Website - BBC : Weather");
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
