package testFaceBookHomeTabsVarifys;

import base.CommonAPI;
import facebookHomeTabsVarifys.HomeTabsVarifys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomeTabsVarifys extends CommonAPI {


    HomeTabsVarifys homeTabsVarifys;
    String homeUrl = "https://www.facebook.com/";

    @BeforeClass
    public void initialization(){
        driver.get(homeUrl);
        homeTabsVarifys = PageFactory.initElements(driver,HomeTabsVarifys.class);
        homeTabsVarifys.setLogIn();
    }

    @Test
    public void testSetNewsFeed(){
        homeTabsVarifys.setNewsFeed();
    }

    @Test
    public void testSetMessengerTab(){
        homeTabsVarifys.setMessengerTab();
    }
    @Test
    public void testSetWatchTab()throws Exception{
        homeTabsVarifys.setWatchTab();
    }

    @Test
    public void testSetWellcomeTab(){
        homeTabsVarifys.setWellcomeTab();
    }


}
