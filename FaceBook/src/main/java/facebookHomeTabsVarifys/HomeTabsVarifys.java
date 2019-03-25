package facebookHomeTabsVarifys;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeTabsVarifys extends CommonAPI {


    @FindBy(id = "email")
    WebElement loginemail;

    @FindBy(css = "#pass")
    WebElement loginPass;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginTab;

    /*******************/

    @FindBy(id = "navItem_4748854339")
    WebElement newsFeed;
    @FindBy(css = "#navItem_217974574879787")
    WebElement messengerTab;

    @FindBy(id = "navItem_2392950137")
    WebElement watchTab;

    @FindBy(css = "div._2yaa:nth-child(1)")
    WebElement latestVideo;

    @FindBy(id = "navItem_156203961126022")
    WebElement welcomeTab;

    @FindBy(xpath = "//div[@class='_2tev']/div[@class='uiScaledImageContainer _2tew _6l-']//img")
    WebElement testImage;

    @FindBy(xpath = "//div[@class='_cy7']")
    WebElement findFriend;

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchTab;

    @FindBy(id = "u_0_h")
    WebElement element;

    /*********************************/

    public void setLogIn() {
        loginemail.sendKeys("taherjuwel3262@gmail.com");
        loginPass.sendKeys("Juwel1234");
        loginTab.click();
    }

    public void setNewsFeed() {
        String text = newsFeed.getText();
        newsFeed.click();
        Assert.assertEquals(text, text);
    }

    public void setMessengerTab() {
        String text = messengerTab.getText();
        messengerTab.click();
        Assert.assertEquals(text, "Messenger");
    }

    public void setWatchTab() throws Exception{
        watchTab.click();
        boolean tab = latestVideo.isSelected();
        Assert.assertFalse(tab);
        driver.navigate().back();
        Thread.sleep(3000);

    }
    public void setWellcomeTab(){
       String welcome = welcomeTab.getText();
       Assert.assertEquals(welcome,"Welcome");
    }



}
