package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchApple extends CommonAPI {
    @FindBy(id = "orb-search-q")
    WebElement inputSearch;

    public void setInputSearch(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Search");
        inputSearch.click();
    }
}
