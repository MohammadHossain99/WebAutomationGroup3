package cnnBusiness;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CnnBusinessPage extends CommonAPI {

    @FindBy(css = "#menu")
    WebElement selectingMenu;

    @FindBy(xpath = "//div[@id='nav']/div[2]/div[2]/a[4]")
    WebElement clickOnBusiness;

    @FindBy(xpath = "//a[@class='nav-menu-links__link' and text()='Markets']")
    WebElement marketInBuseness;

    @FindBy(css = "button:nth-child(2)>svg>path")
    WebElement tredeScrolling;

    @FindBy(id = "downshift-0-input")
    WebElement inputSearchInBusiness;

    @FindBy(xpath = "//img[@class='media__image']")
    WebElement testImage;  //use boolean to test the image isDispalyed or not

    @FindBy(xpath = "//a[@href='/2019/03/18/tech/apple-new-ipad-air-mini/index.html']//img")
    WebElement topTitleImage;

    @FindBy(css = "//label[text()='Credit Cards']")
    WebElement craditCardChosing;


    @FindBy(xpath = "//div[@id='outbrain_widget_0']//div//div//ul//li[3]")
    WebElement imageInPaidcontent;

    @FindBy(xpath = "//section[@id='business-zone-4']/div[2]/div/div[1]/div/div[2]/article/div/div[1]/a/img")
    WebElement testImage3;



    public void gotoMenu() {
        selectingMenu.click();

    }
    public void getBusinessPage(){
        clickOnBusiness.click();
    }

    public void seeMarketaGlance(){
        marketInBuseness.click();
        driver.navigate().back();
    }

    public void image1(){
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void seeNikeTrade(String locator) throws Exception{
        inputSearchInBusiness.sendKeys(locator, Keys.ENTER);
        Thread.sleep(2000);
    }
    public void tradeScrolclick(){
        tredeScrolling.click();
    }

    public void setTopTitleImage(){
       boolean titleVideo = topTitleImage.isDisplayed();
       Assert.assertTrue(titleVideo);
    }
    public void craditCard(){
//      String str=  craditCardChosing.getText();
//      Assert.assertEquals(str,"Credit Cards");
      craditCardChosing.click();
    }

    public void paidContentImage(){
       boolean paidContent= imageInPaidcontent.isDisplayed();
       Assert.assertTrue(paidContent);

    }



}
