package test;

import base.CommonAPI;
import homePage.BbcFootball;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcFootball extends CommonAPI {
    BbcFootball bbcFootball;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/sport/football/");
        bbcFootball = PageFactory.initElements(driver, BbcFootball.class);
    }

    @Test
    public void testsearchInput() {
        bbcFootball.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}


