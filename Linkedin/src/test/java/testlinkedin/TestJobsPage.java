package testlinkedin;

import base.CommonAPI;
import linkedin.JobsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

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
    public void jobsPageTitle(){
        TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"jobs Page Title");
        driver.getTitle();}

    @Test
    public void enterSeleniumTesterInjobs (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter selenium tester jobs");
    jobsPage.searchForJobsBox("Selenium Tester");}

    @Test
    public void enterWhichLocation (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter the location");
    jobsPage.clearLocationBox(); jobsPage.searchWhichLocation("NY");}

    @Test
    public void ableToClickSearchButton (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"able to click search button");
    jobsPage.clickSearchButton();}

    @Test
    public void getAlertText (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"get Alert text");
    jobsPage.globalAlertText();}

    @Test
    public void seeLanguagesDropDown (){TestLogger.log(getClass().getSimpleName() + " -> " +
    convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"see languages drop down");
    jobsPage.seeLanguageOptions();}

    @Test
    public void changeLanguageToFrench() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"change language to french");
    jobsPage.changeLanguageFrench();}

    @Test
    public void getAlertMessageInFrench () throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"get Alert message in french");
        jobsPage.getAlertMessageFrench();
    }

    @Test
    public void navigateToSalaries()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to salaries page");
    jobsPage.navToSalariesPage();}

    @Test
    public void signInSecondaryButton ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"sign in secondary button at bottom");
    jobsPage.signIn();}

    @Test
    public void seeCookiePolicy ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"see cookie policy");
    jobsPage.viewCookiePolicy();}

    @Test
    public void viewOperationsPage ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view operations page");
    jobsPage.operationsLinkPage();}

    @Test
    public void viewHealthcareServices ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view healthcare page");
    jobsPage.healthcareServicesPage();}

    @Test
    public void viewHumanResourcesPage ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view HR page");
    jobsPage.humanResourcesPage();}

    @Test
    public void viewFinancePage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view finance page");
    jobsPage.financePage();}

    @Test
    public void viewCommunityNFinancialPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view community page");
    jobsPage.communityNFinancialPage();}

    @Test
    public void viewEngineeringPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view Engineering page");
    jobsPage.engineeringPage();}

    @Test
    public void viewSalesPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view sales page");
    jobsPage.salesPage();}

    @Test
    public void viewSupportPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view support page");
    jobsPage.supportPage();}

    @Test
    public void viewEducationPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view education page");
    jobsPage.educationPage();}

    @Test
    public void viewAdministrativePage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view administrative page");
    jobsPage.administrativePage();}

    @Test
    public void viewResearchPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view research page");
    jobsPage.researchPage();}

    @Test
    public void viewMarketingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view marketing page");
    jobsPage.marketingPage();}

    @Test
    public void viewInformationTechnologyPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view IT page");
    jobsPage.informationTechnologyPage();}

    @Test
    public void viewMilitaryAndProtectiveServicesPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view military page");
    jobsPage.militaryAndProtectiveServicesPage();}

    @Test
    public void viewEntrepreneurshipPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view entrepreneurship page");
    jobsPage.entrepreneurshipPage();}

    @Test
    public void viewRealEstatePage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view real estate page");
    jobsPage.realEstatePage();}

    @Test
    public void viewPurchasingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view purchasing page");
    jobsPage.purchasingPage();}

    @Test
    public void viewProgramAndProjectManagementPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view peogram and management page");
    jobsPage.programNProjectManagementPage();}

    @Test
    public void viewProductManagementPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view product management page");
    jobsPage.productManagementPage();}

    @Test
    public void viewMediaAndCommunicationPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view media page");
    jobsPage.mediaAndCommunicationPage();}

    @Test
    public void viewLegalPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view legal page");
    jobsPage.legalPage();}

    @Test
    public void viewBusinessDevelopmentPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view business page");
    jobsPage.businessDevelopmentPage();}

    @Test
    public void viewQAPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view QA page");
    jobsPage.QAPage();}

    @Test
    public void viewAccountingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view accounting page");
    jobsPage.accountingPage();}

    @Test
    public void viewConsultingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view consulting page");
    jobsPage.consultingPage();}

    @Test
    public void viewArtsAndDesignPage()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view arts and design page");
    jobsPage.artsAndDesignPage();}

}
