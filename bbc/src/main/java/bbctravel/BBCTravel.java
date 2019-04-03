package bbctravel;

import base.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class BBCTravel extends CommonAPI {
    Actions action = new Actions(driver);

    @FindBy(xpath = "//*[@id=\'orb-nav-links\']/ul/li[7]/a")
    WebElement headerlines;

    @FindBy(xpath = "//*[@id=\'nav-branding\']/div[2]/div")
    WebElement headlines2;

    @FindBy(xpath = "//*[@id=\'nav-top\']/div/ul/li[2]/a")
    WebElement headlines3;

    @FindBy(xpath = "//*[@id=\'homepage-two-column\']/div[1]/div[1]/div/img")
    WebElement headlines4;

    @FindBy(xpath = "//*[@id=\'homepage-two-column\']/div[1]/div[1]/div/img")
    WebElement featureSection;

    @FindBy(xpath = "//*[@id=\'homepage-two-column\']/div[1]/div[1]/div/img")
    WebElement featureSection3;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[1]/div/ul/li[7]/a/span")
    WebElement featureSection4;

    @FindBy(xpath = "//*[@id=\'0599284e-9253-46e3-8be2-5f484c97ebff\']")
    WebElement latestSories2;

    @FindBy(xpath = "//*[@id=\'sp-nav-secondary\']/li[2]/a")
    WebElement latestStories5;

    @FindBy(xpath = "//*[@id=\'responsive-story-page\']/article/h1")
    WebElement latestStories6;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[7]/a/span]")
    WebElement latestSories7;

    @FindBy(xpath = "//*[@id=\"sport\"]/div[1]/nav[2]/div/div/ul[1]/li[3]/a/span[2]")
    WebElement latestStories8;

    @FindBy(xpath = "//*[@id=\'page\']/div[2]/div[2]/div/div/div/h1")
    WebElement latestStories9;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[3]/a/span[2]")
    WebElement latestStories11;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[8]/a")
    WebElement latestStories12;

    @FindBy(xpath = "//*[@id=\'sp-nav-secondary\']/li[6]")
    WebElement latestStories13;

    @FindBy(xpath = "//*[@id=\'responsive-story-page\']/article/h1")
    WebElement latestStories14;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[3]/a/span")
    WebElement latestStories15;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[2]/a/span[3]")
    WebElement latestStories16;

    @FindBy(xpath = "//*[@id=\'sport-html\']/body/script[2]")
    WebElement latestStories17;

    @FindBy(xpath = "//*[@id=\'sport-html\']/body/script[2]")
    WebElement latestStories18;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[4]/a/span")
    WebElement latestStories19;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[6]/a/span")
    WebElement latestStories20;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[5]")
    WebElement latestStories21;

    @FindBy(xpath = "//*[@id=\'sport']/div[1]/nav[2]/div/div/ul[1]/li[6]")
    WebElement latestStories22;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[7]")
    WebElement latestStories23;

    @FindBy(xpath = "//*[@id=\"orb-modules\"]")
    WebElement latestStories24;

    @FindBy(xpath = "//*[@id=\'sp-c-filter-contents\']/div/h2")
    WebElement latestStories25;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[3]/a")
    WebElement latestStories26;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[4]/a")
    WebElement latestStories27;

    @FindBy(xpath = "//*[@id=\'sport\']/div[1]/nav[2]/div/div/ul[1]/li[5]")
    WebElement latestStories28;

    @FindBy(xpath = "//*[@id=\'sport-html\']/head")
    WebElement latestStories29;

    @FindBy(xpath = "//*[@id=\'sport-html\']/head/title")
    WebElement latestStories30;

    public void setHeadlines() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify BBC Travel Tab");
        String text = headerlines.getText();
        Assert.assertEquals(text, text);
    }
    public void setHeadlines2() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify BBC Travel Page");
        boolean selected = headlines2.isSelected();
        Assert.assertFalse(selected);
    }
    public void setHeadlines3() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Food & Hospitality");
        action.moveToElement(headlines3);
        boolean selected = headlines3.isEnabled();
        Assert.assertTrue(selected);
    }
    public void setHeadlines4() {
        driver.getTitle();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Travel - Discovery");
    }
    public void setFeatureSection() {
        driver.get("http://www.bbc.com/travel/asia/bangladesh");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC : Destination Bangladesh");
        action.moveToElement(featureSection);
        String text = featureSection.getText();
        Assert.assertEquals(text, text);
        System.out.println(text);
    }

    public void setFeatureSection3() {
        driver.get("http://www.bbc.com/travel/columns/culture-identity");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC: Culture & Identity");
        action.moveToElement(featureSection3);
        boolean select = featureSection3.isDisplayed();
        Assert.assertTrue(select);
    }
//    public void setFeatureSection4() {
//        driver.get("https://www.bbc.com/sport/tennis");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Sports: Tennis");
//        boolean selected = featureSection4.isSelected();
//        Assert.assertFalse(selected);
//    }
//    public void setLatestSories2(){
//        driver.get("https://www.bbc.com/sport/athletics");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC sports: Golf");
//        action.moveToElement(latestSories2).click();
//        String text = driver.getTitle();
//        System.out.println(text);
//    }
//    public void setLatestStories5(){
//        driver.get("https://www.bbc.com/sport/football/scores-fixtures");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Football: Fixture");
//        action.moveToElement(latestStories5);
//        boolean selected = latestStories5.isDisplayed();
//        Assert.assertTrue(selected);
//    }
//    public void setLatestStories6(){
//        driver.get("https://www.bbc.com/sport/football/gossip");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Football gossip");
//        action.moveToElement(latestStories6);
//        boolean select = latestStories6.isSelected();
//        Assert.assertFalse(select);
//    }
//    public void setLatestSories7(){
//        driver.get("https://www.bbc.com/sport/football/leagues-cups");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Football: FA Cup");
//        action.moveToElement(latestSories7).click();
//        driver.navigate().refresh();
//    }
//    public void setLatestStories8(){
//        driver.get("https://www.bbc.com/sport/football/champions-league");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Football: Champion League");
//        action.moveToElement(latestStories8);
//        boolean selectd = latestStories8.isDisplayed();
//        Assert.assertTrue(selectd);
//    }
//    public void setLatestStories9()throws Exception{
//        driver.get("https://www.bbc.com/sport/football/champions-league/top-scorers");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Football: Top Scorer");
//        action.moveToElement(latestStories9).doubleClick(latestStories9);
//        Thread.sleep(4000);
//        Dimension st= latestStories9.getSize();
//        System.out.println(st);
//        Assert.assertEquals(st,st);
//    }
//    public void setLatestStories11(){
//        driver.get("https://www.bbc.com/sport/football/europa-league");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Football: Europa League");
//        action.moveToElement(latestStories11);
//        String text =latestStories11.getText();
//        Assert.assertEquals(text,text);
//    }
//    public void setLatestStories12(){
//        driver.get("https://www.bbc.com/sport/cricket/teams");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Cricket: All Teams");
//        action.moveToElement(latestStories12);
//        boolean text =latestStories12.isDisplayed();
//        Assert.assertTrue(text);
//    }
//    public void setLatestStories13(){
//        driver.get("https://www.bbc.com/sport/cricket/tables");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "England County Cricket Table");
//        action.moveToElement(latestStories13);
//        boolean select = latestStories13.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories14(){
//        driver.get("https://www.bbc.com/sport/cricket/47780585");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "England Cricket News");
//        action.moveToElement(latestStories14);
//        boolean select = latestStories14.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories15(){
//        driver.get("https://www.bbc.com/sport/cricket/results");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "IPL Cricket News");
//        action.moveToElement(latestStories15);
//        boolean select = latestStories15.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories16(){
//        driver.get("https://www.bbc.com/sport/cricket/womens");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Women's Cricket");
//        action.moveToElement(latestStories16);
//        boolean select = latestStories16.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories17(){
//        driver.get("https://www.bbc.com/sport/cricket/teams/england-women/fixtures");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Women's Cricket Fixture");
//        action.moveToElement(latestStories17);
//        boolean select = latestStories17.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories18(){
//        driver.get("https://www.bbc.com/sport/formula1/drivers-world-championship/standings");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Race Car Standing");
//        action.moveToElement(latestStories18);
//        boolean select = latestStories18.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories19(){
//        driver.get("https://www.bbc.com/sport/formula1/race-calendar");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Race Car Team");
//        action.moveToElement(latestStories19);
//        boolean select = latestStories19.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories20(){
//        driver.get("https://www.bbc.com/sport/formula1/30427769");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Race Car Drivers");
//        action.moveToElement(latestStories20);
//        boolean select = latestStories20.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories21(){
//        driver.get("https://www.bbc.com/sport/tennis/calendar");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Tennis Calendar");
//        action.moveToElement(latestStories21);
//        boolean select = latestStories21.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories22(){
//        driver.get("https://www.bbc.com/sport/tennis/19852821");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Tennis Men's Ranking");
//        action.moveToElement(latestStories22);
//        boolean select = latestStories22.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories23(){
//        driver.get("https://www.bbc.com/sport/tennis/19852825");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Tennis Women's Ranking");
//        action.moveToElement(latestStories23);
//        boolean select = latestStories23.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories24(){
//        driver.get("https://www.bbc.com/sport/tennis/results");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Miami Open - Men's Double");
//        action.moveToElement(latestStories24);
//        boolean select = latestStories24.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories25(){
//        driver.get("https://www.bbc.com/sport/tennis/results");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Miami Open - Women's Single");
//        action.moveToElement(latestStories25);
//        boolean select = latestStories25.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories26(){
//        driver.get("https://www.bbc.com/sport/golf/calendar");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Golf Calendar");
//        action.moveToElement(latestStories26);
//        boolean select = latestStories26.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories27(){
//        driver.get("https://www.bbc.com/sport/golf/17011043");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Golf Men Ranking");
//        action.moveToElement(latestStories27);
//        boolean select = latestStories27.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories28(){
//        driver.get("https://www.bbc.com/sport/golf/17016851");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Golf Women Ranking");
//        action.moveToElement(latestStories28);
//        boolean select = latestStories28.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories29(){
//        driver.get("https://www.bbc.com/sport/athletics/calendar");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Athletic Calendar");
//        action.moveToElement(latestStories29);
//        boolean select = latestStories29.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories30(){
//        driver.get("https://www.bbc.com/sport/cycling");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC Cycling Calendar");
//        action.moveToElement(latestStories30);
//        boolean select = latestStories30.isEnabled();
//        Assert.assertTrue(select);
//    }
}
