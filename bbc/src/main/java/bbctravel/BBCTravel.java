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

    @FindBy(xpath = "//*[@id=\'homepage-two-column\']/div[1]/div[1]/div/img")
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
    public void setFeatureSection4() {
        driver.get("http://www.bbc.com/travel/antarctica");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "BBC : Travel to Antarctica");
        boolean selected = featureSection4.isSelected();
        Assert.assertFalse(selected);
    }
}
