package test;

import base.CommonAPI;
import homePage.BbcCapital;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcCapital extends CommonAPI {
    BbcCapital bbcCapital;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/capital/");
        bbcCapital = PageFactory.initElements(driver, BbcCapital.class);
    }

    @Test
    public void testsearchInput() {
        bbcCapital.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}

