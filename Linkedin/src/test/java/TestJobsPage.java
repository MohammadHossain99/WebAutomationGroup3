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
    public void navigateToSalaries(){jobsPage.navToSalariesPage();}

    @Test
    public void signInSecondaryButton (){jobsPage.signIn();}

    @Test
    public void seeCookiePolicy (){jobsPage.viewCookiePolicy();}

    @Test
    public void viewOperationsPage (){jobsPage.operationsLinkPage();}

    @Test
    public void viewHealthcareServices (){jobsPage.healthcareServicesPage();}

    @Test
    public void viewHumanResourcesPage (){jobsPage.humanResourcesPage();}

    @Test
    public void viewFinancePage(){jobsPage.financePage();}

    @Test
    public void viewCommunityNFinancialPage(){jobsPage.communityNFinancialPage();}

    @Test
    public void viewEngineeringPage(){jobsPage.engineeringPage();}

    @Test
    public void viewSalesPage(){jobsPage.salesPage();}

    @Test
    public void viewSupportPage(){jobsPage.supportPage();}

    @Test
    public void viewEducationPage(){jobsPage.educationPage();}

    @Test
    public void viewAdministrativePage(){jobsPage.administrativePage();}

    @Test
    public void viewResearchPage(){jobsPage.researchPage();}

    @Test
    public void viewMarketingPage(){jobsPage.marketingPage();}

    @Test
    public void viewInformationTechnologyPage(){jobsPage.informationTechnologyPage();}

    @Test
    public void viewMilitaryAndProtectiveServicesPage(){jobsPage.militaryAndProtectiveServicesPage();}

    @Test
    public void viewEntrepreneurshipPage(){jobsPage.entrepreneurshipPage();}

    @Test
    public void viewRealEstatePage(){jobsPage.realEstatePage();}

    @Test
    public void viewPurchasingPage(){jobsPage.purchasingPage();}

    @Test
    public void viewProgramAndProjectManagementPage(){jobsPage.programNProjectManagementPage();}

    @Test
    public void viewProductManagementPage(){jobsPage.productManagementPage();}

    @Test
    public void viewMediaAndCommunicationPage(){jobsPage.mediaAndCommunicationPage();}

    @Test
    public void viewLegalPage(){jobsPage.legalPage();}

    @Test
    public void viewBusinessDevelopmentPage(){jobsPage.businessDevelopmentPage();}

    @Test
    public void viewQAPage(){jobsPage.QAPage();}

    @Test
    public void viewAccountingPage(){jobsPage.accountingPage();}

    @Test
    public void viewConsultingPage(){jobsPage.consultingPage();}

    @Test
    public void viewArtsAndDesignPage(){jobsPage.artsAndDesignPage();}

//    @Test
//    public void fea(){}



    //
//    @Test
//    public void ab(){}
//
//    @Test
//    public void az(){}
//
//    @Test
//    public void aa(){}
//
//    @Test
//    public void ada(){}
//
//    @Test
//    public void ad(){}
//
//    @Test
//    public void add(){}
//
//    @Test
//    public void ac(){}
//
//    @Test
//    public void av(){}
//
//    @Test
//    public void abb(){}
//
//    @Test
//    public void ae(){}
//
//    @Test
//    public void aq(){}
//
//    @Test
//    public void a(){}










}
