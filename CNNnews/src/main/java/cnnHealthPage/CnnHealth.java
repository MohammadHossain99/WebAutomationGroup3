package cnnHealthPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CnnHealth extends CommonAPI {


    @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed li:nth-child(6)")
    WebElement storisSix;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed")
    WebElement topStoris;

    @FindBy(xpath = "//section[@id='health-zone-1']/div/div/div[@class='column zn__column--idx-0']/ul/li/article/div/div/a/img")
    WebElement firstIMG;

    @FindBy(css = ".cn.cn-grid-small.cn--idx-0.cn-coverageContainer_F88040B3-E11A-13A0-E56D-DDAFADE02BCB.cn--has-shingle.cn-grid.cn-grid--small div:nth-child(3)")
    WebElement testParenting;

    @FindBy(xpath = "//span[contains(text(),'How to pay off your house ASAP (It's so simple)')]")
    WebElement houseStoris;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-container_AE924ECF-E3AC-3569-1D82-DD5D6BE467B7.cn--expandable.cn--collapsed li:nth-child(6)")
    WebElement populerSixthTopic;

    @FindBy(xpath = "//section[@id='health-zone-8']/div/div/div[3]/ul/a//following-sibling::li/article/div/div/a/img")
    WebElement paidPartnerIMG;

//    @FindBy(id = "")
//            WebElement
//
//    @FindBy(id = "")
//    WebElement
//
//    @FindBy(id = "")
//            WebElement
//
//    @FindBy(id = "")
//    WebElement

    public void setstorisSix(){
       String str = storisSix.getText();
        Assert.assertEquals(str,"Kentucky governor says he exposed his children to chickenpox rather than getting vaccine");
    }
    public void setTopStoris(){
       String st = topStoris.getText();
        System.out.println(st);
    }
    public void setFirstIMG(){
      boolean tr = firstIMG.isDisplayed();
      Assert.assertTrue(tr);
    }
    public void setTestParenting(){
       String str= testParenting.getText();
       Assert.assertEquals(str,"A germ-free childhood could trigger leukemia, scientist suggests");
    }
    public void setHouseStoris()throws Exception{
        houseStoris.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
    public void setPopulerSixthTopic(){
        String str =populerSixthTopic.getText();
        Assert.assertEquals(str,"One-third of uninsured can't afford to take drugs as prescribed");
        populerSixthTopic.click();
        driver.navigate().back();
    }
    public void setpaidPartnerIMG(){
       boolean img= paidPartnerIMG.isDisplayed();
       Assert.assertTrue(img);
       paidPartnerIMG.click();
       driver.navigate().back();
    }




}
