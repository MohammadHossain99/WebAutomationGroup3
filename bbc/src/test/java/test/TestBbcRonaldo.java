package test;

import base.CommonAPI;
import homePage.BbcRonaldo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcRonaldo extends CommonAPI {
    BbcRonaldo bbcRonaldo;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/sport/football/47673996");
        bbcRonaldo = PageFactory.initElements(driver, BbcRonaldo.class);
    }

    @Test
    public void testsearchInput() {
        bbcRonaldo.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
