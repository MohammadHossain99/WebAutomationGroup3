package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BbcLibrary extends CommonAPI {
    @FindBy(css = "#story-content > div.primary-content > div.primary-content-lining > div.top-unit > div.primary-header-wrapper > div > h1")

    WebElement inputSearch;

    public void setInputSearch(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Library");

        inputSearch.click();
    }
}
