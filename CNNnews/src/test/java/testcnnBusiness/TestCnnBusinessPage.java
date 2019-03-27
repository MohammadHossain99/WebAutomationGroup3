package testcnnBusiness;

import base.CommonAPI;
import cnnBusiness.CnnBusinessPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCnnBusinessPage extends CommonAPI {

    String businessUrl = "https://www.cnn.com/business";
    CnnBusinessPage cnnBusinessPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(businessUrl);
        cnnBusinessPage = PageFactory.initElements(driver,CnnBusinessPage.class);
    }

    @Test(priority = 1)
    public void menubtn() throws Exception{
        cnnBusinessPage.gotoMenu();
        driver.navigate().to(businessUrl);
    }

    @Test(priority = 2)
    public void pageTech()throws Exception{
        cnnBusinessPage.getBusinessPage();
    }

    @Test(priority = 3)
    public void glaceAtMarket() throws Exception{
        cnnBusinessPage.seeMarketaGlance();
    }
    @Test(priority = 4)
    public void imageTesting1()throws Exception{
        cnnBusinessPage.image1();
    }

    @Test(priority = 5)
    public void nikeTraging() throws Exception {
        cnnBusinessPage.seeNikeTrade("Nike");
        driver.navigate().to(businessUrl);
    }

    @Test(priority = 6)
    public void tradeScrolTest()throws Exception{
        cnnBusinessPage.tradeScrolclick();
    }
    @Test(priority = 7)
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        cnnBusinessPage.setTopTitleImage();
    }

    @Test(priority = 8)
    public void testCraditCard()throws Exception{
        cnnBusinessPage.craditCard();
    }

    @Test(priority = 9)
    public void testPaidContent()throws Exception{
        cnnBusinessPage.paidContentImage();
    }
}
