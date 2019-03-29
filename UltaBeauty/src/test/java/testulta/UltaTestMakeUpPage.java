package testulta;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;
import ulta.UltaMakeUpPage;

public class UltaTestMakeUpPage extends UltaMakeUpPage {

    UltaMakeUpPage ultaMakeUpPage;
    String makeupPageUrl ="https://www.ulta.com/makeup?N=26y1";

    @BeforeClass
    public void initialize(){
        driver.get(makeupPageUrl);
        ultaMakeUpPage = PageFactory.initElements(driver, UltaMakeUpPage.class);
    }

    @AfterMethod
    public void reStart(){
        driver.get(makeupPageUrl);
    }

    @Test
    public void makeUpPageTitle(){
        driver.getTitle();
         String expectedTitle = "Makeup | Ulta Beauty";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    @Test
    public void chooseNewArrival1stFrame() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view first frame of new arrivals");
        ultaMakeUpPage.setMacPallete();
    }

    @Test
    public void chooseNewArrival2ndFrame(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view second frame of new arrivals");
        ultaMakeUpPage.setTarteFaceTape();

    }

    @Test
    public void chooseBestSeller1(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view first frame of Best Sellers");
        ultaMakeUpPage.setBestSeller1stframe();
    }

    @Test
    public void lipsSection1stFrame(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view first frame of lips section");
        ultaMakeUpPage.setLipsSection1stFrame();
    }


    @Test
    public void makeUp3rdFrame(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view 3rd frame of face section");
        ultaMakeUpPage.setFaceMakeUp3rdFrame();
    }

    @Test
    public void eyeMakeUp2ndFrame(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view second frame of eye section");
        ultaMakeUpPage.setEyeMakeUp2ndFrame();
    }


    @Test
    public void verifyLogo(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"verify logo of Ulta Beauty");
        ultaMakeUpPage.verifyLogoImg();
    }


    @Test

    public void hoverShopByBrand() throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover Shop By Brand");
        hoverShopByBrands();
    }

    @Test
    public void hoverNChoose() throws InterruptedException{ TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover Shop By Brand and choose");
    hoverNChooseFromBrands(); }

    @Test
    public void hoverOverNewArrivals ()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over ");
    hoverNewArrivals();}

    @Test
    public void hoverOverMakeUp()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over make up");
    hoverMakeUp();}

    @Test
    public void hoverOverNails()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over nails");
    hoverNails();}

    @Test
    public void hoverOverSkinCare()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over skin care");
    hoverSkinCare();}

    @Test
    public void hoverOverHair()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over hair");
    hoverHair();}

    @Test
    public void hoverOverToolsAndBrushes()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over tools and brushes");
    hoverToolsAndBrushes();}

    @Test
    public void hoverOverFragrance()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over fragrance");
    hoverFragrance();}

    @Test
    public void hoverOverBathAndBody()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over bath and body");
    hoverBathAndBody();}

    @Test
    public void hoverOverMen()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over men");
    hoverMen();}

    @Test
    public void hoverOverUltaCollections() throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over ulta collection");
    hoverUltaCollections();}

    @Test
    public void hoverOverGifts()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over gifts");
    hoverGifts();}

    @Test
    public void hoverOverSalesAndCoupons()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Hover over sales and coupons");
    hoverSalesAndCoupon();}

    @Test
    public void hoverOverCurrentAd()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over current ad");
    hoverCurrentAd();}

    @Test
    public void hoverOverBeautyTips()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over beauty tips");
    hoverBeautyTips();}

    @Test
    public void hoverOverAllureWinners()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over allure winners");
    hoverAllureWinners();}

    @Test
    public void hoverOverBeautyServices()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over beauty services");
    hoverBeautyServices();}

    @Test
    public void hoverOverBookAppointment()throws InterruptedException{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over book appointments");
    hoverBookAppointment();}

    @Test
    public void viewFaceSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over face section");
    ultaMakeUpPage.seeFaceSection();}

    @Test
    public void viewEyesSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over eyes section");
    ultaMakeUpPage.seeEyesSection();}

    @Test
    public void viewUltaCollectionSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"hover over ulta collections");
    ultaMakeUpPage.seeUltaCollectionSection();}

    @Test
    public void viewLipsSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view lips section");
    ultaMakeUpPage.seelipsSection();}

    @Test
    public void viewBrushesAndToolsSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view brushes and tools");
    ultaMakeUpPage.seeBrushesAndToolsSection();}

    @Test
    public void viewBagsAndCasesSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view bags and cases");
    ultaMakeUpPage.seeBagsAndCasesSection();}

    @Test
    public void viewTravelSizeSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view travel size");
    ultaMakeUpPage.seeTravelSizeSection();}

    @Test
    public void viewGiftsAndValueSetsSection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view gifts and value sets");
    ultaMakeUpPage.seeGiftsAndValueSetsSection();}

    @Test
    public void viewAllureBestOfBeautySection(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view allure best of beauty section");
    ultaMakeUpPage.seeAllureBestOfBeautySection();}

}
