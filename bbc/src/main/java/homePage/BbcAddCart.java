package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BbcAddCart extends CommonAPI {
    @FindBy(css = "#orb-nav-links > ul > li.orb-nav-shop > a")

    WebElement inputSearch;

    public void setInputSearch(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Cart");
        inputSearch.click();
    }
}
