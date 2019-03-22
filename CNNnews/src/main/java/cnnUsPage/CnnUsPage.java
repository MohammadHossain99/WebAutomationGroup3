package cnnUsPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CnnUsPage extends CommonAPI {


    @FindBy(xpath = "//section[@id='us-zone-1']/div/div/div/ul/a//following-sibling::li/article/div/div/a")
    WebElement topImage;

    @FindBy(xpath = "//div[@class='ad ad--epic ad--tablet']//following-sibling::ul/a//following-sibling::li/article/div/div/a/img")
    WebElement table1stImg;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed li")
    WebElement storiestext;
    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed")
    WebElement storiestext1;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-container_DCB8F55B-ECE9-602C-1A45-5919511B4582.cn--expandable.cn--collapsed")
    WebElement alltextfromUsPage;

    @FindBy(css = "section[id='us-zone-8']")
    WebElement aroundtheUsText;

    @FindBy(xpath = "//section[@id='homepage4-zone-7']/div/div/div/ul/li/article/div/div/a/img")
    WebElement lastImg;

    @FindBy(css = ".m-legal__list")
    WebElement bottomTopics;
    @FindBy(xpath = "//section[@id='us-zone-8']/div/div/div/div//div[22]/article/div/div/a/img")
    WebElement clickingonfb;




    public void setTopImage(){
       boolean tIMG= topImage.isDisplayed();
        Assert.assertTrue(tIMG);

    }
    public void testurl(){
      String url=  driver.getCurrentUrl();
      Assert.assertEquals(url,"https://www.cnn.com/us");
    }

    public void setTable1stImg(){
       boolean tFisttIMG= table1stImg.isDisplayed();
       Assert.assertTrue(tFisttIMG);

    }

    public void setStoriestext(){
        String st = "Decades after Atlanta Child Murders, families hope for breakthrough in new review";
       String str =  storiestext.getText();
        System.out.println(str);
        Assert.assertEquals(str,st);

    }
    public void setStoriestext1(){
        String str =  storiestext1.getText();
        System.out.println(str);

    }


    public void setalltextfromUsPage(){
       String str = alltextfromUsPage.getText();
        System.out.println(str);
    }

    public void setLastImg(){
        boolean limg=lastImg.isDisplayed();
        Assert.assertTrue(limg);

    }

    public void setaroundtheUsText(){
        String str =  aroundtheUsText.getText();
        System.out.println(str);
    }
    public void setBottomTopics(){
        String st = bottomTopics.getText();
        String str = "Terms of UsePrivacy PolicyAccessibility & CCAdChoicesAbout usCNN " +
                "Studio ToursCNN StoreNewslettersTranscriptsLicense FootageCNN Newsource";
        System.out.println(st);
        Assert.assertEquals(st,str);
    }

    public void setclickingonfb(){
        clickingonfb.click();
    }





}
