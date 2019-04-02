package testdbserach;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;
import serachdbpages.SerachInBbc;

public class TestSearch extends CommonAPI {
    String homeUrl = "https://www.bbc.com/";

    SerachInBbc searchInBbc;
    @BeforeClass
    public void initialized(){
        driver.get(homeUrl);
        searchInBbc = PageFactory.initElements(driver,SerachInBbc.class);
    }

    @Test
    public void testFromDBsearch() throws Exception{
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+ "Search");
//        TestLogger.log(getClass().getSimpleName() + " : " +
//                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
                searchInBbc.searchItemsAndSubmitButton();
    }
}
