package testdatadriven;

import base.CommonAPI;
import datadriven.SearchWithDB;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchWithDB extends CommonAPI {

   String homeUrl = "https://www.ulta.com/";
   SearchWithDB searchWithDB;

   @BeforeClass
   public void init(){
       driver.navigate().to(homeUrl);
       searchWithDB = PageFactory.initElements(driver,SearchWithDB.class);
   }

    @AfterMethod
    public void reStart(){
       driver.get(homeUrl);
    }

   @Test
    public void testSearchDB()throws Exception{
       TestLogger.log(getClass().getSimpleName() + " -> " +
           convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"searching items using database mysql");
       searchWithDB.searchItemsOfDB();
   }
}
