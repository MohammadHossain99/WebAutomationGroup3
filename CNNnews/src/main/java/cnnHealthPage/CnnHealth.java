package cnnHealthPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

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

    @FindBy(xpath = "//div[@id='nav__plain-header']//following-sibling::footer/div/div/div/ol[3]/li/ol/li")
     WebElement bottomWorldAsianews;

    @FindBy(xpath = "//div[@id='nav__plain-header']//following-sibling::footer/div/div/div/ol[3]/li/ol/li[4]")
    WebElement bottomWorldAustralia;

    @FindBy(xpath = "//div[@id='nav__plain-header']//following-sibling::footer/div/div/div/ol[4]/li/ol/li[2]")
    WebElement  bottomPoliticsCongress;

    public void setStorisSix(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content in Health Page");
       String str = storisSix.getText();
        Assert.assertEquals(str,str);
    }
    public void setTopStoris(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top Stories in Health Page");
       String st = topStoris.getText();
        System.out.println(st);
    }
    public void setFirstIMG(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Health Page");
      boolean tr = firstIMG.isDisplayed();
      Assert.assertTrue(tr);
    }
    public void setTestParenting(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Parenting Content in Health Page");
       String str= testParenting.getText();
       Assert.assertEquals(str,"A germ-free childhood could trigger leukemia, scientist suggests");
    }
    public void setHouseStoris()throws Exception{
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify House Stories Health Page");
        houseStoris.click();
        Thread.sleep(3000);
        driver.navigate().to("https://www.cnn.com/health");
    }
    public void setPopulerSixthTopic(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Popular Topics Health Page");
        String str =populerSixthTopic.getText();
        Assert.assertEquals(str,str);
        populerSixthTopic.click();
        driver.navigate().to("https://www.cnn.com/health");
    }
    public void setpaidPartnerIMG(){
       boolean img= paidPartnerIMG.isDisplayed();
       Assert.assertTrue(img);
       paidPartnerIMG.click();
        driver.navigate().to("https://www.cnn.com/health");
    }
    public void setBottomWorldAsianews(){
        bottomWorldAsianews.click();
        driver.navigate().to("https://www.cnn.com/health");
    }
    public void setbottomWorldAustralia(){
       String st = bottomWorldAustralia.getText();
       Assert.assertEquals(st,"Australia");
    }
    public void setbottomPoliticsCongress(){
        bottomPoliticsCongress.click();
        driver.navigate().refresh();
        driver.navigate().to("https://www.cnn.com/health");
    }
}
