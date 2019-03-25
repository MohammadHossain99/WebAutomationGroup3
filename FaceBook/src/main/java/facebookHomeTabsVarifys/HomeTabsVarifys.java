package facebookHomeTabsVarifys;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomeTabsVarifys extends CommonAPI {

    @FindBy(id = "email")
    WebElement loginemail;

    @FindBy(css = "#pass")
    WebElement loginPass;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginTab;

    /*******************/

    @FindBy(className = "_y-c")
    WebElement seeMore;

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

    @FindBy(css = "#navItem_2530096808")
    WebElement pagesTab;

    @FindBy(id = "navItem_1434659290104689")
    WebElement groupTab;

    @FindBy(id = "navItem_2344061033")
    WebElement eventsTab;

    @FindBy(id = "navItem_1572366616371383")
    WebElement friendList;

    @FindBy(xpath = "//li[@id='navItem_140332009231']")
    WebElement gamesTab;

    @FindBy(css = "#navItem_193356651002223")
    WebElement fundRisers;

    @FindBy(css = "#navItem_303257506544370")
    WebElement memoriesTab;

//    @FindBy(id = "navItem_156203961126022")
//    WebElement welcomeTab;

        @FindBy(xpath = "//ul[@class='_bui _3-96']/li[@id='navItem_2356318349']")
        WebElement findfriendTab;
    //
    //    @FindBy(id = "navItem_1434659290104689")
    //    WebElement groupTab;
    //
    //    @FindBy(id = "navItem_2344061033")
    //    WebElement eventsTab;
    //
    //    @FindBy(id = "navItem_1572366616371383")
    //    WebElement friendList;
    //
    //



    /*********************************/

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void setLogIn() {
        loginemail.sendKeys("taherjuwel3262@gmail.com");
        loginPass.sendKeys("Juwel1234");
        loginTab.click();
    }
    public boolean seeMore(){
        seeMore.click();
       return seeMore.isDisplayed();
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
        driver.navigate().back();
    }

    public void setWatchTab() throws Exception{
        watchTab.click();
        Thread.sleep(3000);
        boolean tab = latestVideo.isSelected();
        Assert.assertFalse(tab);
        driver.navigate().back();
    }
    public void setWellcomeTab(){
       String welcome = welcomeTab.getText();
       Assert.assertEquals(welcome,"Welcome");
    }
    public void setPagesTab()throws Exception{
        pagesTab.click();
        Thread.sleep(3000);
       String title= driver.getTitle();
       Assert.assertEquals(title,"Suggested Pages");
       driver.navigate().back();
    }
    public void setGroupTab()throws Exception{
        groupTab.click();
        Thread.sleep(3000);
        String groupTitle=driver.getTitle();
        Assert.assertEquals(groupTitle,"Discover Groups");
        System.out.println(groupTitle);
        driver.navigate().back();
    }
    public void setEventsTab(){
       String text= eventsTab.getText();
       Assert.assertEquals(text,text);
    }
    public void setFriendList(){
        friendList.click();
        driver.navigate().refresh();
        String title = friendList.getText();
        Assert.assertEquals(title,"Friend lists");
        driver.navigate().back();
    }
    public void setGamesTab()throws Exception{
        gamesTab.click();
//        driver.findElement(By.cssSelector("navItem_140332009231")).click();
        driver.navigate().refresh();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Instant Games");
        driver.navigate().to("https://www.facebook.com/");
    }
    public void setFundRisers()throws Exception{
        seeMore();
        String text = fundRisers.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Fundraisers");
        Thread.sleep(4000);
    }
    public void setMemoriesTab(){
        seeMore();
       String text = memoriesTab.getText();
       Assert.assertEquals(text,"Memories");
    }
    public void setFindfriendTab(){
        seeMore();
       boolean findTab = findfriendTab.isDisplayed();
       Assert.assertTrue(findTab);
    }
}
