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

    @FindBy()
    WebElement caa;

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
    public void ffd (){}
    public void fff (){}
    public void fffd (){}
    public void ff (){}







}
