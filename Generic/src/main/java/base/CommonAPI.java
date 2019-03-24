package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class CommonAPI {


    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.bbc.com/") String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehal\\project\\WebAutomationGroup3\\Generic\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

//  public void mouseHoverByXpath(String locator) {
//        try {
//            WebElement element = driver.findElement(By.xpath(locator));
//            Actions action = new Actions(driver);
//            action.moveToElement(element).build().perform();
//            //action.moveToElement( driver.findElement( By.xpath( "//div[@class='hl-cat-nav__sub-cat-col']/ul/li[3]" ) ));
//            //Thread.sleep(1500);
//            //action.click().build().perform();
//        } catch (Exception ex) {
//            System.out.println("First attempt has been done, This is second try");
//            WebElement element = driver.findElement(By.cssSelector(locator));
//            Actions action = new Actions(driver);
//            action.moveToElement(element).perform();
//
//
//        }
//
//    }


    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
