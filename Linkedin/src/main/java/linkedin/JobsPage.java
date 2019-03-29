package linkedin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JobsPage extends CommonAPI {

    @FindBy(css = "#keyword-box-input")
    WebElement jobsBar;

    @FindBy(css = "#location-box-input")
    WebElement locationBar;

    @FindBy(css = "button[class ='job-search__button lazy-loaded']")
    WebElement searchButton;

    @FindBy(css = "div[class='global-alert global-alert--yield']")
    WebElement globalAlert;

    @FindBy(xpath = "/html/body/footer/ul/li[10]/div/div/label[1]/span")
    WebElement language;

    @FindBy(xpath = "//button[@data-locale='fr_FR']")
    WebElement frenchLanguage;

    @FindBy(linkText = "Salaries")
    WebElement salariesTab;

    @FindBy(css = "a[class='join-login__button join-login__button--secondary']")
    WebElement signInSecondaryButton;

    @FindBy(css = "a[class='global-alert__link t-white t-bold']")
    WebElement cookiePolicy;

    @FindBy(linkText = "Operations")
    WebElement operations;

    @FindBy(linkText = "Healthcare Services")
    WebElement healthcareServices;

    @FindBy(linkText = "Human Resources")
    WebElement humanResources;

    @FindBy(linkText = "Finance")
    WebElement finance;

    @FindBy(linkText = "Community and Social Services")
    WebElement communityNFinancial;

    @FindBy(linkText = "Engineering")
    WebElement engineering;

    @FindBy(linkText = "Sales")
    WebElement sales;

    @FindBy(linkText = "Support")
    WebElement support;

    @FindBy(linkText = "Education")
    WebElement education;

    @FindBy(linkText = "Administrative")
    WebElement administrative;

    @FindBy(linkText = "Research")
    WebElement research;

    @FindBy(linkText = "Marketing")
    WebElement marketing;

    @FindBy(linkText = "Information Technology")
    WebElement informationTechnology;

    @FindBy(linkText = "Military and Protective Services")
    WebElement militaryNProtectiveServices;

    @FindBy(linkText = "Entrepreneurship")
    WebElement entrepreneurship;

    @FindBy(linkText = "Real Estate")
    WebElement realEstate;

    @FindBy(linkText = "Purchasing")
    WebElement purchasing;

    @FindBy(linkText = "Program and Project Management")
    WebElement programNProjectManagement;

    @FindBy(linkText = "Product Management")
    WebElement productManagement;

    @FindBy(linkText = "Media and Communication")
    WebElement mediaNCommunication;

    @FindBy(linkText = "Legal")
    WebElement legal;

    @FindBy(linkText = "Business Development")
    WebElement businessDevelopment;

    @FindBy(linkText = "Quality Assurance")
    WebElement QA;

    @FindBy(linkText = "Accounting")
    WebElement accounting;

    @FindBy(linkText = "Consulting")
    WebElement consulting;

    @FindBy(linkText = "Arts and Design")
    WebElement artsNDesign;


    public void searchForJobsBox (String job){jobsBar.sendKeys(job);}

    public void searchWhichLocation (String location){locationBar.sendKeys(location);}

    public void clearLocationBox(){locationBar.clear();}

    public void clickSearchButton (){searchButton.click();}


    public String globalAlertText(){
        boolean alertMsg = globalAlert.isDisplayed();
        System.out.println(globalAlert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "This website uses cookies to improve service and provide tailored ads. By using this site, you agree to this use. See our Cookie Policy.";

       return expectedAlert ;
    }

    public void seeLanguageOptions (){language.click();String expectedUrl="https://www.linkedin.com/jobs?trk=uno-reg-guest-home-jobs";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void selectFrenchFromLanguage (){frenchLanguage.click();String expectedUrl="https://www.linkedin.com/jobs?trk=uno-reg-guest-home-jobs";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public String frenchAlert(){
        boolean alertMsg = globalAlert.isDisplayed();
        System.out.println(globalAlert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "Ce site web utilise des cookies pour un meilleur service et vous montrer des publicités personnalisées. En utilisant ce site, vous acceptez leur utilisation. Voir notre politique relative aux cookies.";

        return expectedAlert ;
    }

    public void changeLanguageFrench() throws Exception{
        seeLanguageOptions();
        Thread.sleep(3000);
        selectFrenchFromLanguage();
        Thread.sleep(3000);
    }

    public void getAlertMessageFrench () throws Exception{
        changeLanguageFrench();
        Thread.sleep(3000);
        Assert.assertEquals(globalAlert.getText(),frenchAlert());
    }



    public void navToSalariesPage ()throws Exception{salariesTab.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/salary/?trk=guest_job_home_subnav-salaries";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void signIn ()throws Exception{signInSecondaryButton.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/uas/login?emailAddress=&fromSignIn=&trk=guest_job_home_sign_in";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void viewCookiePolicy ()throws Exception{cookiePolicy.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/legal/cookie-policy?trk=guest_job_home_cookie_policy_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void operationsLinkPage()throws Exception{operations.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/operations?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void healthcareServicesPage ()throws Exception{healthcareServices.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/healthcare-services?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void humanResourcesPage ()throws Exception{humanResources.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/human-resources?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void financePage()throws Exception{finance.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/finance?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void communityNFinancialPage()throws Exception{communityNFinancial.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/community-and-social-services?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void engineeringPage()throws Exception{engineering.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/engineering?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void salesPage()throws Exception{sales.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/sales?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void supportPage()throws Exception{support.click();Thread.sleep(3000);String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void educationPage()throws Exception{education.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/education?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void administrativePage()throws Exception{administrative.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/administrative?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void researchPage()throws Exception{research.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/research?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void marketingPage()throws Exception{marketing.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/marketing?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void informationTechnologyPage()throws Exception{informationTechnology.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/information-technology?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void militaryAndProtectiveServicesPage()throws Exception{militaryNProtectiveServices.click();Thread.sleep(3000);String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void entrepreneurshipPage()throws Exception{entrepreneurship.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/entrepreneurship?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void realEstatePage()throws Exception{realEstate.click();Thread.sleep(5000);String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void purchasingPage()throws Exception{purchasing.click();Thread.sleep(3000);String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void programNProjectManagementPage()throws Exception{programNProjectManagement.click();Thread.sleep(3000);String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void productManagementPage()throws Exception{productManagement.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/product-management?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void mediaAndCommunicationPage()throws Exception{mediaNCommunication.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/media-and-communication?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void legalPage()throws Exception{legal.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/legal?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void businessDevelopmentPage()throws Exception{businessDevelopment.click();Thread.sleep(5000);String expectedUrl="https://www.linkedin.com/jobs/browse/business-development?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void QAPage()throws Exception{QA.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/quality-assurance?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void accountingPage()throws Exception{accounting.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/accounting?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void consultingPage()throws Exception{consulting.click();Thread.sleep(3000);String expectedUrl="https://www.linkedin.com/jobs/browse/consulting?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

    public void artsAndDesignPage()throws Exception{artsNDesign.click();Thread.sleep(10000);String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);}

}
