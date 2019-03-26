import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UltaHomePage extends CommonAPI {

    @FindBy(css = "#searchInput")
    WebElement searchBox;

    @FindBy(linkText = "EMAIL SIGNUP")
    WebElement signUp;

    @FindBy(linkText = "SALES & COUPONS")
    WebElement salesPage;

    @FindBy(linkText = "FIND A STORE")
    WebElement findStorePage;

    @FindBy(id = "sign-in")
    WebElement signInPage;

    @FindBy(linkText = "MAKEUP")
    WebElement makeUpPage;

    @FindBy(linkText = "MEN")
    WebElement mensPage;

    @FindBy(linkText = "SKIN CARE")
    WebElement skinCarePage;

    @FindBy(id = "firstName")
    WebElement firstNameStickySignUp;

    @FindBy(id = "lastName")
    WebElement lastNameStickySignUp;

    @FindBy(xpath = "//input[@name='emailaddress']")
    WebElement emailStickySignUp;

    @FindBy(className = "StickyEmailSignUp__submit--signup--msg")
    WebElement submitInStickySignUp;

    @FindBy(xpath = "//div[@id='js-stickyEmailSignUpFooter']/div/div/div/button")
    WebElement exitSticky;


    @FindBy()
    WebElement c1;

    @FindBy()
    WebElement cb;

        @FindBy()
    WebElement c;

    @FindBy()
    WebElement cd;

    @FindBy()
    WebElement dc;

    @FindBy()
    WebElement cdd;

    @FindBy()
    WebElement cddd;

    @FindBy()
    WebElement ssc;

    @FindBy()
    WebElement ca;

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



    //    @FindBy()
//    WebElement c;
//
//    @FindBy()
//    WebElement cd;
//
//    @FindBy()
//    WebElement dc;
//
//    @FindBy()
//    WebElement cdd;
//
//    @FindBy()
//    WebElement cddd;
//
//    @FindBy()
//    WebElement ssc;
//
//    @FindBy()
//    WebElement ca;
//
//    @FindBy()
//    WebElement cs;
//
//    @FindBy()
//    WebElement caa;
//
//    @FindBy()
//    WebElement csd;
//
//    @FindBy()
//    WebElement vc;
//
//    @FindBy()
//    WebElement c1;
//
//    @FindBy()
//    WebElement cb;

    public void findAStore(){
        findStorePage.click();
    }

    public void signInPage(){
        signInPage.click();
    }

    public void signUpPage(){
        signUp.click();
    }

    public void mensPage(){
        mensPage.click();
    }

    public void enterInSearchBox(String search){
        searchBox.sendKeys(search, Keys.ENTER);

    }

    public void salesPage(){
        salesPage.click();
    }

    public void makeUpPage(){
        makeUpPage.click();
    }

    public void skinCarePage(){
        skinCarePage.click();
    }

    public void signUpForUltaBeauty(){
        firstNameStickySignUp.sendKeys("Sylvana");
        lastNameStickySignUp.sendKeys("Rahman");
        emailStickySignUp.sendKeys("stest7380@gmail.com");
        submitInStickySignUp.click();

    }

    public void hoverOverShopByBrand() throws InterruptedException{
        mouseHoverByXpath("//*[@id='hide-desk-nav']/div[2]/ul/li[2]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNewArrivals()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[3]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMakeUp()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[4]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNails()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[5]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSkinCare()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[6]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverHair()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[7]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverToolsAndBrushes()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[8]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverFragrance()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[9]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBathAndBody()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[10]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMen()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[11]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverUltaCollections()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[12]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverGifts()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[13]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSalesAndCoupon()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[14]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverCurrentAd()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[15]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    public void hoverBeautyTips()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[16]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverAllureWinners()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[17]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBeautyServices()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[19]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBookAppointment()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[20]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void closeSticky()throws Exception{
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(exitSticky);

        exitSticky.click();}

    public void aq(){}

    public void a()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[3]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void fa()throws InterruptedException{
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[3]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void al(){}

    public void wbl(){}

    public void wqnn(){}

    //    public void abb(){}
//
//    public void qe(){}
//
//    public void waq(){}
//
//    public void da(){}
//
//    public void dbb(){}
//
//    public void ae(){}
//
//    public void aq(){}
//
//    public void a(){}
//
//    public void fa(){}
//
//    public void rbb(){}
//
//    public void al(){}
//
//    public void wl(){}
//
//    public void wq(){}

}
