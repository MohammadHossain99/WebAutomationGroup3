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
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[2]/li/ol/li[3]")
//    WebElement extremeWeather;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[2]/li/ol/li[4]")
//    WebElement spaceScince;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/a")
//    WebElement worldNews;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[1]")
//    WebElement africaSouce;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[2]")
//    WebElement americaSource;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[3]")
//    WebElement asiaSoure;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[5]/a")
//    WebElement chinaSoure;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[6]/a")
//    WebElement europeSource;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[7]")
//    WebElement middleEast;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[3]/li/ol/li[8]")
//    WebElement indiaSource;
//
//    @FindBy(xpath = "//div[@class='l-footer__content']/div/div/ol[4]/li/ol/li[3]")
//    WebElement suprimeCourtSource;
//
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

}
