package testCnnHealthPage;

import base.CommonAPI;
import cnnHealthPage.CnnHealth;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
        health.setstorisSix();
    }
    @Test
    public void testsettopStoris(){
        health.setTopStoris();
    }
    @Test
    public void testsetFirstIMG(){
        health.setFirstIMG();
    }
    @Test
    public void testParenting(){
        health.setTestParenting();
    }
    @Test
    public void testsetHouseStoris()throws Exception{
        health.setHouseStoris();
    }
    @Test
    public void testsetPopulerSixthTopic(){
        health.setPopulerSixthTopic();
    }
    @Test
    public void testsetpaidPartnerIMG(){
        health.setpaidPartnerIMG();

    }
    @Test
    public void testsetBottomWorldAsianews(){
        health.setBottomWorldAsianews();
    }
    @Test
    public void testsetbottomWorldAustralia(){
        health.setbottomWorldAustralia();
    }
    @Test
    public void testsetbottomPoliticsCongress(){
        health.setbottomPoliticsCongress();
    }






}
