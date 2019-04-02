package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BbcWeatherNY extends CommonAPI {
    @FindBy(css = "#ls-c-search__input-label")
    WebElement inputSearch;

    public void setInputSearch() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Weather Map");
        inputSearch.click();
    }
}
