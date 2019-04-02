package test;

import base.CommonAPI;
import homePage.BbcWeatherNY;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcWeatherNY extends CommonAPI {
    BbcWeatherNY bbcWeatherNY;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/weather/");
        driver.findElement(By.xpath("//*[@id=\"u7426019377287265\"]/div/div/div[3]/a/span"));
        bbcWeatherNY = PageFactory.initElements(driver, BbcWeatherNY.class);
    }

    @Test
    public void testsearchInput() {
        bbcWeatherNY.setInputSearch();
        System.out.println("Navigate to Website - BBC : Weather : New York");
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
