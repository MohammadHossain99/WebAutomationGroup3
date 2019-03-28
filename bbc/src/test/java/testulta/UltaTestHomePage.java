package testulta;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import ulta.UltaHomePage;

public class UltaTestHomePage extends CommonAPI {

    UltaHomePage ultaHomePage;
    String homePageUrl = "https://www.ulta.com/";

    @BeforeMethod

    public void initialize() {
        driver.navigate().to(homePageUrl);
        ultaHomePage = PageFactory.initElements(driver, UltaHomePage.class);
    }

    @Test
    public void getUltaHomePageTitle(){
       ultaHomePage.getTitle();
    }

    @Test
    public void enterSearchBox() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ultaHomePage.enterInSearchBox("Fragrance");
    }

    @Test
    public void navigateToSalesPage() throws Exception {
        ultaHomePage.salesPage();
    }

    @Test
    public void navigateToSignIn() {
        ultaHomePage.signInPage();
    }

    @Test
    public void navigateToSignup() {
        ultaHomePage.signUpPage();

    }

    @Test
    public void navigateToMakeUpPage() {
        ultaHomePage.makeUpPage();
    }

    @Test
    public void navigateToFIndAStore() throws Exception {
        ultaHomePage.findAStore();
    }

    @Test
    public void navigateToMensPage() {
        ultaHomePage.mensPage();
    }

    @Test
    public void navigateToSkinCarePage() {
        ultaHomePage.skinCarePage();
    }

    @Test
    public void ableToSignUpForUltaThroughSticky() throws Exception {
        ultaHomePage.signUpForUltaBeauty();
    }
//
//    @Test
//    public void hoverShopByBrands() throws InterruptedException{ultaHomePage.hoverOverShopByBrand();}
//
//    @Test
//    public void hoverOverNewArrivals ()throws InterruptedException{hoverNewArrivals();}
//
//    @Test
//    public void hoverOverMakeUp()throws InterruptedException{hoverMakeUp();}
//
//    @Test
//    public void hoverOverNails()throws InterruptedException{hoverNails();}
//
//    @Test
//    public void hoverOverSkinCare()throws InterruptedException{hoverSkinCare();}
//
//    @Test
//    public void hoverOverHair()throws InterruptedException{hoverHair();}
//
//    @Test
//    public void hoverOverToolsAndBrushes()throws InterruptedException{hoverToolsAndBrushes();}
//
//    @Test
//    public void hoverOverFragrance()throws InterruptedException{hoverFragrance();}
//
//    @Test
//    public void hoverOverBathAndBody()throws InterruptedException{hoverBathAndBody();}
//
//    @Test
//    public void hoverOverMen()throws InterruptedException{hoverMen();}
//
//    @Test
//    public void hoverOverUltaCollections() throws InterruptedException{hoverUltaCollections();}
//
//    @Test
//    public void hoverOverGifts()throws InterruptedException{hoverGifts();}
//
//    @Test
//    public void hoverOverSalesAndCoupons()throws InterruptedException{hoverSalesAndCoupon();}
//
//    @Test
//    public void hoverOverCurrentAd()throws InterruptedException{hoverCurrentAd();}
//
//    @Test
//    public void hoverOverBeautyTips()throws InterruptedException{hoverBeautyTips();}
//
//    @Test
//    public void hoverOverAllureWinners()throws InterruptedException{hoverAllureWinners();}
//
//    @Test
//    public void hoverOverBeautyServices()throws InterruptedException{hoverBeautyServices();}
//
//    @Test
//    public void hoverOverBookAppointment()throws InterruptedException{hoverBookAppointment();}

}
