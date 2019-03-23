import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Feed extends HomePage {

//    @FindBy(xpath = "//*[@id=\'ember31\']/input")
//    WebElement searchBox;

    ConnectToSqlDB database = new ConnectToSqlDB();
    @FindBy(xpath = "//*[@id=\'ember31\']/input")
    WebElement searchBox;


    public void setSearchInput(String items)throws Exception{
        searchBox.sendKeys(items, Keys.ENTER);
        Thread.sleep(5000);

    }

    public void cleaning(){
        searchBox.clear();
    }

    public void searchItemsOfDB()throws Exception{
        List<String> list = database.readDataBase("people","name");
        for ( int i =0; i < list.size(); i++){
            setSearchInput(list.get(i));
            cleaning();
        }
    }


}
