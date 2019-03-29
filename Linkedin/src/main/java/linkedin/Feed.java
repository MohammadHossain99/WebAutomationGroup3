package linkedin;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Feed extends CommonAPI {

    @FindBy(id = "login-email")
    WebElement loginEmail;

    @FindBy(id="login-password")
    WebElement loginPassword;

    @FindBy(id="login-submit")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\'notifications-nav-item\']/a")
    WebElement notifications;

    @FindBy(linkText = "Write an article")
    WebElement article;

    @FindBy(xpath = "//*[@id=\'mynetwork-nav-item\']/a")
    WebElement myNetwork;

    @FindBy(xpath = "//*[@id=\'ember31\']/input")
    WebElement searchBox;

    @FindBy(css = "#jobs-nav-item > a")
    WebElement jobs;

    @FindBy(xpath = "//*[@id=\'nav-settings__dropdown-trigger\']/div")
    WebElement meDropdown;

    @FindBy(xpath = "//*[@id=\'nav-settings__dropdown-options\']/li[2]/ul/li[1]")
    WebElement settingsInDrop;

    @FindBy(css = ".nav-item__title-container")
    WebElement workDropDown;

    public void getTitle() {
        Assert.assertEquals(driver.getTitle(), "LinkedIn");
    }

    public void seeNotification() throws Exception {
        notifications.click();
        Thread.sleep(3000);
        String urlExpected = "https://www.linkedin.com/notifications/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    public void clickWorkDdown(){
        workDropDown.click();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
    public void chooseSettings() throws Exception{
        Thread.sleep(3000);
        this.seeDropdown();
        Thread.sleep(5000);
        this.clickSettingsInDrop();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void seeDropdown(){
        meDropdown.click();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void clickSettingsInDrop(){
        settingsInDrop.click();
    }


    public void logInLinkedIn(String email, String password){
    loginEmail.sendKeys(email);
    loginPassword.sendKeys(password);
    loginButton.click();
    }


    public void clickArticle() throws Exception{
        article.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        driver.quit();
    }

    public void clickMyNetworkPage() throws Exception{
        Thread.sleep(3000);
        myNetwork.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/mynetwork/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void clickSearchBox() throws Exception{
        searchBox.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void searchForPeople(String search){
        searchBox.sendKeys(search, Keys.ENTER);
    }

    public void findJobs() throws Exception{
        jobs.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}


