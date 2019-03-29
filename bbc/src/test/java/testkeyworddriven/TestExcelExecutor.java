package testkeyworddriven;

import base.CommonAPI;
import keyworddriven.ExcelExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExcelExecutor extends CommonAPI {


        ExcelExecutor executor;

        @BeforeClass
        public void initialize(){

            driver.get("https://www.ulta.com/");

            executor = PageFactory.initElements(driver,ExcelExecutor.class);
        }

        @Test
        public void testUltaBeautyExcel() throws Exception {

            executor.runOnexcel();
        }
    }

