import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFeed extends CommonAPI {

    String homeUrl = "https://www.linkedin.com/"; //feed/";
    Feed feed;
    //HomePage homePage;
    //homePage.logInLinkedIn("stest7380@gmail.com", "stest312@t");

    @BeforeMethod
    public void init(){
        driver.navigate().to(homeUrl);
        feed = PageFactory.initElements(driver,Feed.class);
        feed.logInLinkedIn("stest7380@gmail.com", "stest312@t");

    }

    @Test(priority = 1)
    public void getTitle(){
        Assert.assertEquals(driver.getTitle(),"(1) LinkedIn");
    }


    @Test
    public void seeNotification() throws Exception{
        feed.seeNotifications();
        Thread.sleep(3000);
        String urlExpected = "https://www.linkedin.com/notifications/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }



    @Test
    public void clickWriteArticle(){
        feed.clickArticle();
         String expectedUrl ="https://www.linkedin.com/post/new";
         Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void navigateToMyNetworkPage(){
        feed.clickMyNetworkPage();
        String expectedUrl="";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    @Test
    public void findSomethin() throws Exception{
        //feed.clickMyNetworkPage();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'ember1673\']/div/div[1]/button")).click();
        }


    @Test
    public void clickSearch(){
        feed.clickSearchBox();
    }

    @Test
    public void search(){
        feed.searchForPeople("John");
    }

    @Test
    public void navigateToJobsPage(){
        feed.findJobs();
    }

    @Test
    public void openDropDown(){
        feed.seeDropdown();
    }

    @Test
    public void chooseSettingsFromDropDown() throws Exception{
        Thread.sleep(3000);
        feed.seeDropdown();
        Thread.sleep(5000);
        feed.clickSettingsInDrop();
        String expectedUrl = "https://www.linkedin.com/psettings/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    @Test
    public void clickWorkDropDown(){
       feed.clickWorkDdown();
    }


}
