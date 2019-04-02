package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    @FindBy(css = "#orb-header > div.orb-nav-pri-container.b-r.b-g-p > div.orb-nav-section.orb-nav-blocks > a")
    WebElement inputSearch;

    public void setInputSearch(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Home Page");

        inputSearch.click();
    }

}
