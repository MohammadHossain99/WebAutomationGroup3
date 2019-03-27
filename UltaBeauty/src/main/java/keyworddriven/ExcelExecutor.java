package keyworddriven;

import base.CommonAPI;
import reporting.TestLogger;
import ulta.UltaHomePage;

public class ExcelExecutor extends CommonAPI{



        ExcelFileReader reader = new ExcelFileReader();

        UltaHomePage ultaHomePage = new UltaHomePage();

        public void signUp() throws Exception{
            ultaHomePage.signUpForUltaBeauty();
        }

        public void search() throws Exception{
            ultaHomePage.enterInSearchBox("Concealer");
        }

        public void hoverOverNewArrivals() throws Exception{
            ultaHomePage.hoverNewArrivals();
        }



//        @FindBy(id = "email")
//
//        WebElement loginEmail;
//
//
//
//        @FindBy(css = "#pass")
//
//        WebElement loginPassword;
//
//
//
//        @FindBy(xpath = "//input[@value='Log In']")
//
//        WebElement loginTab;
//
//
//
//        @FindBy(xpath = "//input[@name='q']")
//
//        WebElement inputSearch;
//
//
//
//        public void setLoginTab() {
//
//            loginTab.click();
//
//        }
//
//
//
//        public void setLoginEmail(String str) {
//
//            loginEmail.sendKeys(str);
//
//        }
//
//
//
//        public void setLoginPassword(String password) {
//
//            loginPassword.sendKeys(password);
//
//        }
//
//
//
//        public void setInputSearch(String friends) {
//
//            inputSearch.sendKeys(friends, Keys.ENTER);
//
//        }
//
//
//
//        public void crearInputsearch() throws Exception {
//
//            Thread.sleep(1000);
//
//            inputSearch.clear();
//
//        }
//
//
//
//        public void getFriendList() throws Exception {
//
//
//
//            List<String> friendList = new ArrayList<String>();
//
//            friendList.add("Sylavan");
//
//            friendList.add("Jewal Ahmed");
//
//            friendList.add("Mannam Bhai");
//
//            friendList.add("Sadat Bhai");
//
//            friendList.add("Shah Param");
//
//            friendList.add("Nabil ppnt");
//
//
//
//            for (int i = 0; i < friendList.size(); i++) {
//
//                String str = friendList.get(i);
//
//                setInputSearch(str);
//
//                use_of_Test_Loger_search_for(str);
//
//                crearInputsearch();
//
//            }
//
//      }

        public void use_of_Test_Loger_search_for(String name){

            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {

            }.getClass().getEnclosingMethod().getName())+"-> "+name);

        }



        String path = "C:\\Users\\Sylvana Rahman\\IntelliJ idea projects\\WebAutomationGroup3\\UltaBeauty\\data\\ultaexcelfile.xls";



        public void runOnexcel() throws Exception {

            String[] testSteps = reader.getExcelData(path, 0);

            for (String str : testSteps) {

                switch (str){

                    case "signUp":

                        signUp();
                        //signIn();

                        break;

                    case "search":

                        search();
                       // searchinput();

                        break;

                    case "hover New Arrivals":

                        hoverOverNewArrivals();

                        break;

                    default:

                        System.out.println("No text found");

                        break;

                }

//            if (str.equalsIgnoreCase("open browser")) {

//                signIn();

//            } else if (str.equalsIgnoreCase("search")) {

//                searchinput();

//            } else {

//                throw new InvalidArgumentException("Invalid choice");

//            }

            }

        }



//        public void signIn() {
//
//            setLoginEmail("taherjuwel3262@gmail.com");
//
//            setLoginPassword("Juwel1234");
//
//            setLoginTab();
//
//        }
//
//
//
//        public void searchinput() throws Exception {
//
//            getFriendList();
//
//        }

    }

