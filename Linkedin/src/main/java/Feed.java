import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Feed extends CommonAPI {

    @FindBy(id = "login-email")
    WebElement loginEmail;

    @FindBy(id="login-password")
    WebElement loginPassword;

    @FindBy(id="login-submit")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id='ember868']/div[2]/button")
    WebElement seeNewPosts;

    @FindBy(xpath = "//*[@id=\'notifications-nav-item\']/a")
    WebElement notifications;

    @FindBy(xpath = "//*[@id=\'ember1673\']/div/div[1]/button")
    WebElement startAPost;

    @FindBy(xpath = "//*[@id=\'ember915\']/div[2]/div/div[1]/div[3]/div")
    WebElement postBox;

    @FindBy(xpath = "//*[@id=\'ember932\']")
    WebElement addAPhoto;

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

    public void clickWorkDdown(){
        workDropDown.click();
    }
    public void chooseSettings() throws Exception{
        seeDropdown();
        Thread.sleep(3000);
        settingsInDrop.click();
    }

    public void seeDropdown(){
        meDropdown.click();
    }

    public void clickSettingsInDrop(){
        settingsInDrop.click();
    }

    public void logInLinkedIn(String email, String password){
    loginEmail.sendKeys(email);
    loginPassword.sendKeys(password);
    loginButton.click();
    }

    public void clickSeeNewPosts(){
        seeNewPosts.click();
    }

    public void seeNotifications() {
        notifications.click();
    }

    public void clickStartAPost(){
        startAPost.click();
    }

    public void writeAPost(String post){
//       clickStartAPost();
      postBox.sendKeys(post);
    }

    public void clickAddPhoto(){
        addAPhoto.click();
    }

    public void clickArticle(){
        article.click();
    }

    public void clickMyNetworkPage(){
        myNetwork.click();
    }

    public void clickSearchBox(){
        searchBox.click();
    }

//    public void enterInSearchBox(String search){
//        searchBox.sendKeys(search);
//    }

    public void searchForPeople(String search){
        searchBox.sendKeys(search, Keys.ENTER);
    }

    public void findJobs(){
        jobs.click();
    }
}


