package testlinkedin;

import base.CommonAPI;
import linkedin.Feed;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestFeed extends CommonAPI {

    String homeUrl = "https://www.linkedin.com/";
    Feed feed;


    @BeforeClass
    public void init() {
        driver.navigate().to(homeUrl);
        feed = PageFactory.initElements(driver, Feed.class);
        feed.logInLinkedIn("stest7380@gmail.com", "stest312@t");

    }


    @AfterMethod
    public void reStart(){
        driver.get(homeUrl);
    }

    @Test()
    public void getTitleOfFeedPage() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"get title of feed page");
       feed.getTitle();
    }


    @Test
    public void seeNotificationInFeed() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"see notifications");
        feed.seeNotification();
    }

    //@Test
    public void clickWriteArticle() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"click write article");
        feed.clickArticle();

    }

    @Test
    public void navigateToMyNetworkPage() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to My NetWork Page from feed");
        feed.clickMyNetworkPage();

    }

    @Test
    public void clickSearch() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"click on search tab");
        feed.clickSearchBox();
    }

    @Test
    public void search() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"search for john");
        feed.searchForPeople("John");
    }

    @Test
    public void navigateToJobsPage() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to Jobs Page from feed");
        feed.findJobs();
    }

    @Test
    public void openDropDown() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"open drop down");
        feed.seeDropdown();
    }

    @Test
    public void chooseSettingsFromDropDown() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"choose setting from dropdown");
        feed.chooseSettings();
    }

    @Test
    public void clickWorkDropDown() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {}.getClass().getEnclosingMethod().getName())+"click on the Work dropdown");
        feed.clickWorkDdown();
    }
}
