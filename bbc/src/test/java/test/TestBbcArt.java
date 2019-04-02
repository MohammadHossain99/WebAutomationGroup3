package test;

import base.CommonAPI;
import homePage.BbcArt;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcArt extends CommonAPI {
    BbcArt bbcArt;

    @BeforeMethod
    public void initializing() {
        driver.get("http://www.bbc.com/culture/sections/art");
        bbcArt = PageFactory.initElements(driver, BbcArt.class);
    }

    @Test
    public void testsearchInput() {
        bbcArt.setInputSearch();
        System.out.println("BBC : Art");
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
