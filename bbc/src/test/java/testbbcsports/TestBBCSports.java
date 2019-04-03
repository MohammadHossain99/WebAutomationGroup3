package testbbcsports;

import base.CommonAPI;
import bbcsports.BBCSports;
import bbcworld.BBCWorld;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBBCSports extends CommonAPI {
    BBCSports sports;
    String worldUrl = "https://www.bbc.com/sports";

    @BeforeClass
    public void initialization(){
        driver.get("https://www.bbc.com/sports");
        sports = PageFactory.initElements(driver,BBCSports.class);
        driver.navigate().refresh();
    }

    @Test
    public void testHeadlines1(){sports.setHeadlines();}
    @Test
    public void testHeadlines2(){sports.setHeadlines2();}
    @Test
    public void testHeadlines3(){sports.setHeadlines3();}
    @Test
    public void testHeadlines4(){sports.setHeadlines4();}
    @Test
    public void testHeadlines5(){sports.setHeadlines5();}
    @Test
    public void testFeatureSection(){sports.setFeatureSection();}
    @Test
    public void testFeatureSection3(){sports.setFeatureSection3();}
    @Test
    public void testFeatureSection4(){sports.setFeatureSection4();}
    @Test
    public void testLatestStories2(){sports.setLatestSories2();}
    @Test
    public void testLatestStories5(){sports.setLatestStories5();}
    @Test
    public void testLatestStories6(){sports.setLatestStories6();}
    @Test
    public void testLatestStories7(){sports.setLatestSories7();}
    @Test
    public void testLatestStories8(){sports.setLatestStories8();}
    @Test
    public void testLatestStories9() throws Exception{sports.setLatestStories9();}
    @Test
    public void testLatestStories11() {sports.setLatestStories11();}
    @Test
    public void testLatestStories12() {sports.setLatestStories12();}
    @Test
    public void testLatestStories13() {sports.setLatestStories13();}
    @Test
    public void testLatestStories14() {sports.setLatestStories14();}
    @Test
    public void testLatestStories15() {sports.setLatestStories15();}
    @Test
    public void testLatestStories16() {sports.setLatestStories16();}
    @Test
    public void testLatestStories17() {sports.setLatestStories17();}
    @Test
    public void testLatestStories18() {sports.setLatestStories18();}
    @Test
    public void testLatestStories19() {sports.setLatestStories19();}
    @Test
    public void testLatestStories20() {sports.setLatestStories20();}
    @Test
    public void testLatestStories21() {sports.setLatestStories21();}
    @Test
    public void testLatestStories22() {sports.setLatestStories22();}
    @Test
    public void testLatestStories23() {sports.setLatestStories23();}
    @Test
    public void testLatestStories24() {sports.setLatestStories24();}
    @Test
    public void testLatestStories25() {sports.setLatestStories25();}
    @Test
    public void testLatestStories26() {sports.setLatestStories26();}
    @Test
    public void testLatestStories27() {sports.setLatestStories27();}
    @Test
    public void testLatestStories28() {sports.setLatestStories28();}
    @Test
    public void testLatestStories29() {sports.setLatestStories29();}
    @Test
    public void testLatestStories30() {sports.setLatestStories30();}
}


