package testdatadriven;

import base.CommonAPI;
import datadriven.SearchWithDB;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchWithDB extends CommonAPI {

   String homeUrl = "https://www.ulta.com/";
   SearchWithDB searchWithDB;

   @BeforeMethod
   public void init(){
       driver.navigate().to(homeUrl);
       searchWithDB = PageFactory.initElements(driver,SearchWithDB.class);
   }

   @Test
    public void testSearchDB()throws Exception{
       TestLogger.log(getClass().getSimpleName() + " -> " +
           convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"searching items using database mysql");
       searchWithDB.searchItemsOfDB();
   }
}
