package ulta;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UltaHomePage extends CommonAPI {


    public UltaHomePage(WebDriver driver ){
        PageFactory.initElements(driver,this);
    }

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


    public void getTitle(){
        driver.getTitle();
        String title = "Cosmetics, Fragrance, Skincare and Beauty Gifts | Ulta Beauty";
        Assert.assertEquals(driver.getTitle(), title);
    }


    public void findAStore() throws Exception{
        findStorePage.click();
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/stores/#/?q=&z=12&c=40.67181512990815%2C-73.82387679211968";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void signInPage(){
        signInPage.click();
        String urlExpected = "https://www.ulta.com/ulta/myaccount/login.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void signUpPage(){
        signUp.click();
        String urlExpected = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void mensPage(){
        mensPage.click();
        String urlExpected = "https://www.ulta.com/men?N=26zq";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void enterInSearchBox(String search)throws Exception{
        searchBox.sendKeys(search, Keys.ENTER);
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/fragrance?N=26wa";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);

    }

    public void salesPage() throws Exception{
        salesPage.click();
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/promotion/buy-more-save-more/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void makeUpPage(){
        makeUpPage.click();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void skinCarePage(){
        skinCarePage.click();
        String urlExpected = "https://www.ulta.com/men?N=26zq";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void signUpForUltaBeauty() throws Exception{
        firstNameStickySignUp.sendKeys("Sylvana");
        lastNameStickySignUp.sendKeys("Rahman");
        emailStickySignUp.sendKeys("stest7380@gmail.com");
        submitInStickySignUp.click();
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
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

}
