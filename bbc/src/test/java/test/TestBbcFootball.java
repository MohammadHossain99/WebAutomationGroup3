package test;

import base.CommonAPI;
import homePage.BbcFootball;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcFootball extends CommonAPI {
    BbcFootball bbcFootball;
    //String bbcxpath = "//*[@id=\"orb-nav-links\"]/ul/li[2]";

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/sport/football/");
        bbcFootball = PageFactory.initElements(driver, BbcFootball.class);

    }

    @Test
    public void testsearchInput() {
        bbcFootball.setInputSearch();
//        System.out.println("Navigate to Website - BBC");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}


