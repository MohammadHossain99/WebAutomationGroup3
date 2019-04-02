package test;

import base.CommonAPI;
import homePage.HomeElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomeElement extends CommonAPI {
    HomeElement homeElement;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com");
        homeElement = PageFactory.initElements(driver, HomeElement.class);
    }

    @Test
    public void testsearchInput() {
        homeElement.setInputSearch();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}