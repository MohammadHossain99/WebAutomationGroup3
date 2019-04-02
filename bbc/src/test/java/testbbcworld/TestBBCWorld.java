package testbbcworld;

import base.CommonAPI;
import bbcworld.BBCWorld;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBBCWorld extends CommonAPI {
    BBCWorld world;
    String worldUrl = "https://www.bbc.com/news/world";

    @BeforeClass
    public void initialization(){
        driver.get("https://www.bbc.com/news/world");
        world = PageFactory.initElements(driver,BBCWorld.class);
        driver.navigate().refresh();
    }

    @Test
    public void testHeadlines1(){
        world.setHeadlines();
    }
    @Test
    public void testHeadlones2(){
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
    @Test
    public void testHeadlines5(){
        world.setHeadlines5();
    }
    @Test
    public void testFeatureSection(){
        world.setFeatureSection();
    }
    @Test
    public void testFeatureSection3(){
        world.setFeatureSection3();
    }
    @Test
    public void testFeatureSection4(){
        world.setFeatureSection4();
    }
    @Test
    public void testLatestStories(){
        world.setLatestSories1();
    }
    @Test
    public void testLatestStories2(){
        world.setLatestSories2();
    }
    @Test
    public void testLatestStories4(){
        world.setLatestStiries4();
    }
    @Test
    public void testLatestStories5(){
        world.setLatestStories5();
    }
    @Test
    public void testLatestStories6(){
        world.setLatestStories6();
    }
    @Test
    public void testLatestStories7(){
        world.setLatestSories7();
    }
    @Test
    public void testLatestStories8(){
        world.setLatestStories8();
    }
    @Test
    public void testLatestStories9() throws Exception{
        world.setLatestStories9();
    }
    @Test
    public void testLatestStories11() {
        world.setLatestStories11();
    }
    @Test
    public void testLatestStories12() {
        world.setLatestStories12();
    }
    @Test
    public void testLatestStories13() {
        world.setLatestStories13();
    }
    @Test
    public void testLatestStories14() {
        world.setLatestStories14();
    }
    @Test
    public void testLatestStories15() {
        world.setLatestStories15();
    }
    @Test
    public void testLatestStories16() {
        world.setLatestStories16();
    }
    @Test
    public void testLatestStories17() {
        world.setLatestStories17();
    }
    @Test
    public void testLatestStories18() {
        world.setLatestStories18();
    }
    @Test
    public void testLatestStories19() {
        world.setLatestStories19();
    }
    @Test
    public void testLatestStories20() {
        world.setLatestStories20();
    }
}
