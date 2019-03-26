package testCNNWorld;

import base.CommonAPI;
import cnnWorld.CNNWorld;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCNNWorld extends CommonAPI {

    CNNWorld world;
    String worldUrl = "https://www.cnn.com/world";

    @BeforeClass
    public void initialization(){
        driver.navigate().to(worldUrl);
        world = PageFactory.initElements(driver,CNNWorld.class);
        driver.navigate().refresh();
    }
    @Test
    public void testTopVisibeIMG(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setVisiblefirstIMG();
    }
    @Test
    public void testHeadlines1(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setHeadlines();
    }
    @Test
    public void testHeadlones2(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setHeadlines2();
    }
    @Test
    public void testHeadlines3(){
        world.setHeadlines3();
    }
    @Test
    public void testHeadlines4(){
        world.setHeadlines4();
    }




}
