package test;

import base.CommonAPI;
import homePage.BbcBusiness;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcBusiness extends CommonAPI {
    BbcBusiness bbcBusiness;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/news/business-47671267");
        bbcBusiness = PageFactory.initElements(driver, BbcBusiness.class);
    }

    @Test
    public void testsearchInput() {
        bbcBusiness.setInputSearch();
        System.out.println("BBC : Business News");
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
