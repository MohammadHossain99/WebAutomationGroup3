package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BbcSports extends CommonAPI {
    @FindBy(xpath = "//*[@id=\'orb-nav-links\']/ul/li[3]/a")
    WebElement inputSearch;

    public void setInputSearch() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Sports");

        inputSearch.click();
    }
}