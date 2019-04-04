package testbbctravel;

import base.CommonAPI;
import bbctravel.BBCTravel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBBCTravel extends CommonAPI {
   BBCTravel travel;
    String worldUrl = "https://www.bbc.com/travel";

    @BeforeClass
    public void initialization(){
        driver.get("https://www.bbc.com/travel");
        travel = PageFactory.initElements(driver, BBCTravel.class);
        driver.navigate().refresh();
    }

    @Test
    public void testHeadlines1(){travel.setHeadlines();}
    @Test
    public void testHeadlines2(){travel.setHeadlines2();}
    @Test
    public void testHeadlines3(){travel.setHeadlines3();}
    @Test
    public void testHeadlines4(){travel.setHeadlines4();}
    @Test
    public void testFeatureSection(){travel.setFeatureSection();}
    @Test
    public void testFeatureSection3(){travel.setFeatureSection3();}
    @Test
    public void testFeatureSection4(){travel.setFeatureSection4();}
}
