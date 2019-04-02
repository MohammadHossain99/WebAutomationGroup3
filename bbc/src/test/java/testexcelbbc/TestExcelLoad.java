package testexcelbbc;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import excelbbc.ExcelLoad;

public class TestExcelLoad extends CommonAPI {
    ExcelLoad load;

    @BeforeClass
    public void initialize(){
        driver.get("https://www.bbc.com/");
        load = PageFactory.initElements(driver,ExcelLoad.class);
    }

    @Test
    public void testFBinExcle() throws Exception {
        load.runOnexcle();
    }
}
