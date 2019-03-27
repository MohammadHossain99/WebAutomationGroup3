package keyworddriven;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import ulta.UltaHomePage;
import ulta.UltaMakeUpPage;

import java.io.IOException;

public class Features extends CommonAPI {
    UltaHomePage ultaHomePage = new UltaHomePage();//// = PageFactory.initElements(driver,UltaHomePage.class);
    UltaMakeUpPage ultaMakeUpPage = new UltaMakeUpPage();

//    LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
//    SearchPage searchPage = new SearchPage();
//    HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
    public void signUp() throws Exception{
        ultaHomePage.signUpForUltaBeauty();
    }
//    public void signIn(WebDriver driver1)throws InterruptedException{
//        logInPage.logInToPntForumWithoutPopup(driver1);
//    }
//    public void registration(){
//        typeByCss("testuser1", "email");
//        typeByCss("abcd1234", "password");
//    }

    public void search() throws Exception{
        ultaHomePage.enterInSearchBox("MAC");
    }

    public void hoverOverNewArrivals()throws Exception{
        ultaHomePage.hoverNewArrivals();
    }

    public void select(String featureName, WebDriver driver)throws IOException, InterruptedException{
        switch(featureName){
            case "signUp":
                try{signUp();}catch (Exception e){e.printStackTrace();}
                break;
            case "search":
                try{search();}catch (Exception e){e.printStackTrace();}
                break;
            case "hover New Arrivals":
                try{hoverOverNewArrivals();}catch (Exception e){e.printStackTrace();}
                break;
            //case "popup":
               // handlePopUp.handlePopUpWindowBeforeLogIn(driver1);
               // break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}

