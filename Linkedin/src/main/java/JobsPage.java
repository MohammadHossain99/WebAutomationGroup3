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

    @FindBy()
    WebElement csd;

    @FindBy()
    WebElement vc;

    @FindBy()
    WebElement c1;

    @FindBy()
    WebElement cb;





    //    @FindBy()
//    WebElement c;
//
//    @FindBy()
//    WebElement cd;
//
//    @FindBy()
//    WebElement dc;
//
//    @FindBy()
//    WebElement cdd;
//
//    @FindBy()
//    WebElement cddd;
//
//    @FindBy()
//    WebElement ssc;
//
//    @FindBy()
//    WebElement ca;
//
//    @FindBy()
//    WebElement cs;
//
//    @FindBy()
//    WebElement caa;
//
//    @FindBy()
//    WebElement csd;
//
//    @FindBy()
//    WebElement vc;
//
//    @FindBy()
//    WebElement c1;
//
//    @FindBy()
//    WebElement cb;

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

    public void seeLanguageOptions (){language.click();}

    public void selectFrenchFromLanguage (){frenchLanguage.click();}

    public String frenchAlert(){
        boolean alertMsg = globalAlert.isDisplayed();
        System.out.println(globalAlert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "Ce site web utilise des cookies pour un meilleur service et vous montrer des publicités personnalisées. En utilisant ce site, vous acceptez leur utilisation. Voir notre politique relative aux cookies.";

        return expectedAlert ;
    }

    public void navToSalariesPage (){salariesTab.click();}

    public void signIn (){signInSecondaryButton.click();}

    public void viewCookiePolicy (){cookiePolicy.click();}

    public void operationsLinkPage(){operations.click();}

    public void healthcareServicesPage (){healthcareServices.click();}

    public void humanResourcesPage (){humanResources.click();}

    public void financePage(){finance.click();}

    public void communityNFinancialPage(){communityNFinancial.click();}

    public void engineeringPage(){engineering.click();}

    public void salesPage(){sales.click();}

    public void supportPage(){support.click();}

    public void educationPage(){education.click();}

    public void administrativePage(){administrative.click();}

    public void researchPage(){research.click();}

    public void marketingPage(){marketing.click();}

    public void informationTechnologyPage(){informationTechnology.click();}

    public void militaryAndProtectiveServicesPage(){militaryNProtectiveServices.click();}

    public void entrepreneurshipPage(){entrepreneurship.click();}

    public void realEstatePage(){realEstate.click();}

    public void purchasingPage(){purchasing.click();}

    public void programNProjectManagementPage(){programNProjectManagement.click();}

    public void productManagementPage(){productManagement.click();}

    public void mediaAndCommunicationPage(){mediaNCommunication.click();}

    public void legalPage(){legal.click();}

    public void businessDevelopmentPage(){businessDevelopment.click();}

    public void QAPage(){QA.click();}

    public void accountingPage(){accounting.click();}

    public void consultingPage(){consulting.click();}

    public void artsAndDesignPage(){artsNDesign.click();}

    public void waq(){}

    public void da(){}

    public void dbb(){}

    public void ae(){}

    public void aq(){}

    public void a(){}

    public void fa(){}

    public void rbb(){}

    public void al(){}

    public void wl(){}

    public void wq(){}






    //    public void abb(){}
//
//    public void qe(){}
//
//    public void waq(){}
//
//    public void da(){}
//
//    public void dbb(){}
//
//    public void ae(){}
//
//    public void aq(){}
//
//    public void a(){}
//
//    public void fa(){}
//
//    public void rbb(){}
//
//    public void al(){}
//
//    public void wl(){}
//
//    public void wq(){}





}
