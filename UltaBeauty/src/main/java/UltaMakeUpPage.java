import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UltaMakeUpPage extends CommonAPI {

    @FindBy(css = "#pimprod2004212")
    WebElement newArrival1stFrame;

    @FindBy(css = "#pimprod2003933")
    WebElement newArrival2ndFrame;

    @FindBy(css = "#xlsImpprod14291015")
    WebElement bestSeller1stframe;

    @FindBy(css = "#xlsImpprod13631033")
    WebElement lipsSection1stFrame;

    @FindBy(css = "#xlsImpprod18121011")
    WebElement faceMakeUp3rdFrame;

    @FindBy(css = "#xlsImpprod17731247")
    WebElement eyeMakeUp2ndFrame;

    @FindBy(xpath = "//*[@id=\'show-deskmob-con\']/a/img")
    WebElement UltaBeautyLogo;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:face']")
    WebElement face;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:eyes']")
    WebElement eyes;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:ulta collection']")
    WebElement ultaCollection;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:lips']")
    WebElement lips;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:makeup brushes & tools']")
    WebElement brushesAndTools;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:makeup bags & cases']")
    WebElement bagsAndCases;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:travel size']")
    WebElement travelSize;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:gifts & value sets']")
    WebElement giftsAndValueSets;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:allure best of beauty']")
    WebElement allureBestOfBeauty;

    @FindBy()
    WebElement cs;

    @FindBy()
    WebElement caa;

    @FindBy()
    WebElement cs2d;

    @FindBy()
    WebElement vaaac;

    @FindBy()
    WebElement cs1;

    @FindBy()
    WebElement cqwb;

    public void setMacPallete(){
        newArrival1stFrame.click();
    }

    public void setTarteFaceTape(){
        newArrival2ndFrame.click();
    }

    public void setBestSeller1stframe(){
        bestSeller1stframe.click();
    }

    public void setLipsSection1stFrame(){
        lipsSection1stFrame.click();
    }

    public void setFaceMakeUp3rdFrame(){
        faceMakeUp3rdFrame.click();
    }

    public void setEyeMakeUp2ndFrame(){
        eyeMakeUp2ndFrame.click();
    }

    public void verifyLogoImg(){
        boolean ultaImg = UltaBeautyLogo.isDisplayed();
        System.out.println(UltaBeautyLogo.getText());
        Assert.assertTrue(ultaImg);
    }

    public void hoverShopByBrands() throws InterruptedException{

        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNChooseFromBrands() throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/div/div/div/div[3]/ul/li[1]/a/img")).click();
    }

//    public void hoverOverShopByBrand() throws InterruptedException{
//        mouseHoverByXpath("//*[@id='hide-desk-nav']/div[2]/ul/li[2]/a");
//        Thread.sleep(5000);
//        String urlExpected = "https://www.ulta.com/";
//        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
//    }

    public void hoverNewArrivals()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[3]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMakeUp()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[4]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNails()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[5]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSkinCare()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[6]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverHair()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[7]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverToolsAndBrushes()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[8]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverFragrance()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[9]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBathAndBody()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[10]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMen()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[11]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverUltaCollections()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[12]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverGifts()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[13]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSalesAndCoupon()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[14]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverCurrentAd()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[15]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    public void hoverBeautyTips()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[16]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverAllureWinners()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[17]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBeautyServices()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[19]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBookAppointment()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[20]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void abb(){}

    public void qe(){}

    public void waq(){}

    public void da(){}

    public void dbb(){}

    public void ae(){}

    public void aq(){}

    public void a(){}

    public void fa(){}

    public void rbb(){}

    public void al(){}

    public void wl(){}

    public void wq(){}

}
