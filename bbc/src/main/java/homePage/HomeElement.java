package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomeElement extends CommonAPI {

    @FindBy(css = "#orb-nav-links > ul > li.orb-nav-sport > a")

    WebElement inputSearch;

    public void setInputSearch(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC");

        inputSearch.click();
    }

}
