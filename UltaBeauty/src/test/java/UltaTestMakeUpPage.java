import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UltaTestMakeUpPage extends UltaMakeUpPage {

    UltaMakeUpPage ultaMakeUpPage;
    String makeupPageUrl ="https://www.ulta.com/makeup?N=26y1";

    @BeforeMethod
    public void initialize(){
        driver.get(makeupPageUrl);
        ultaMakeUpPage = PageFactory.initElements(driver, UltaMakeUpPage.class);
    }

    @Test
    public void makeUpPageTitle(){
        driver.getTitle();
         String expectedTitle = "Makeup | Ulta Beauty";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    @Test
    public void chooseNewArrival1stFrame() throws Exception{
        ultaMakeUpPage.setMacPallete();
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void chooseNewArrival2ndFrame(){
        ultaMakeUpPage.setTarteFaceTape();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void chooseBestSeller1(){
        ultaMakeUpPage.setBestSeller1stframe();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void lipsSection1stFrame(){
        ultaMakeUpPage.setLipsSection1stFrame();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    @Test
    public void makeUp3rdFrame(){
        ultaMakeUpPage.setFaceMakeUp3rdFrame();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void eyeMakeUp2ndFrame(){
        ultaMakeUpPage.setEyeMakeUp2ndFrame();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    @Test
    public void verifyLogo(){
        ultaMakeUpPage.verifyLogoImg();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    @Test

    public void hoverShopByBrand() throws InterruptedException{
        hoverShopByBrands();
    }

    @Test
    public void hoverNChoose() throws InterruptedException{
        hoverNChooseFromBrands();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void hoverOverNewArrivals ()throws InterruptedException{hoverNewArrivals();}

    @Test
    public void hoverOverMakeUp()throws InterruptedException{hoverMakeUp();}

    @Test
    public void hoverOverNails()throws InterruptedException{hoverNails();}

    @Test
    public void hoverOverSkinCare()throws InterruptedException{hoverSkinCare();}

    @Test
    public void hoverOverHair()throws InterruptedException{hoverHair();}

    @Test
    public void hoverOverToolsAndBrushes()throws InterruptedException{hoverToolsAndBrushes();}

    @Test
    public void hoverOverFragrance()throws InterruptedException{hoverFragrance();}

    @Test
    public void hoverOverBathAndBody()throws InterruptedException{hoverBathAndBody();}

    @Test
    public void hoverOverMen()throws InterruptedException{hoverMen();}

    @Test
    public void hoverOverUltaCollections() throws InterruptedException{hoverUltaCollections();}

    @Test
    public void hoverOverGifts()throws InterruptedException{hoverGifts();}

    @Test
    public void hoverOverSalesAndCoupons()throws InterruptedException{hoverSalesAndCoupon();}

    @Test
    public void hoverOverCurrentAd()throws InterruptedException{hoverCurrentAd();}

    @Test
    public void hoverOverBeautyTips()throws InterruptedException{hoverBeautyTips();}

    @Test
    public void hoverOverAllureWinners()throws InterruptedException{hoverAllureWinners();}

    @Test
    public void hoverOverBeautyServices()throws InterruptedException{hoverBeautyServices();}

    @Test
    public void hoverOverBookAppointment()throws InterruptedException{hoverBookAppointment();}

    @Test
    public void viewFaceSection(){ultaMakeUpPage.seeFaceSection();}

    @Test
    public void viewEyesSection(){ultaMakeUpPage.seeEyesSection();}

    @Test
    public void viewUltaCollectionSection(){ultaMakeUpPage.seeUltaCollectionSection();}

    @Test
    public void viewLipsSection(){ultaMakeUpPage.seelipsSection();}

    @Test
    public void viewBrushesAndToolsSection(){ultaMakeUpPage.seeBrushesAndToolsSection();}

    @Test
    public void viewBagsAndCasesSection(){ultaMakeUpPage.seeBagsAndCasesSection();}

    @Test
    public void viewTravelSizeSection(){ultaMakeUpPage.seeTravelSizeSection();}

    @Test
    public void viewGiftsAndValueSetsSection(){ultaMakeUpPage.seeGiftsAndValueSetsSection();}

    @Test
    public void viewAllureBestOfBeautySection(){ultaMakeUpPage.seeAllureBestOfBeautySection();}

}
