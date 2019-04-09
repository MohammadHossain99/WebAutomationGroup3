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

    @Test (priority = 21)
    public void testLatestStories13() {home.setLatestStories13();}

    @Test (priority =22)
    public void testLatestStories14() {home.setLatestStories14();}

    @Test (priority =23)
    public void testLatestStories15() {home.setLatestStories15();}

    @Test
    public void testLatestStories17() {home.setLatestStories17();}

    @Test
    public void testLatestStories18() {home.setLatestStories18();}

    @Test
    public void testLatestStories19() {home.setLatestStories19();}

    @Test
    public void testLatestStories20() {home.setLatestStories20();}

    @Test
    public void testLatestStories21() {home.setLatestStories21();}

    @Test
    public void testLatestStories22() {home.setLatestStories22();}

    @Test
    public void testLatestStories23() {home.setLatestStories23();}

    @Test
    public void testLatestStories24() {home.setLatestStories24();}

    @Test
    public void testLatestStories25() {home.setLatestStories25();}

    @Test
    public void testLatestStories26() {
        try {
            home.setLatestStories26();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLatestStories27() {home.setLatestStories27();}

    @Test
    public void testLatestStories28() {home.setLatestStories28();}

    @Test
    public void testLatestStories29() {home.setLatestStories29();}

    @Test
    public void testLatestStories30() {home.setLatestStories30();}

    @Test
    public void testLatestStories31() {home.setLatestStories31();}

    @Test
    public void testLatestStories32() {home.setLatestStories32();}

    @Test
    public void testLatestStories33() {home.setLatestStories33();}

    @Test
    public void testLatestStories34() {home.setLatestStories34();}

    @Test
    public void testLatestStories35() {home.setLatestStories35();}

    @Test
    public void testLatestStories36() {home.setLatestStories36();}

    @Test
    public void testLatestStories37() {home.setLatestStories37();}

    @Test
    public void testLatestStories38() {home.setLatestStories38();}

    @Test
    public void testLatestStories39() throws InterruptedException {home.setLatestStories39();}

    @Test
    public void testLatestStories40() throws InterruptedException {home.setLatestStories40();}

    @Test
    public void testLatestStories41() throws InterruptedException {home.setLatestStories41();}

    @Test
    public void testLatestStories42() throws InterruptedException {home.setLatestStories42();}

    @Test
    public void testLatestStories43() throws InterruptedException {home.setLatestStories43();}

    @Test
    public void testLatestStories44() throws InterruptedException {home.setLatestStories44();}

    @Test
    public void testLatestStories45() throws InterruptedException {home.setLatestStories45();}
}
