package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage home;
    String worldUrl = "https://www.hotels.com/";

    @BeforeClass
    public void initialization(){
        driver.get("https://www.hotels.com/");
        home = PageFactory.initElements(driver,HomePage.class);
        driver.navigate().refresh();
    }
    @Test (priority = 1)
    public void testHeadlines1(){home.setHeadlines();}

    @Test(priority = 2)
    public void testLogin() {home.setLogin();}

    @Test (priority = 3)
    public void testHeadlones2(){home.setHeadlines2();}

    @Test (priority = 4)
    public void testHeadlines3(){home.setHeadlines3();}

    @Test (priority = 5)
    public void testHeadlines4(){home.setHeadlines4();}

    @Test (priority = 6)
    public void testHeadlines5(){home.setHeadlines5();}

    @Test (priority = 7)
    public void testHotelSearch() {home.setHotelsearch();}

    @Test (priority = 8)
    public void testFeatureSection(){home.setFeatureSection();}
//    @Test
//    public void testFeatureSection3(){
//        world.setFeatureSection3();
//    }
//    @Test
//    public void testFeatureSection4(){
//        world.setFeatureSection4();
//    }
//    @Test
//    public void testLatestStories(){
//        world.setLatestSories1();
//    }
//    @Test
//    public void testLatestStories2(){
//        world.setLatestSories2();
//    }
//    @Test
//    public void testLatestStories4(){
//        world.setLatestStiries4();
//    }
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
