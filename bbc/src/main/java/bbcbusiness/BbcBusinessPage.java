package bbcbusiness;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class BbcBusinessPage extends CommonAPI {
    @FindBy(id = "orb-nav-links")
    WebElement selectingMenu;

    @FindBy(xpath = "//*[@id=\'site-container\']/div[1]/div[2]/ul/li[7]/a")
    WebElement clickOnTech;

    @FindBy(xpath = "//*[@id=\'site-container\']/div[1]/div[2]/ul/li[8]/a/span")
    WebElement marketInBuseness;

    @FindBy(xpath ="//*[@id=\'site-container\']/div[1]/div[4]/nav/ul/li[1]/a/span")
    WebElement tredeScrolling;

    @FindBy(xpath = "//*[@id=\'orb-search-q\']")
    WebElement inputSearchInBusiness;

    @FindBy(id = "67cb5a0f-adc6-4501-b40f-24b6b96fe340")
    WebElement topTitleImage;

    @FindBy(xpath = "//*[@id=\'page\']/section[5]/div[1]/ul/li[2]/div/a/div[1]/div/img")
    WebElement imageInPaidcontent;

    @FindBy(xpath = "//section[@id='business-zone-4']/div[2]/div/div[1]/div/div[2]/article/div/div[1]/a/img")
    WebElement testImage3;

    public void gotoMenu() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Menu Button in Business Page");
        selectingMenu.click();
    }

    public void getBusinessPage() {
        clickOnTech.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in Business Page");
        driver.navigate().to("https://www.bbc.com/news/technology");
    }

    public void seeMarketaGlance() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To Science Page");
        marketInBuseness.click();
        driver.navigate().to("https://www.bbc.com/news/science_and_environment");
    }

    public void seeNikeTrade(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
        inputSearchInBusiness.sendKeys(locator, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Trade Button in Business Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Business Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }
}
