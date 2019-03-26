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
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setVisiblefirstIMG();
    }
    @Test
    public void testHeadlines1(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setHeadlines();
    }
    @Test
    public void testHeadlones2(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setHeadlines2();
    }
    @Test
    public void testHeadlines3(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setHeadlines3();
    }
    @Test
    public void testHeadlines4(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setHeadlines4();
    }
    @Test
    public void testHeadlines5(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setHeadlines5();
    }
    @Test
    public void testFeatureSection(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setFeatureSection();
    }
    @Test
    public void testFeatureSection3(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setFeatureSection3();
    }
    @Test
    public void testFeatureSection4(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setFeatureSection4();
    }
    @Test
    public void testLatestStories(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestSories1();
    }
    @Test
    public void testLatestStories2(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestSories2();
    }
    @Test
    public void testLatestStories4(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStiries4();
    }
    @Test
    public void testLatestStories5(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStories5();
    }
    @Test
    public void testLatestStories6(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStories6();
    }
    @Test
    public void testLatestStories7(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestSories7();
    }
    @Test
    public void testLatestStories8(){
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStories8();
    }
    @Test
    public void testLatestStories9() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStories9();
    }
    @Test
    public void testLatestStories11() {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStories11();
    }
    @Test
    public void testLatestStories12() {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStories12();
    }
    @Test
    public void testLatestStories13() {
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        world.setLatestStories13();
    }
}
