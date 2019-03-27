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
    public void jobsPageTitle(){driver.getTitle();}

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
    public void navigateToSalaries()throws Exception{jobsPage.navToSalariesPage();}

    @Test
    public void signInSecondaryButton ()throws Exception{jobsPage.signIn();}

    @Test
    public void seeCookiePolicy ()throws Exception{jobsPage.viewCookiePolicy();}

    @Test
    public void viewOperationsPage ()throws Exception{jobsPage.operationsLinkPage();}

    @Test
    public void viewHealthcareServices ()throws Exception{jobsPage.healthcareServicesPage();}

    @Test
    public void viewHumanResourcesPage ()throws Exception{jobsPage.humanResourcesPage();}

    @Test
    public void viewFinancePage()throws Exception{jobsPage.financePage();}

    @Test
    public void viewCommunityNFinancialPage()throws Exception{jobsPage.communityNFinancialPage();}

    @Test
    public void viewEngineeringPage()throws Exception{jobsPage.engineeringPage();}

    @Test
    public void viewSalesPage()throws Exception{jobsPage.salesPage();}

    @Test
    public void viewSupportPage()throws Exception{jobsPage.supportPage();}

    @Test
    public void viewEducationPage()throws Exception{jobsPage.educationPage();}

    @Test
    public void viewAdministrativePage()throws Exception{jobsPage.administrativePage();}

    @Test
    public void viewResearchPage()throws Exception{jobsPage.researchPage();}

    @Test
    public void viewMarketingPage()throws Exception{jobsPage.marketingPage();}

    @Test
    public void viewInformationTechnologyPage()throws Exception{jobsPage.informationTechnologyPage();}

    @Test
    public void viewMilitaryAndProtectiveServicesPage()throws Exception{jobsPage.militaryAndProtectiveServicesPage();}

    @Test
    public void viewEntrepreneurshipPage()throws Exception{jobsPage.entrepreneurshipPage();}

    @Test
    public void viewRealEstatePage()throws Exception{jobsPage.realEstatePage();}

    @Test
    public void viewPurchasingPage()throws Exception{jobsPage.purchasingPage();}

    @Test
    public void viewProgramAndProjectManagementPage()throws Exception{jobsPage.programNProjectManagementPage();}

    @Test
    public void viewProductManagementPage()throws Exception{jobsPage.productManagementPage();}

    @Test
    public void viewMediaAndCommunicationPage()throws Exception{jobsPage.mediaAndCommunicationPage();}

    @Test
    public void viewLegalPage()throws Exception{jobsPage.legalPage();}

    @Test
    public void viewBusinessDevelopmentPage()throws Exception{jobsPage.businessDevelopmentPage();}

    @Test
    public void viewQAPage()throws Exception{jobsPage.QAPage();}

    @Test
    public void viewAccountingPage()throws Exception{jobsPage.accountingPage();}

    @Test
    public void viewConsultingPage()throws Exception{jobsPage.consultingPage();}

    @Test
    public void viewArtsAndDesignPage()throws Exception{jobsPage.artsAndDesignPage();}

}
