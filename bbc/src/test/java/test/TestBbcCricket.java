package test;

import base.CommonAPI;
import homePage.BbcCricket;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcCricket extends CommonAPI {
    BbcCricket bbcCricket;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/sport/cricket/");
        bbcCricket = PageFactory.initElements(driver, BbcCricket.class);
    }

    @Test
    public void testsearchInput() {
        bbcCricket.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
