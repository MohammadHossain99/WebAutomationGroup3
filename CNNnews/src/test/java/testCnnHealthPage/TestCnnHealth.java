package testCnnHealthPage;

import base.CommonAPI;
import cnnHealthPage.CnnHealth;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCnnHealth extends CommonAPI {


    String cnnHelthUrl = "https://www.cnn.com/health";

    CnnHealth health;

    @BeforeClass
    public void intiaizing(){
        driver.get(cnnHelthUrl);
        health = PageFactory.initElements(driver,CnnHealth.class);
    }
    @Test
    public void testsetstorisSix(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setstorisSix();
    }
    @Test
    public void testsettopStoris(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setTopStoris();
    }
    @Test
    public void testsetFirstIMG(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setFirstIMG();
    }
    @Test
    public void testParenting(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setTestParenting();
    }
    @Test
    public void testsetHouseStoris()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setHouseStoris();
    }
    @Test
    public void testsetPopulerSixthTopic(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setPopulerSixthTopic();
    }
    @Test
    public void testsetpaidPartnerIMG(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setpaidPartnerIMG();
    }
    @Test
    public void testsetBottomWorldAsianews(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setBottomWorldAsianews();
    }
    @Test
    public void testsetbottomWorldAustralia(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setbottomWorldAustralia();
    }
    @Test
    public void testsetbottomPoliticsCongress(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setbottomPoliticsCongress();
    }

}
