package testbbcbusiness;

import base.CommonAPI;
import bbcbusiness.BbcBusinessPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import bbcbusiness.BbcBusinessPage;

import java.util.concurrent.TimeUnit;

public class TestBbcBusinessPage extends CommonAPI {
    String businessUrl = "https://www.bbc.com/business";
    BbcBusinessPage bbcBusinessPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(businessUrl);
        bbcBusinessPage = PageFactory.initElements(driver,BbcBusinessPage.class);
    }

    @Test(priority = 1)
    public void menubtn() throws Exception{
        bbcBusinessPage.gotoMenu();
        driver.navigate().to(businessUrl);
    }

    @Test(priority = 2)
    public void pageTech()throws Exception{
        bbcBusinessPage.getBusinessPage();
    }

    @Test(priority = 3)
    public void glaceAtMarket() throws Exception{
        bbcBusinessPage.seeMarketaGlance();
    }

    @Test(priority = 4)
    public void nikeTraging() throws Exception {
        bbcBusinessPage.seeNikeTrade("Nike");
        driver.navigate().to(businessUrl);
    }

    @Test(priority = 5)
    public void tradeScrolTest()throws Exception{
        bbcBusinessPage.tradeScrolclick();
    }
}
