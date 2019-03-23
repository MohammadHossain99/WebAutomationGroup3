import base.CommonAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchWithDB extends CommonAPI {


    ConnectToSqlDB database = new ConnectToSqlDB();
    @FindBy(css = "#searchInput")
    WebElement searchInput;


    public void setSearchInput(String items)throws Exception{
        searchInput.sendKeys(items, Keys.ENTER);
        Thread.sleep(5000);

    }

    public void cleaning(){
        searchInput.clear();
    }

    public void searchItemsOfDB()throws Exception{
        List<String> list = database.readDataBase("itemList","products");
        for ( int i =0; i < list.size(); i++){
            setSearchInput(list.get(i));
            cleaning();
        }
    }


}
