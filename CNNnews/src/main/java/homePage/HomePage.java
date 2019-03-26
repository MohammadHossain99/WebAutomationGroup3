package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[5]/a")
    WebElement chinaSoure;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[6]/a")
    WebElement europeSource;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[7]")
    WebElement middleEast;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[8]")
    WebElement indiaSource;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[4]/li/ol/li[3]")
    WebElement suprimeCourtSource;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[4]/li/ol/li[3]")
    WebElement factsFirst;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[6]/li/a")
    WebElement opinioSource;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[7]/li/ol/li[1]/a")
    WebElement foodSource;

    /**********************/

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[7]/li/ol/li[2]")
    WebElement fitnessSource;

    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[7]/li/ol/li[3]")
    WebElement wellnessSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(7) li ol li:nth-child(5) a")
    WebElement liveLongerSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(10) li ol li:nth-child(1)")
    WebElement artSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(10) li ol li:nth-child(2)")
    WebElement designSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(10) li ol li:nth-child(3)")
    WebElement fasionSoure;

    @FindBy(css = ".l-footer__content div div ol:nth-child(10) li ol li:nth-child(5)")
    WebElement luxurySource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(11) li ol li:nth-child(1)")
    WebElement destinationSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(11) li ol li:nth-child(2)")
    WebElement foodAndDrinksSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(12) li ol li:nth-child(2)")
    WebElement collegeFootball;

    @FindBy(css = ".l-footer__content div div ol:nth-child(12) li ol li:nth-child(3)")
    WebElement basketBallSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(12) li ol li:nth-child(4)")
    WebElement baseBallSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(12) li ol li:nth-child(5)")
    WebElement soccerSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(12) li ol li:nth-child(6)")
    WebElement olympicSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(13) li ol li:nth-child(2)")
    WebElement digitalStudioSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(13) li ol li:nth-child(3)")
    WebElement cnnFilmsSource;

    @FindBy(css = ".l-footer__content div div ol:nth-child(13) li ol li:nth-child(4)")
    WebElement hlnSource;

    /***********************/

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

    public void setSpaceScince() {
        boolean scinceTab = spaceScince.isDisplayed();
        Assert.assertTrue(scinceTab);
    }

    public void setWorldNews() {
        String text = worldNews.getText();
        Assert.assertEquals(text, "World");
    }

    public void setAfricaSouce() {
        boolean selected = africaSouce.isSelected();
        Assert.assertFalse(selected);
    }

    public void setAmericaSource() {
        boolean select = americaSource.isEnabled();
        Assert.assertTrue(select);
    }

    public void setAsiaSoure() {
        String text = asiaSoure.getText();
        Assert.assertEquals(text, "Asia");
    }

    public void setChinaSoure() throws Exception {
        String text = chinaSoure.getText();
        Assert.assertEquals(text, "China");
    }

    public void setEuropeSource() {
        boolean selected = europeSource.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setMiddleEast() {
        boolean seleted = middleEast.isSelected();
        Assert.assertFalse(seleted);
    }

    public void setIndiaSource() {
        String text = indiaSource.getText();
        Assert.assertEquals(text, "India");
    }

    public void setSuprimeCourtSource() {
        boolean selected = suprimeCourtSource.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setFactsFirst() {
        String tagName = factsFirst.getTagName();
        Assert.assertEquals(tagName, "li");
    }

    public void setOpinioSource() {
        String text = opinioSource.getText();
        Assert.assertEquals(text, "Opinion");
    }

    public void setFoodSource() throws Exception {
        Thread.sleep(3000);
        driver.navigate().refresh();
        foodSource.click();
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(text, "Food and Diet - CNN");
    }

    public void setFitnessSource() {
        String text = fitnessSource.getText();
        Assert.assertEquals(text, "Fitness");
    }

    public void setWellnessSource() {
        boolean select = wellnessSource.isDisplayed();
        Assert.assertTrue(select);
    }

    public void setLiveLongerSource() throws Exception {
        Thread.sleep(3000);
        String title = liveLongerSource.getText();
        System.out.println(title);
        Assert.assertEquals(title, "Live Longer");
    }

    public void setArtSource() {
        boolean selected = artSource.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setDesignSource() {
        boolean selected = designSource.isSelected();
        Assert.assertFalse(selected);
    }

    public void setFasionSoure() {
        String title = fasionSoure.getText();
        Assert.assertEquals(title, "Fashion");
    }

    public void setLuxurySource() throws Exception {
        boolean text = luxurySource.isEnabled();
        Assert.assertTrue(text);

    }

    public void setDestinationSource() {
        destinationSource.click();
        driver.navigate().refresh();
        String title = driver.getTitle();
        Assert.assertEquals(title, title);
        driver.navigate().back();
    }

    public void setCollegeFootball(){
        boolean selected = collegeFootball.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setFoodAndDrinksSource() {
        String text = foodAndDrinksSource.getText();
        Assert.assertEquals(text,"Food & Drink");
    }

    public void setBasketBallSource(){
        boolean seleted = basketBallSource.isEnabled();
        Assert.assertTrue(seleted);
    }

    public void setBaseBallSource(){
        boolean selected = baseBallSource.isSelected();
        Assert.assertFalse(selected);
    }
    public void setSoccerSource(){
        String text = soccerSource.getTagName();
        Assert.assertEquals(text,"li");
    }
    public void setOlympicSource(){
        boolean selected = olympicSource.isDisplayed();
        Assert.assertTrue(selected);
    }
    public void setDigitalStudioSource(){
        String text = digitalStudioSource.getText();
        Assert.assertEquals(text,"Digital Studios");
    }
    public void setCnnFilmsSource(){
        Actions action = new Actions(driver);
        action.moveToElement(cnnFilmsSource).perform();
        action.moveToElement(cnnFilmsSource).click();
        driver.navigate().back();
    }
    public void setHLNSource(){
        Actions action = new Actions(driver);
        action.moveToElement(hlnSource).perform();
        action.moveToElement(hlnSource).click();
        driver.navigate().back();
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
