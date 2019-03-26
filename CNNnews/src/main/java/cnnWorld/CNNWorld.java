package cnnWorld;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CNNWorld extends CommonAPI {

    Actions action = new Actions(driver);

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li article div div a img")
    WebElement visiblefirstIMG;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(4)")
    WebElement headlines;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(3)")
    WebElement headlines2;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(5)")
    WebElement headlines3;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(6)")
    WebElement headlines4;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(6)")
    WebElement Headlines5;

    @FindBy(xpath = "//section[@id='world-zone-3']/div[6]/div[2]/div/ul/li[3]")
    WebElement featureSection;

    @FindBy(xpath = "//section[@id='world-zone-3']/div[6]/div[2]/div/ul/li[4]")
    WebElement featureSection3;

    @FindBy(xpath = "//section[@id='world-zone-3']/div[6]/div[2]/div/ul/li[6]")
    WebElement featureSection4;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[1]")
    WebElement latestSories1;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[2]")
    WebElement latestSories2;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[3]/article/div/div[2]")
    WebElement latestStiries4;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[4]/article/div/div[2]")
    WebElement latestStories5;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[5]/article/div/div[2]")
    WebElement latestStories6;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[6]/article/div/div[2]")
    WebElement latestSories7;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[7]/article/div/div[2]")
    WebElement latestStories8;

//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[4]/li/ol/li[3]")
//    WebElement factsFirst;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[6]/li/a")
//    WebElement opinioSource;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[7]/li/ol/li[1]/a")
//    WebElement foodSource;



    public void setVisiblefirstIMG(){
        action.moveToElement(visiblefirstIMG);
        boolean selected =  visiblefirstIMG.isDisplayed();
        Assert.assertTrue(selected);
    }
    public void setHeadlines(){
        action.moveToElement(headlines).moveToElement(visiblefirstIMG).moveToElement(headlines);
        String text = headlines.getText();
        Assert.assertEquals(text,text);
    }
    public void setHeadlines2(){
        boolean selected = headlines2.isSelected();
        Assert.assertFalse(selected);
    }
    public void setHeadlines3(){
        action.moveToElement(headlines3);
        boolean selected = headlines3.isEnabled();
        Assert.assertTrue(selected);
    }
    public void setHeadlines4(){
        action.moveToElement(headlines4).moveToElement(headlines).perform();
        boolean selected = headlines4.isSelected();
        Assert.assertFalse(selected);
    }
    public void setHeadlines5(){
        action.build().perform();
        action.moveToElement(Headlines5);
        String text = Headlines5.getText();
        Assert.assertEquals(text,text);
    }
    public void setFeatureSection(){
        action.moveToElement(featureSection);
        String text = featureSection.getText();
        Assert.assertEquals(text,text);
        System.out.println(text);
    }
    public void setFeatureSection3(){
        action.moveToElement(featureSection3);
        boolean select = featureSection3.isDisplayed();
        Assert.assertTrue(select);
    }
    public void setFeatureSection4(){
        boolean selected = featureSection4.isSelected();
        Assert.assertFalse(selected);
    }
    public void setLatestSories1(){
        action.moveToElement(latestSories1);
        String text = latestSories1.getText();
        System.out.println(text);
        Assert.assertEquals(text,text);
    }
    public void setLatestSories2(){
        action.moveToElement(latestSories2).click();
       String text = driver.getTitle();
        System.out.println(text);
    }
    public void setLatestStiries4(){
        action.moveToElement(latestStiries4);
        String text = latestStiries4.getText();
        Assert.assertEquals(text,text);
    }
    public void setLatestStories5(){
        action.moveToElement(latestStories5);
        action.moveToElement(latestStiries4).moveToElement(latestStories5);
        boolean selected = latestStories5.isDisplayed();
        Assert.assertTrue(selected);
    }
    public void setLatestStories6(){
        action.moveToElement(latestStories6);
        boolean select = latestStories6.isSelected();
        Assert.assertFalse(select);
    }
    public void setLatestSories7(){
        action.moveToElement(latestSories7).click();
        driver.navigate().refresh();
        driver.navigate().back();
    }
    public void setLatestStories8(){
        action.moveToElement(latestStories8);
        boolean selectd = latestStories8.isDisplayed();
        Assert.assertTrue(selectd);
    }
}
