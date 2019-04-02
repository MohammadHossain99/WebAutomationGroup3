package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BbcMessi extends CommonAPI {
    @FindBy(css = "#story-body > p.sp-story-body__introduction")
    WebElement inputSearch;

    public void setInputSearch() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Messi Page");

        inputSearch.click();
    }
}
