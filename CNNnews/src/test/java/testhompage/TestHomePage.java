package testhompage;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
        homePage.setBottomHome();
    }
    @Test
    public void testCrimeJusticeSource(){
        homePage.setCrimeJusticeSource();
    }
    @Test
    public void testEnargyEnvironmentSource(){
        homePage.setEnargyEnvironmentSource();
    }
    @Test
    public void testExtremeWeather()throws Exception{
        homePage.setExtremeWeather();
    }
    @Test
    public void testSpaceScince(){
        homePage.setSpaceScince();
    }
    @Test
    public void testWorldNews(){
        homePage.setWorldNews();
    }
    @Test
    public void testAfricaSorce(){
        homePage.setAfricaSouce();
    }
    @Test
    public void testAmericaSource(){
        homePage.setAmericaSource();
    }
    @Test
    public void testAsiaSoure(){
        homePage.setAsiaSoure();
    }
    @Test
    public void testChinaSource() throws Exception{
        homePage.setChinaSoure();
    }
    @Test
    public void testEuropeSource(){
        homePage.setEuropeSource();
    }
    @Test
    public void testMiddleEastSource(){
        homePage.setMiddleEast();
    }
    @Test
    public void testIndiaSource(){
        homePage.setIndiaSource();
    }
    @Test
    public void testSuprimeCourtSource(){
        homePage.setSuprimeCourtSource();
    }
    @Test
    public void testFactsFirst(){
        homePage.setFactsFirst();
    }
//    @Test
//    public void testOpinionSource(){
//        homePage.set
//
//    }
























    @Test
    public void clickOnSerchTab() {
        homePage.clickOnSearch();
    }

    @Test
    public void searchWithSearchIteems() throws Exception {
        homePage.SearchWithtext("christchurch");

    }

    @Test
    public void titleMatching() {
        String str = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(str, driver.getTitle());
    }

}
