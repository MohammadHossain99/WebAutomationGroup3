package bbcworld;

import base.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class BBCWorld extends CommonAPI {
    Actions action = new Actions(driver);

    @FindBy(css = "#comp-pattern-library-5 > div > div > a.title-link > h3 > span")
    WebElement headlines;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement headlines2;

    @FindBy(xpath = "//*[@id=\'site-container\']/div[1]/div[4]/nav/ul/li[2]/a/span")
    WebElement headlines3;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement headlines4;

    @FindBy(xpath = "//*[@id=\'comp-candy-asset-munger-2\']/div/div[1]/div/div[2]/a/h3/span")
    WebElement Headlines5;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement featureSection;
    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement featureSection3;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement featureSection4;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement latestSories1;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[2]")
    WebElement latestSories2;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-3\']/div/div/a[1]/h3/span")
    WebElement latestStiries4;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement latestStories5;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-4\']/div/div/a[1]/h3/span")
    WebElement latestStories6;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span]")
    WebElement latestSories7;

    @FindBy(xpath = "//*[@id=\'comp-battenberg\']/div/div/a[1]/h3/span")
    WebElement latestStories8;

    @FindBy(xpath = "//*[@id=\'comp-battenberg\']/div/div/a[1]/h3/span")
    WebElement latestStories9;

    @FindBy(xpath = "//*[@id=\'comp-battenberg\']/div/div/a[1]/h3/span")
    WebElement latestStories11;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-3\']/div/div/a[1]/h3/span")
    WebElement latestStories12;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3")
    WebElement latestStories13;

    @FindBy(xpath = "//*[@id=\'bbccom_leaderboard_1_2_3_4\']")
    WebElement latestStories14;

    @FindBy(xpath = "//*[@id=\'comp-battenberg\']/div/div/a[1]/h3/span")
    WebElement latestStories15;

    @FindBy(xpath = "//*[@id=\'bbccom_leaderboard_1_2_3_4\']")
    WebElement latestStories16;

    @FindBy(xpath = "//*[@id=\'bbccom_leaderboard_1_2_3_4\']")
    WebElement latestStories17;

    @FindBy(xpath = "//*[@id=\'comp-battenberg\']/div/div/a[1]/h3/span")
    WebElement latestStories18;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-4\']/div/div/a[1]/h3/span")
    WebElement latestStories19;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement latestStories20;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement latestStories21;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories22;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories23;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories24;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories25;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories26;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories27;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories28;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories29;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories30;

    public void setHeadlines() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines World Page");
        String text = headlines.getText();
        Assert.assertEquals(text, text);
    }

    public void setHeadlines2() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines2 in BBC World Page");
        boolean selected = headlines2.isSelected();
        Assert.assertFalse(selected);
    }

    public void setHeadlines3() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines3 : Asia");
        action.moveToElement(headlines3);
        boolean selected = headlines3.isEnabled();
        Assert.assertTrue(selected);
    }

    public void setHeadlines4() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines4 in BBC World Page: Africa");
    }

    public void setHeadlines5() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines5 in BBC World Page: Asia - India");
        action.build().perform();
        action.moveToElement(Headlines5);
        String text = Headlines5.getText();
        Assert.assertEquals(text, text);
    }

    public void setFeatureSection() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Feature Section in BBC World Page: Latin America");
        action.moveToElement(featureSection);
        String text = featureSection.getText();
        Assert.assertEquals(text, text);
        System.out.println(text);
    }

    public void setFeatureSection3() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page");
        action.moveToElement(featureSection3);
        boolean select = featureSection3.isDisplayed();
        Assert.assertTrue(select);
    }

    public void setFeatureSection4() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page");
        boolean selected = featureSection4.isSelected();
        Assert.assertFalse(selected);
    }
    public void setLatestSories1(){
        driver.get("https://www.bbc.com/news/uk");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines7 in BBC World Page: UK");
        action.moveToElement(latestSories1);
        String text = latestSories1.getText();
        System.out.println(text);
        Assert.assertEquals(text,text);
    }
    public void setLatestSories2(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines8 in BBC World Page");
        action.moveToElement(latestSories2).click();
        String text = driver.getTitle();
        System.out.println(text);
    }
    public void setLatestStiries4(){
        driver.get("https://www.bbc.com/news/northern_ireland");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines9 in BBC World Page: Ireland");
        action.moveToElement(latestStiries4);
        String text = latestStiries4.getText();
        Assert.assertEquals(text,text);
    }
    public void setLatestStories5(){
        driver.get("https://www.bbc.com/news/northern_ireland/northern_ireland_politics");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines10 in BBC World Page: Ireland");
        action.moveToElement(latestStories5);
        action.moveToElement(latestStiries4).moveToElement(latestStories5);
        boolean selected = latestStories5.isDisplayed();
        Assert.assertTrue(selected);
    }
    public void setLatestStories6(){
        driver.get("https://www.bbc.com/news/scotland");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines11 in BBC World Page: Scotland");
        action.moveToElement(latestStories6);
        boolean select = latestStories6.isSelected();
        Assert.assertFalse(select);
    }
    public void setLatestSories7(){
        driver.get("https://www.bbc.com/news/scotland/scotland_business");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines12 in BBC World Page: Scotland Business");
        action.moveToElement(latestSories7).click();
        driver.navigate().refresh();
    }
    public void setLatestStories8(){
        driver.get("https://www.bbc.com/news/scotland/glasgow_and_west");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines13 in BBC World Page: Glasgo");
        action.moveToElement(latestStories8);
        boolean selectd = latestStories8.isDisplayed();
        Assert.assertTrue(selectd);
    }
    public void setLatestStories9()throws Exception{
        driver.get("https://www.bbc.com/news/scotland/edinburgh_east_and_fife");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines14 in BBC World Page: EdinBurgh");
        action.moveToElement(latestStories9).doubleClick(latestStories9);
        Thread.sleep(4000);
        Dimension st= latestStories9.getSize();
        System.out.println(st);
        Assert.assertEquals(st,st);
    }
    public void setLatestStories11(){
        driver.get("https://www.bbc.com/news/scotland/highlands_and_islands");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines15 in BBC World Page: Highland");
        action.moveToElement(latestStories11);
        String text =latestStories11.getText();
        Assert.assertEquals(text,text);
    }
    public void setLatestStories12(){
        driver.get("https://www.bbc.com/news/wales");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines16 in BBC World Page: Wales");
        action.moveToElement(latestStories12);
        boolean text =latestStories12.isDisplayed();
        Assert.assertTrue(text);
    }
    public void setLatestStories13(){
        driver.get("https://www.bbc.com/news/wales/wales_politics");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines17 in BBC World Page: Wales Politics");
        action.moveToElement(latestStories13);
        boolean select = latestStories13.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories14(){
        driver.get("https://www.bbc.com/news/wales/north_west_wales");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Wales - North West");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories15(){
        driver.get("https://www.bbc.com/news/wales/north_east_wales");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Wales - North East");
        action.moveToElement(latestStories15);
        boolean select = latestStories15.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories16(){
        driver.get("https://www.bbc.com/news/wales/mid_wales");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Wales - Mid");
        action.moveToElement(latestStories16);
        boolean select = latestStories16.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories17(){
        driver.get("https://www.bbc.com/news/wales/south_west_wales");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Wales - South West");
        action.moveToElement(latestStories17);
        boolean select = latestStories17.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories18(){
        driver.get("https://www.bbc.com/news/wales/south_east_wales");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Wales - South East");
        action.moveToElement(latestStories18);
        boolean select = latestStories18.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories19(){
        driver.get("https://www.bbc.com/news/england");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: England");
        action.moveToElement(latestStories19);
        boolean select = latestStories19.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories20(){
        driver.get("https://www.bbc.com/news/politics");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: England");
        action.moveToElement(latestStories20);
        boolean select = latestStories20.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories21(){
        driver.get("https://www.bbc.com/news/world/latin_america");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Latin America: Uruguay");
        action.moveToElement(latestStories21);
        boolean select = latestStories21.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories22(){
        driver.get("https://www.bbc.com/news/world-latin-america-47781249");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Latin America: Venezuela");
        action.moveToElement(latestStories22);
        boolean select = latestStories22.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories23(){
        driver.get("https://www.bbc.com/news/world-latin-america-47750729");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Latin America: Red Cross-Venezuela");
        action.moveToElement(latestStories23);
        boolean select = latestStories23.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories24(){
        driver.get("https://www.bbc.com/news/world-europe-47785258");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Macedonia");
        action.moveToElement(latestStories24);
        boolean select = latestStories24.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories25(){
        driver.get("https://www.bbc.com/news/world-europe-47785097");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Spain");
        action.moveToElement(latestStories25);
        boolean select = latestStories25.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories26(){
        driver.get("https://www.bbc.com/news/world-europe-47785095");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Turkey");
        action.moveToElement(latestStories26);
        boolean select = latestStories26.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories27(){
        driver.get("https://www.bbc.com/news/world-europe-47781254");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - EU");
        action.moveToElement(latestStories27);
        boolean select = latestStories27.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories28(){
        driver.get("https://www.bbc.com/news/world-europe-47785088");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - France");
        action.moveToElement(latestStories28);
        boolean select = latestStories28.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories29(){
        driver.get("https://www.bbc.com/news/business-47746141");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Turkey Business");
        action.moveToElement(latestStories29);
        boolean select = latestStories29.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories30(){
        driver.get("https://www.bbc.com/news/world-europe-47772604");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - France");
        action.moveToElement(latestStories30);
        boolean select = latestStories30.isEnabled();
        Assert.assertTrue(select);
    }
}

