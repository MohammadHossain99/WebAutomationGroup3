import base.CommonAPI;
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
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.getTitle();}

    @Test
    public void enterSeleniumTesterInjobs (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.searchForJobsBox("Selenium Tester");}

    @Test
    public void enterWhichLocation (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.clearLocationBox(); jobsPage.searchWhichLocation("NY");}

    @Test
    public void ableToClickSearchButton (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.clickSearchButton();}

    @Test
    public void getAlertText (){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.globalAlertText();}

    @Test
    public void seeLanguagesDropDown (){TestLogger.log(getClass().getSimpleName() + " -> " +
    convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.seeLanguageOptions();}

    @Test
    public void changeLanguageToFrench() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.changeLanguageFrench();}

    @Test
    public void getAlertMessageInFrench () throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        jobsPage.getAlertMessageFrench();
    }

    @Test
    public void navigateToSalaries()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.navToSalariesPage();}

    @Test
    public void signInSecondaryButton ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.signIn();}

    @Test
    public void seeCookiePolicy ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.viewCookiePolicy();}

    @Test
    public void viewOperationsPage ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.operationsLinkPage();}

    @Test
    public void viewHealthcareServices ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.healthcareServicesPage();}

    @Test
    public void viewHumanResourcesPage ()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.humanResourcesPage();}

    @Test
    public void viewFinancePage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.financePage();}

    @Test
    public void viewCommunityNFinancialPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.communityNFinancialPage();}

    @Test
    public void viewEngineeringPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.engineeringPage();}

    @Test
    public void viewSalesPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.salesPage();}

    @Test
    public void viewSupportPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.supportPage();}

    @Test
    public void viewEducationPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.educationPage();}

    @Test
    public void viewAdministrativePage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.administrativePage();}

    @Test
    public void viewResearchPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.researchPage();}

    @Test
    public void viewMarketingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.marketingPage();}

    @Test
    public void viewInformationTechnologyPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.informationTechnologyPage();}

    @Test
    public void viewMilitaryAndProtectiveServicesPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.militaryAndProtectiveServicesPage();}

    @Test
    public void viewEntrepreneurshipPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.entrepreneurshipPage();}

    @Test
    public void viewRealEstatePage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.realEstatePage();}

    @Test
    public void viewPurchasingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.purchasingPage();}

    @Test
    public void viewProgramAndProjectManagementPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.programNProjectManagementPage();}

    @Test
    public void viewProductManagementPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.productManagementPage();}

    @Test
    public void viewMediaAndCommunicationPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.mediaAndCommunicationPage();}

    @Test
    public void viewLegalPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.legalPage();}

    @Test
    public void viewBusinessDevelopmentPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.businessDevelopmentPage();}

    @Test
    public void viewQAPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.QAPage();}

    @Test
    public void viewAccountingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.accountingPage();}

    @Test
    public void viewConsultingPage()throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.consultingPage();}

    @Test
    public void viewArtsAndDesignPage()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " -> " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    jobsPage.artsAndDesignPage();}

}
