package testcnnhealthpage;

import base.CommonAPI;
import cnnhealthpage.CnnHealth;
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
    public void testSetStorisSix(){
        health.setStorisSix();
    }
    @Test
    public void testSetTopStoris(){
        health.setTopStoris();
    }
    @Test
    public void testSetFirstIMG(){
        health.setFirstIMG();
    }
    @Test
    public void testParenting(){
        health.setTestParenting();
    }
    @Test
    public void testSetHouseStoris()throws Exception{
        health.setHouseStoris("Politics");
    }
    @Test
    public void testSetPaidPartnerIMG(){
        health.setPaidPartnerIMG();
    }
    @Test
    public void testSetBottomWorldAsianews(){
        health.setBottomWorldAsianews();
    }
    @Test
    public void testSetbottomWorldAustralia(){
        health.setbottomWorldAustralia();
    }
    @Test
    public void testSetBottomPoliticsCongress(){
        health.setbottomPoliticsCongress();
    }
    @Test
    public void testSetPopulerSixthTopic(){
        health.setPopulerSixthTopic();
    }
}