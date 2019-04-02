package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BbcAustralia extends CommonAPI {
    @FindBy(css = "#page > div:nth-child(1) > div.container > div > div.column--primary > div.story-body > h1")
    WebElement inputSearch;

    public void setInputSearch(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC - Australia");

        inputSearch.click();
    }
}
