import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestFeed extends CommonAPI {

    String homeUrl = "https://www.linkedin.com/";
    Feed feed;


    @BeforeMethod
    public void init() {
        driver.navigate().to(homeUrl);
        feed = PageFactory.initElements(driver, Feed.class);
        feed.logInLinkedIn("stest7380@gmail.com", "stest312@t");

    }

    @Test()
    public void getTitleOfFeedPage() {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       feed.getTitle();
    }


    @Test
    public void seeNotificationInFeed() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.seeNotification();
    }

    @Test
    public void clickWriteArticle() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.clickArticle();

    }

    @Test
    public void navigateToMyNetworkPage() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.clickMyNetworkPage();

    }

    @Test
    public void clickSearch() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.clickSearchBox();
    }

    @Test
    public void search() {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.searchForPeople("John");
    }

    @Test
    public void navigateToJobsPage() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.findJobs();
    }

    @Test
    public void openDropDown() {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.seeDropdown();
    }

    @Test
    public void chooseSettingsFromDropDown() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feed.chooseSettings();
    }

    @Test
    public void clickWorkDropDown() {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        feed.clickWorkDdown();
    }
}
