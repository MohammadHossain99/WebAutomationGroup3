import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UltaSignUpPage extends CommonAPI {

    @FindBy(id ="first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "zipcode")
    WebElement zipCode;

    @FindBy(id = "mobile_number_1")
    WebElement cellNumBox1;

    @FindBy(id = "mobile_number_2")
    WebElement cellNumBox2;

    @FindBy(id = "mobile_number_3")
    WebElement cellNumBox3;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(linkText = "Mobile Terms & Conditions")
    WebElement termsAndConditions;

    @FindBy(linkText = "Privacy Policy")
    WebElement privacyPolicy;

    public void enterFirstName(String enterFirstName){
        firstName.sendKeys(enterFirstName);
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void enterLastName(String enterLastName){
        lastName.sendKeys(enterLastName);
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void enterEmail(String enterEmail){
        email.sendKeys(enterEmail);
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void enterZipCode(String enterZipCode){
        zipCode.sendKeys(enterZipCode);
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void enterCellBox1(String first3Numbers){
        cellNumBox1.sendKeys(first3Numbers);
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void enterCellBox2(String second3Numbers){
        cellNumBox1.sendKeys(second3Numbers);
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void enterCellBox3(String last4Numbers){
        cellNumBox1.sendKeys(last4Numbers);
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void clickSubmit(){
        submitButton.click();
        String expectedUrl="https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void seeTermsAndConditions(){
        termsAndConditions.click();
        String urlExpected = "https://www.ulta.com/ulta/common/sms-help.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void seePrivacyPolicy(){
        privacyPolicy.click();
        String urlExpected = "https://www.ulta.com/ulta/common/privacyPolicy.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
        driver.navigate().back();
    }

}
