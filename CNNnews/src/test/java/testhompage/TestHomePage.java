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
    public void clickOnSerchTab(){
        homePage.clickOnSearch();
    }
    @Test
    public void searchWithsearchIteems() throws Exception{
        homePage.SearchWithtext("christchurch");
        Thread.sleep(3000);
        clearInput(".cnn-search__input");
        navigateBack();
    }
    @Test
    public void titleMatching(){
      String str = "CNN - Breaking News, Latest News and Videos";
      Assert.assertEquals(str, driver.getTitle());
    }


}
