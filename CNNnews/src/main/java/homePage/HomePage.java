package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    @FindBy(css = ".search__button.cnn-icon")
    WebElement searchTab;

    @FindBy(id = "search-input-field")
    WebElement searchInput;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[1]/li//a[text()='Home']")
    WebElement bottomHome;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[2]/li/ol/li[1]")
    WebElement crimeJusticeSource;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[2]/li/ol/li[2]")
    WebElement enargyEnvironmentSource;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[2]/li/ol/li[3]")
    WebElement extremeWeather;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[2]/li/ol/li[4]")
    WebElement spaceScince;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/a")
    WebElement worldNews;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[1]")
    WebElement africaSouce;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[2]")
    WebElement americaSource;

     @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[3]")
    WebElement asiaSoure;
//
//    @FindBy(id = "search-input-field")
//    WebElement searchInput;
//    @FindBy(css = ".search__button.cnn-icon")
//    WebElement searchTab;
//
//    @FindBy(id = "search-input-field")
//    WebElement searchInput;
//    @FindBy(css = ".search__button.cnn-icon")
//    WebElement searchTab;
//
//    @FindBy(id = "search-input-field")
//    WebElement searchInput;
//    @FindBy(css = ".search__button.cnn-icon")
//    WebElement searchTab;
//
//    @FindBy(id = "search-input-field")
//    WebElement searchInput;


    public void setBottomHome() {
        String text = bottomHome.getTagName();
        System.out.println(text);
        Assert.assertEquals(text, "a");
    }

    public void setCrimeJusticeSource() {
        String text = crimeJusticeSource.getText();
        Assert.assertEquals(text, "Crime + Justice");
    }

    public void setEnargyEnvironmentSource() {
        String text = enargyEnvironmentSource.getText();
        Assert.assertEquals(text, "Energy + Environment");
    }

    public void setExtremeWeather() throws Exception {
        extremeWeather.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Extreme Weather - CNN");
        driver.navigate().back();
    }
    public void setSpaceScince(){
       boolean scinceTab = spaceScince.isDisplayed();
       Assert.assertTrue(scinceTab);
    }
    public void setWorldNews(){
      String text =  worldNews.getText();
      Assert.assertEquals(text,"World");
    }
    public void setAfricaSouce(){
        boolean selected = africaSouce.isSelected();
        Assert.assertFalse(selected);
    }
    public void setAmericaSource(){
        boolean select = americaSource.isEnabled();
        Assert.assertTrue(select);
    }
    public void setAsiaSoure(){
        String text = asiaSoure.getText();
        Assert.assertEquals(text,"Asia");
    }












    public void clickOnSearch() {
        searchTab.click();
    }

    public void SearchWithtext(String searchItem) throws Exception {
        searchInput.sendKeys(searchItem, Keys.ENTER);
        Thread.sleep(3000);
        clearInput(".cnn-search__input");
        navigateBack();
    }
}
