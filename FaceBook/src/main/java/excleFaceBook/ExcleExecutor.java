package excleFaceBook;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ExcleExecutor extends CommonAPI {

    ExcleFilereader reader = new ExcleFilereader();

    @FindBy(id = "email")
    WebElement loginEmail;

    @FindBy(css = "#pass")
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
        friendList.add("Sylavan");
        friendList.add("Jewal Ahmed");
        friendList.add("Mannam Bhai");
        friendList.add("Sadat Bhai");
        friendList.add("Shah Param");
        friendList.add("Nabil ppnt");

        for (int i = 0; i < friendList.size(); i++) {
            String str = friendList.get(i);
            setInputSearch(str);
            crearInputsearch();
        }
    }

    String path = "/Users/jewal/IntelliJ/WebAutomationGroup3/FaceBook/src/main/java/login.xls";

    public void runOnexcle() throws Exception {
        String[] testSteps = reader.getExcelData(path, 0);
        for (String str : testSteps) {

            if (str.equalsIgnoreCase("open browser")) {
                signIn();
            } else if (str.equalsIgnoreCase("search")) {
                searchinput();
            } else {
                throw new InvalidArgumentException("Invalid choice");
            }
        }
    }

    public void signIn() {
        setLoginEmail("taherjuwel3262@gmail.com");
        setLoginPassword("Juwel1234");
        setLoginTab();
    }

    public void searchinput() throws Exception {
        getFriendList();
    }

}
