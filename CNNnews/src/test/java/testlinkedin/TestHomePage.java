package testlinkedin;

import linkedin.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends HomePage {

    HomePage homePage;
    String homePageUrl = "https://www.linkedin.com/";

    @BeforeMethod
    public void initialize(){
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }

    @Test
    public void getTitleOfLinkedInHomePage(){
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"get title of LinkedIn homepage");
     getTitleOfHomePage();
    }

    @Test
    public void enterFirstName(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter first name");
        homePage.inputFirstName("Selenium");
    }

    @Test
    public void enterLastName(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter last name");
        homePage.inputLastName("Test");
    }

    @Test
    public void enterEmail(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter email");
        homePage.inputEmail("stest7380@gmail.com");
    }

    @Test
    public void enterPassword(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter password");
        homePage.inputPassword("stest312@t");
    }

    @Test
    public void registerButton(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"click registration button");
        homePage.submitRegistration();
    }

    @Test(priority = 6)
    public void registerForLinkedIn() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"register for linkedin");
        homePage.registerLinkedIn();
    }

    @Test
    public void registerWithNoLastName() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"register with no last name");
        homePage.registerNoLastName();
    }

    @Test
    public void registerWithNoEmail() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"register with no email");
        homePage.registerNoEmail();
    }
    @Test
    public void registerWithNoPassword() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"register with no password");
        homePage.registerNoPassword();
    }

    @Test
    public void registerWithNoCredentials() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"register with no credential at all");
        homePage.registerNoCredentials();
    }

    @Test
    public void emailLogin(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter email in login section");
        homePage.enterEmailLogin("stest7380@gmail.com");
    }

    @Test
    public void passwordLogin(){TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"enter password in login section");
        homePage.enterPasswordLogin("stest312@t");
    }

    @Test
    public void signIn() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"sign in with valid credentials");
       homePage.logInLinkedIn("stest7380@gmail.com","stest312@t");
    }

    @Test
    public void usingInvalidLogInCredentials() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"sign in with invalid credentials");
        homePage.invalidLogInCredentials();
    }

    @Test
    public void navigateToForgotPasswordPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to forgot password page");
        homePage.setForgotPassword();
    }

    @Test
    public void viewSignUpPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"view sign up page");
    homePage.signUpPage();}

    @Test
    public void viewHelpCenterPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to help center page");
    homePage.helpCenterPage();}

    @Test
    public void viewAboutPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to about page");
    homePage.aboutPage();}

    @Test
    public void viewPressPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to press page");
    homePage.pressPage();}

    @Test
    public void viewBlogPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to blog page");
    homePage.blogPage();}

    @Test
    public void viewCareersPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to careers page");
    homePage.careersPage();}

    @Test
    public void viewDevelopersPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to developers page");
    homePage.developersPage();}

    @Test
    public void viewTalentPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to talent page");
    homePage.talentPage();}

    @Test
    public void viewMarketingPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to marketing page");
    homePage.marketingPage();}

    @Test
    public void viewSalesPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to sales page");
    homePage.salesPage();}

    @Test
    public void viewLearningPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to learning page");
    homePage.learningPage();}

    @Test
    public void viewCompanyPages() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to company page");
    homePage.companyPagesLink();}

    @Test
    public void viewBrowsByRegionPage() throws Exception{TestLogger.log(getClass().getSimpleName() + " -> " +
            convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"navigate to browse by region page");
    homePage.browsByRegionPage();}

}
