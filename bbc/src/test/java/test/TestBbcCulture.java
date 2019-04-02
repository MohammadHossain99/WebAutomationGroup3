package test;

import base.CommonAPI;
import homePage.BbcCulture;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcCulture extends CommonAPI {
    BbcCulture bbcCulture;

    @BeforeMethod
    public void initializing() {
        driver.get("http://www.bbc.com/culture/us/");
        bbcCulture = PageFactory.initElements(driver, BbcCulture.class);
    }

    @Test
    public void testsearchInput() {
        bbcCulture.setInputSearch();
        System.out.println("BBC : Culture");
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
