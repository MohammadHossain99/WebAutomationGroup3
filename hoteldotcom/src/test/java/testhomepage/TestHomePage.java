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
    public void testHotelSearch() {home.setHotelsearch();}

    @Test (priority = 7)
    public void testFeatureSection(){home.setFeatureSection();}

    @Test (priority = 8)
    public void testFeatureSection3(){home.setFeatureSection3();}

    @Test (priority = 9)
    public void testFeatureSection4(){home.setFeatureSection4();}

    @Test (priority = 10)
    public void testLatestStories(){home.setLatestSories1();}

    @Test (priority = 11)
    public void testLatestStories2(){home.setLatestSories2();}

    @Test (priority = 12)
    public void testLatestStories4(){home.setLatestStiries4();}

    @Test (priority = 13)
    public void testLatestStories5(){home.setLatestStories5();}

    @Test (priority = 14)
    public void testLatestStories6(){home.setLatestStories6();}

    @Test (priority = 15)
    public void testLatestStories7(){
        try {
            home.setLatestSories7();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 16)
    public void testLatestStories8(){
        try {
            home.setLatestStories8();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test (priority = 17)
    public void testLatestStories9(){
        try {
            home.setLatestStories9();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test (priority = 18)
    public void testLatestStories10(){
        try {
            home.setLatestStories10();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 19)
    public void testLatestStories11() {
        try {
            home.setLatestStories11();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test (priority = 20)
    public void testLatestStories12() {
        try {
            home.setLatestStories12();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLatestStories13() {home.setLatestStories13();}

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
