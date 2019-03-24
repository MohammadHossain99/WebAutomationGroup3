package testExcleFaceBook;

import base.CommonAPI;
import excleFaceBook.ExcleExecutor;
import excleFaceBook.ExcleFilereader;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExcleExecutor extends CommonAPI {
    ExcleFilereader reader = new ExcleFilereader();
    ExcleExecutor executor;
    String path = "/Users/jewal/IntelliJ/WebAutomationGroup3/FaceBook/src/main/java/login.xls";

    @BeforeClass
    public void initialize(){
        driver.get("https://www.facebook.com/");
        executor = PageFactory.initElements(driver,ExcleExecutor.class);
    }
    public void signIn(){
        executor.setLoginEmail("taherjuwel3262@gmail.com");
        executor.setLoginPassword("Juwel1234");
        executor.setLoginTab();
    }
    public void searchinput(){
        executor.getFriendList();
    }
    @Test
    public void testFBinExcle() {
        String[] testSteps = reader.getExcelData(path,0);
        for (String str : testSteps){

            if (str.equalsIgnoreCase("open browser")) {
                signIn();
            } else if (str.equalsIgnoreCase("search")) {
                searchinput();
            } else {
                throw new InvalidArgumentException("Invalid choice");
            }
        }
    }
}
