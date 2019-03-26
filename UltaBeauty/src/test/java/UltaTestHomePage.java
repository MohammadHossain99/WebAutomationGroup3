
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UltaTestHomePage extends UltaHomePage{

    UltaHomePage ultaHomePage;
    String homePageUrl = "https://www.ulta.com/";

    @BeforeMethod

    public void initialize() {
        driver.navigate().to(homePageUrl);
        ultaHomePage = PageFactory.initElements(driver, UltaHomePage.class);
    }

    @Test
    public void getTitle(){
        driver.getTitle();
        String title = "Cosmetics, Fragrance, Skincare and Beauty Gifts | Ulta Beauty";
        Assert.assertEquals(driver.getTitle(), title);
    }

    @Test
    public void enterSearchBox() {
        ultaHomePage.enterInSearchBox("Fragrance");
        String urlExpected = "https://www.ulta.com/fragrance?N=26wa";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToSalesPage() throws Exception {
        ultaHomePage.salesPage();
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/promotion/buy-more-save-more/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToSignIn() {
        ultaHomePage.signInPage();
        String urlExpected = "https://www.ulta.com/ulta/myaccount/login.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToSignup() {
        ultaHomePage.signUpPage();
        String urlExpected = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToMakeUpPage() {
        ultaHomePage.makeUpPage();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToFIndAStore() throws Exception {
        ultaHomePage.findAStore();
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/stores/#/?q=&z=12&c=40.67181512990815%2C-73.82387679211968";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToMensPage() {
        ultaHomePage.mensPage();
        String urlExpected = "https://www.ulta.com/promotion/buy-more-save-more/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToSkinCarePage() {
        ultaHomePage.skinCarePage();
        String urlExpected = "https://www.ulta.com/men?N=26zq";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void ableToSignUpForUltaThroughSticky() throws Exception {
        ultaHomePage.signUpForUltaBeauty();
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }



    @Test
    public void hoverShopByBrands() throws InterruptedException{hoverOverShopByBrand();}

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


   // @Test
    //public void findsomethin() throws Exception{closeSticky();}

//    @Test
//    public void av()throws InterruptedException{}
//
//    @Test
//    public void abb(){}
//
//    @Test
//    public void aewd(){}
//
//    @Test
//    public void aqcd(){}
//
//    @Test
//    public void nba(){}
//
//    //    @Test
////    public void fea(){}
//
//

    //
//    @Test
//    public void ab(){}
//
//    @Test
//    public void az(){}
//
//    @Test
//    public void aa(){}
//
//    @Test
//    public void ada(){}
//
//    @Test
//    public void ad(){}
//
//    @Test
//    public void add(){}
//
//    @Test
//    public void ac(){}
//
//    @Test
//    public void av(){}
//
//    @Test
//    public void abb(){}
//
//    @Test
//    public void ae(){}
//
//    @Test
//    public void aq(){}
//
//    @Test
//    public void a(){}



}
