package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LoginAuthentication extends CommonAPI {
    @FindBy(css = "#user-identifier-input")
               WebElement inputSearch;

    public void setInputSearch(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To BBC Login");

        inputSearch.click();
    }
}
