package testIdProfileHomePage;

import base.CommonAPI;
import iDprofileHomePage.IDProfileHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIdProfilePage extends CommonAPI {




    String homeUrl ="https://www.facebook.com/";
    IDProfileHomePage profile;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        profile = PageFactory.initElements(driver,IDProfileHomePage.class);
    }
    @Test(priority = 1)

    public void inputEmail(){
        profile.setLoginEmail("taherjuwel3262@gmail.com");
    }
    @Test(priority = 2)
    public void inputpss(){
       profile.setLoginPassword("Juwel1234");
    }

    @Test(priority = 3)
    public void clikOnTab(){
        profile.setLoginTab();
    }
    @Test(priority = 4)
    public void gotoProfile()throws Exception{

        profile.setProfileTab();
        Thread.sleep(3000);
    }










}
