import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class TestFeed extends Feed {

    String homeUrl = "https://www.linkedin.com/";
    Feed feed;
    HomePage homePage;
    //homePage.logInLinkedIn("stest7380@gmail.com", "stest312@t");

    @BeforeMethod
    public void init(){
        driver.navigate().to(homeUrl);
        feed = PageFactory.initElements(driver,Feed.class);
    }


}
