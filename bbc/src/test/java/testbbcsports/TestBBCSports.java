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
    public void testLatestStories1(){sports.setLatestSories1();}
    @Test
    public void testLatestStories2(){sports.setLatestSories2();}
    @Test
    public void testLatestStories4(){sports.setLatestStiries4();
    }
//    @Test
//    public void testLatestStories5(){
//        world.setLatestStories5();
//    }
//    @Test
//    public void testLatestStories6(){
//        world.setLatestStories6();
//    }
//    @Test
//    public void testLatestStories7(){
//        world.setLatestSories7();
//    }
//    @Test
//    public void testLatestStories8(){
//        world.setLatestStories8();
//    }
//    @Test
//    public void testLatestStories9() throws Exception{
//        world.setLatestStories9();
//    }
//    @Test
//    public void testLatestStories11() {
//        world.setLatestStories11();
//    }
//    @Test
//    public void testLatestStories12() {
//        world.setLatestStories12();
//    }
//    @Test
//    public void testLatestStories13() {
//        world.setLatestStories13();
//    }
//    @Test
//    public void testLatestStories14() {
//        world.setLatestStories14();
//    }
//    @Test
//    public void testLatestStories15() {
//        world.setLatestStories15();
//    }
//    @Test
//    public void testLatestStories16() {
//        world.setLatestStories16();
//    }
//    @Test
//    public void testLatestStories17() {
//        world.setLatestStories17();
//    }
//    @Test
//    public void testLatestStories18() {
//        world.setLatestStories18();
//    }
//    @Test
//    public void testLatestStories19() {
//        world.setLatestStories19();
//    }
//    @Test
//    public void testLatestStories20() {
//        world.setLatestStories20();
//    }
//    @Test
//    public void testLatestStories21() {
//        world.setLatestStories21();
//    }
//    @Test
//    public void testLatestStories22() {
//        world.setLatestStories22();
//    }
//    @Test
//    public void testLatestStories23() {
//        world.setLatestStories23();
//    }
//    @Test
//    public void testLatestStories24() {
//        world.setLatestStories24();
//    }
//    @Test
//    public void testLatestStories25() {
//        world.setLatestStories25();
//    }
//    @Test
//    public void testLatestStories26() {
//        world.setLatestStories26();
//    }
//    @Test
//    public void testLatestStories27() {
//        world.setLatestStories27();
//    }
//    @Test
//    public void testLatestStories28() {
//        world.setLatestStories28();
//    }
//    @Test
//    public void testLatestStories29() {
//        world.setLatestStories29();
//    }
//    @Test
//    public void testLatestStories30() {
//        world.setLatestStories30();
//    }
}


