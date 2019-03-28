package keyworddriven;

import base.CommonAPI;
import reporting.TestLogger;
import ulta.UltaHomePage;

public class ExcelExecutor extends CommonAPI {


    ExcelFileReader reader = new ExcelFileReader();

    UltaHomePage ultaHomePage = new UltaHomePage(driver);

    public void signUp() throws Exception {
        ultaHomePage.signUpForUltaBeauty();
    }

    public void search() throws Exception {
        ultaHomePage.enterInSearchBox("Concealer");
    }

    public void hoverOverNewArrivals() throws Exception {
        ultaHomePage.hoverNewArrivals();
    }

    public void use_of_Test_Loger_search_for(String name) {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + name);
    }


    String path = "C:\\Users\\Sylvana Rahman\\IntelliJ idea projects\\WebAutomationGroup3\\UltaBeauty\\data\\ultaexcelfile.xls";
    public void runOnexcel() throws Exception {
        String[] testSteps = reader.getExcelData(path, 0);
        for (String str : testSteps) {
            switch (str) {
                case "signup":
                    ultaHomePage.signUpForUltaBeauty();
                    break;
                case "search":
                    ultaHomePage.enterInSearchBox("Fragrance");
                    break;
                default:
                    System.out.println("No text found");
                    break;
            }
        }
    }
}

