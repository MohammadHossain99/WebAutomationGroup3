package excelbbc;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class ExcelLoad extends CommonAPI {
    ExcelFileReader reader = new ExcelFileReader();

    @FindBy(id = "idcta-username")
    WebElement loginEmail;

    @FindBy(xpath = "//*[@id=\'password-input\']")
    WebElement loginPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginTab;

    @FindBy(xpath = "//input[@name='q']")
    WebElement inputSearch;

    public void setLoginTab() {
        loginTab.click();
    }

    public void setLoginEmail(String str) {
        loginEmail.sendKeys(str);
    }

    public void setLoginPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void setInputSearch(String friends) {
        inputSearch.sendKeys(friends, Keys.ENTER);
    }

    public void crearInputsearch() throws Exception {
        Thread.sleep(1000);
        inputSearch.clear();
    }

    public void getFriendList() throws Exception {

        List<String> friendList = new ArrayList<String>();
        friendList.add("Ahmed");
        friendList.add("Hossain");
        friendList.add("Islam");


        for (int i = 0; i < friendList.size(); i++) {
            String str = friendList.get(i);
            setInputSearch(str);
            use_of_Test_Loger_search_for(str);
            crearInputsearch();
        }
    }
    public void use_of_Test_Loger_search_for(String name){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+name);
    }

    String path = "C:\\Users\\nehal\\project\\WebAutomationGroup3\\bbc\\src\\main\\login.xls";

    public void runOnexcle() throws Exception {
        String[] testSteps = reader.getExcelData(path, 0);
        for (String str : testSteps) {
            switch (str){
                case "open browser":
                    signIn();
                    break;
                case "search":
                    searchinput();
                    break;
                default:
                    System.out.println("No text found");
                    break;
            }
        }
    }

    public void signIn() {
        setLoginEmail(" ");
        setLoginPassword("seci1994");
        setLoginTab();
    }

    public void searchinput() throws Exception {
        getFriendList();
    }
}
