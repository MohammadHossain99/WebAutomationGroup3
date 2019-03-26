package testhompage;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends CommonAPI {

    String homepageUrl = "https://www.cnn.com/";
    HomePage homePage;

    @BeforeClass
    public void initialize() {
        driver.navigate().to(homepageUrl);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testBottomHome(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setBottomHome();
    }
    @Test
    public void testCrimeJusticeSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setCrimeJusticeSource();
    }
    @Test
    public void testEnargyEnvironmentSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setEnargyEnvironmentSource();
    }
    @Test
    public void testExtremeWeather()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setExtremeWeather();
    }
    @Test
    public void testSpaceScince(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setSpaceScince();
    }
    @Test
    public void testWorldNews(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setWorldNews();
    }
    @Test
    public void testAfricaSorce(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setAfricaSouce();
    }
    @Test
    public void testAmericaSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setAmericaSource();
    }
    @Test
    public void testAsiaSoure(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setAsiaSoure();
    }
    @Test
    public void testChinaSource() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setChinaSoure();
    }
    @Test
    public void testEuropeSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setEuropeSource();
    }
    @Test
    public void testMiddleEastSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setMiddleEast();
    }
    @Test
    public void testIndiaSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setIndiaSource();
    }
    @Test
    public void testSuprimeCourtSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setSuprimeCourtSource();
    }
    @Test
    public void testFactsFirst(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setFactsFirst();
    }
    @Test
    public void testOpinionSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setOpinioSource();
    }
    @Test
    public void testFoodSource() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setFoodSource();
    }
    @Test
    public void testFitnessSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setFitnessSource();
    }
    @Test
    public void testWellnessSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setWellnessSource();
    }
    @Test
    public void testLiveLonger() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setLiveLongerSource();
    }
    @Test
    public void testArtSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setArtSource();
    }
    @Test
    public void testDesignSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setDesignSource();
    }
    @Test
    public void testFashionSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setFasionSoure();
    }
    @Test
    public void testLuxurySource()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setLuxurySource();
    }
    @Test
    public void testDestinationSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setDestinationSource();
    }
    @Test
    public void testFoodAndDrinks(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setFoodAndDrinksSource();
    }
    @Test
    public void testCollegeFootballSource(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.setCollegeFootball();
    }
























    @Test
    public void clickOnSerchTab() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.clickOnSearch();
    }

    @Test
    public void searchWithSearchIteems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.SearchWithtext("christchurch");
    }

    @Test
    public void titleMatching() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String str = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(str, driver.getTitle());
    }

}
