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
    public void testSetStorisSix(){
        health.setStorisSix();
    }
    @Test
    public void testSetTopStoris(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setTopStoris();
    }
    @Test
    public void testSetFirstIMG(){
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
    public void testSetHouseStoris()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setHouseStoris();
    }
    @Test
    public void testSetPopulerSixthTopic(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setPopulerSixthTopic();
    }
    @Test
    public void testSetPaidPartnerIMG(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setpaidPartnerIMG();
    }
    @Test
    public void testSetBottomWorldAsianews(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setBottomWorldAsianews();
    }
    @Test
    public void testSetbottomWorldAustralia(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setbottomWorldAustralia();
    }
    @Test
    public void testSetBottomPoliticsCongress(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        health.setbottomPoliticsCongress();
    }
}
