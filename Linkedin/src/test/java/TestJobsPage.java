import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJobsPage extends CommonAPI {
    //stest7380@gmail.com
    //stest312@t


    JobsPage jobsPage;
    String jobsPageUrl = "https://www.linkedin.com/jobs/";

    @BeforeMethod
    public void initialize(){
    driver.navigate().to(jobsPageUrl);
    jobsPage = PageFactory.initElements(driver, JobsPage.class);
    }

    @Test
    public void find() throws Exception{
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[class='join-login__button join-login__button--secondary']")).click();

        //jobsPage.clearLocationBox();
        Thread.sleep(3000);
    }

    @Test
    public void enterSeleniumTesterInjobs (){jobsPage.searchForJobsBox("Selenium Tester");}

    @Test
    public void enterWhichLocation (){jobsPage.clearLocationBox(); jobsPage.searchWhichLocation("NY");}

    @Test
    public void ableToClickSearchButton (){jobsPage.clickSearchButton();}

    @Test
    public void getAlertText (){Assert.assertEquals(jobsPage.globalAlert.getText(), jobsPage.globalAlertText());}

    @Test
    public void seeLanguagesDropDown (){jobsPage.seeLanguageOptions();}

    @Test
    public void changeLanguageToFrench() throws Exception{jobsPage.seeLanguageOptions();Thread.sleep(3000); jobsPage.selectFrenchFromLanguage(); Thread.sleep(3000);}

    @Test
    public void getAlertMessageInFrench () throws Exception{
        changeLanguageToFrench();
        Thread.sleep(3000);
        Assert.assertEquals(jobsPage.globalAlert.getText(), jobsPage.frenchAlert());
    }

    @Test
    public void navigateToSalaries(){jobsPage.navToSalariesPage();}

    @Test
    public void signInSecondaryButton (){jobsPage.signIn();}

    @Test
    public void fa21 (){}

    @Test
    public void fa3 (){}

    @Test
    public void f2a (){}

    @Test
    public void f1 (){}












}
