package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage extends CommonAPI {
    Actions action = new Actions(driver);

    @FindBy(xpath = "//*[@id=\"header-full\"]/header/nav[1]/div/div/div[1]")
    WebElement headlines;

    @FindBy(xpath = "//*[@id=\'header-sign-in\']")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"qf-0q-destination\"]")
    WebElement headlines2;

    @FindBy(xpath = "//*[@id=\'wizard-tabs\']/div[1]/ul/li[1]")
    WebElement headlines3;

    @FindBy(xpath = "//*[@id=\'wizard-tabs\']/div[1]/ul/li[1]")
    WebElement headlines4;

    @FindBy(xpath = "//*[@id=\'vn1s0p1c0\']/h3")
    WebElement Hotelsearch;

    @FindBy(xpath = "//*[@id=\'main-col\']/div[1]/div[1]/div[1]/div[3]/h2/a")
    WebElement featureSection;

    @FindBy(xpath = "//*[@id=\'change-search-form\']")
    WebElement featureSection3;

    @FindBy(xpath = "//*[@id=\'hdr-rewards\']")
    WebElement featureSection4;

    @FindBy(xpath = "//*[@id=\'main-content\']/div/div/div[1]/div")
    WebElement latestSories1;

    @FindBy(css = "./html/body/div[4]/div/section/div[1]/div/button")
    WebElement latestSories2;

    @FindBy(xpath = "//*[@id=\'allcountries\']/div[2]")
    WebElement latestStiries4;

    @FindBy(xpath = "//*[@id=\'main-content\']")
    WebElement latestStories5;

    @FindBy(xpath = "//*[@id=\'search\']/div[1]/div/h1")
    WebElement latestStories6;

    @FindBy(xpath = "//*[@id=\'q-destination\']")
    WebElement latestSories7;

    @FindBy(xpath = "//*[@id=\'countrylanding\']/div[3]/div/div/div/div[2]/div/div/div/form/div[5]/button")
    WebElement latestStories8;

    @FindBy(xpath = "\"//*[@id=\\'hds-marquee\\']/div[3]/div[1]/div/form/div[1]\'")
    WebElement latestStories9;

    @FindBy(xpath = "//*[@id=\'currency-popup\']/div")
    WebElement latestStories10;

    @FindBy(xpath = "//*[@id=\'header-toggle-currency\']")
    WebElement latestStories11;

    @FindBy(xpath = "//*[@id='hdr-customer-bookings']")
    WebElement latestStories12;

    @FindBy(xpath = "//*[@id=\'main-content\']/div/div/div[1]/div[2]/div/h1")
    WebElement latestStories13;

    @FindBy(xpath = "//*[@id=\'main-content\']/div/div/div[1]/div[1]/nav/ul/li[4]/span")
    WebElement latestStories14;

    @FindBy(xpath = "//*[@id=\'main-content\']/div/div/div[1]/div[1]/nav/ul/li[4]")
    WebElement latestStories15;

    @FindBy(xpath = "//*[@id=\'main-content\']/div/div/div[1]/div[2]" )
    WebElement latestStories16;

    @FindBy(xpath = "//*[@id=\'bbccom_leaderboard_1_2_3_4\']")
    WebElement latestStories17;

    @FindBy(xpath = "//*[@id=\'comp-battenberg\']/div/div/a[1]/h3/span")
    WebElement latestStories18;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-4\']/div/div/a[1]/h3/span")
    WebElement latestStories19;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement latestStories20;

    @FindBy(xpath = "//*[@id=\'comp-pattern-library-5\']/div/div/a[1]/h3/span")
    WebElement latestStories21;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories22;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories23;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories24;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories25;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories26;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories27;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories28;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories29;

    @FindBy(xpath = "//*[@id=\'page\']/div[1]/div[2]/div/div[1]/div[1]/h1")
    WebElement latestStories30;

    public void setHeadlines() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify the web page of Hotels.com");
        String text = headlines.getText();
        Assert.assertEquals(text, text);}

    public void setLogin(){
        driver.get("https://www.hotels.com/profile/signin.html?intlid=SIGNIN+%3A%3A+header_main_section&target=H4sIAAAAAAAAANMHANTS03kBAAAA");
        driver.findElement(By.id("sign-in-email")).sendKeys("sadat99@aol.com");
        driver.findElement(By.id("sign-in-password")).sendKeys("ny1856");
        clickByXpath("//*[@id=\'main-content\']/div/div/div/div/div/div[2]/form/button");
        driver.get("https://www.hotels.com/hotel-deals/?intlid=c..mlW7MQTyJjdsoRkg1cAmKdFlxdx0u6ttZxsgCgV0AD0.");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify the Login Page of Hotels.com");
        String text = headlines.getText();
        Assert.assertEquals(text, text);}

    public void setHeadlines2() {
        driver.findElement(By.id("qf-1q-destination")).sendKeys("New York");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Searching Hotels for New York");
        boolean selected = headlines2.isSelected();
        Assert.assertFalse(selected);}

    public void setHeadlines3() {
        driver.get("https://travel.hotels.com/?intlid=HOME+%3A%3A+header_main_section");
        clickByXpath("//*[@id='tab-package-tab-hp']");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels.com - Package Deals");
        action.moveToElement(headlines3);
        boolean selected = headlines3.isEnabled();
        Assert.assertTrue(selected);}

    public void setHeadlines4() {
        driver.get("https://travel.hotels.com/?intlid=HOME+%3A%3A+header_main_section");
        clickByXpath("//*[@id=\"wizard-tabs\"]/div[1]/ul/li[3]");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels.com - Flight Deals");}

    public void setHotelsearch(){
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Hotel" + Keys.ENTER);
        Hotelsearch.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Hotel search in google");}

    public void setFeatureSection() {
        driver.get("https://www.hotels.com/customer_care/booking_details.html?confirmationId=8104481098064&itineraryId=8104481098064&surname=c..8-wvWGKuBcc.");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels.com - My past booking");
        action.moveToElement(featureSection);
        String text = featureSection.getText();
        Assert.assertEquals(text, text);
        System.out.println(text);}

    public void setFeatureSection3() {
        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1533777%3AUNKNOWN%3AUNKNOWN&destination-id=1533777&q-destination=Niagara%20Falls,%20New%20York,%20United%20States%20of%20America&q-check-in=2019-05-07&q-check-out=2019-05-09&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels.com - Niagara Falls Hotel Listing");
        action.moveToElement(featureSection3);
        boolean select = featureSection3.isDisplayed();
        Assert.assertTrue(select);}

    public void setFeatureSection4() {
        driver.get("https://www.hotels.com/page/giftcards/?intlid=SEARCHRESULTS%20%3A%3A%20header_main_section");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels.com - Gift Card");
        boolean selected = featureSection4.isSelected();
        Assert.assertFalse(selected);}

    public void setLatestSories1(){
        driver.get("https://www.hotels.com/hotel-rewards-pillar/hotelscomrewards.html?intlid=HOME+%3A%3A+header_main_section");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels.com - Reward Page");
        action.moveToElement(latestSories1);
        String text = latestSories1.getText();
        System.out.println(text);
        Assert.assertEquals(text,text);}

    public void setLatestSories2(){
        driver.get("https://travel.hotels.com/Hotel-Search?packageType=fh&searchProduct=hotel&c=b8214ff4-41cc-47e3-bd97-93281d338bed&adults=" +
                        "2&originId=6139058&ftla=NYC&destination=Los+Angeles,+CA,+United+States+(LAX-Los+Angeles+Intl.)&destinationId=5783884&" +
                        "ttla=LAX&startDate=7/11/2019&endDate=7/14/2019&sort=recommended&tripType=ROUND_TRIP&misId=4bf09de1-3849-4318-b535-ef6af80174af");

        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotel Search Page");
        action.moveToElement(latestSories2).click();
        String text = driver.getTitle();
        System.out.println(text);}

    public void setLatestStiries4(){
        driver.get("https://www.hotels.com/allcountries/");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels in all Countries");
        action.moveToElement(latestStiries4);
        String text = latestStiries4.getText();
        Assert.assertEquals(text,text);}

    public void setLatestStories5(){
        driver.get("https://www.hotels.com/co10233012/hotels-in-bangladesh/");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Search Hotel in Bangladesh");
        action.moveToElement(latestStories5);
        action.moveToElement(latestStiries4).moveToElement(latestStories5);
        boolean selected = latestStories5.isDisplayed();
        Assert.assertTrue(selected);}

    public void setLatestStories6(){
       driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A84064%3AUNKNOWN%3AUNKNOWN&destination-id=84064&q-destination=Dhaka," +
               "%20Bangladesh&q-check-in=2019-07-10&q-check-out=2019-07-11&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotel list in Dhaka");
        action.moveToElement(latestStories6);
        boolean select = latestStories6.isSelected();
        Assert.assertFalse(select);}

    public void setLatestSories7() throws Exception {
        driver.get("https://www.hotels.com/co10233012/hotels-in-bangladesh/");
        driver.findElement(By.xpath("//*[@id=\'q-destination\']")).
                sendKeys("Radisson Blu Dhaka Water Garden, Dhaka, Bangladesh" + Keys.ENTER);
        driver.wait(300);
        Thread.sleep(4000);
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Finding Radisson Blue, Dhaka");
        action.moveToElement(latestSories7).click();
        driver.navigate().refresh();}

    public void setLatestStories8() throws Exception{
        driver.get("https://www.hotels.com/co10233012/hotels-in-bangladesh/");
        driver.findElement(By.xpath("//*[@id=\'countrylanding\']/div[3]/div/div/div/div[2]/div/div/div/form/div[5]/button")).
                sendKeys("Chittagong, Bangladesh" + Keys.ENTER);
        Thread.sleep(4000);
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Finding Hotels in Dhaka");
        action.moveToElement(latestStories8);
        boolean selectd = latestStories8.isDisplayed();
        Assert.assertTrue(selectd);}

    public void setLatestStories9()throws Exception{
        driver.get("https://www.hotels.com/");
        driver.findElement(By.xpath("//*[@id=\'hds-marquee\']/div[3]/div[1]/div/form/div[1]")).
        sendKeys("Chittagong, Bangladesh" + Keys.ENTER);
        driver.wait(8000);
        Thread.sleep(4000);
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Finding Hotels in Dhaka");
        action.moveToElement(latestStories8);
        boolean selectd = latestStories8.isDisplayed();
        Assert.assertTrue(selectd);}

    public void setLatestStories10()throws Exception{
        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1517774%3AUNKNOWN%3AUNKNOWN&destination-id=1517774&q" +
                "-destination=Astoria,%20New%20York,%20United%20States%20of%20America&q-check-in=2019-04-09&q-check-out=2019-04-13&q-rooms=" +
                "2&q-room-0-adults=2&q-room-0-children=0&q-room-1-adults=2&q-room-1-children=0");
        driver.findElement(By.xpath("//*[@id=\'currency-popup\']/div"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Finding Hotel in Astoria");
        action.moveToElement(latestStories10).doubleClick(latestStories10);
       Thread.sleep(4000);
        Dimension st= latestStories9.getSize();
        System.out.println(st);
        Assert.assertEquals(st,st);}

    public void setLatestStories11()throws Exception{
        driver.get("https://groups.hotels.com/Group-Rate/?locale=en_US&intlid=SEARCHRESULTS+%3A%3A+header_main_section&kw=header");
        driver.findElement(By.xpath("//*[@id=\'header-toggle-currency\']"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Searching venue for Group Meeting");
        Thread.sleep(4000);
        Dimension st= latestStories9.getSize();
        System.out.println(st);
        action.moveToElement(latestStories11);
        String text =latestStories11.getText();
        Assert.assertEquals(text,text);}

    public void setLatestStories12()throws Exception{
        driver.get("https://www.hotels.com/profile/signin.html?target=H4sIAAAAAAAAABXCMQqFMAwA0NO4tqLbBxERweFPVmeptdhgm" +
                "4iJ9Pri4wWRi39a55xVIPGRlaOkrXP0oOiN6AQ8OAKLCpJiCygR9sYM3dSP02CW_2yKqizq7luVwdvd32uygCt7J0D4AoYKQvJkAAAA");
        driver.findElement(By.xpath("//*[@id='hdr-customer-bookings']"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Hotels.com Booking");
        Thread.sleep(4000);
        action.moveToElement(latestStories12);
        boolean text =latestStories12.isDisplayed();
        Assert.assertTrue(text);}

    public void setLatestStories13(){
        driver.get("https://www.hotels.com/go/usa/things-to-do-myrtle-beach?intlid=gghcty|trend");
        driver.findElement(By.xpath("//*[@id=\'main-content\']/div/div/div[1]/div[2]/div/h1"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Things to do in Myrtle Beach");
        action.moveToElement(latestStories13);
        boolean select = latestStories13.isEnabled();
        Assert.assertTrue(select);
    }
    public void setLatestStories14(){
        driver.get("https://www.hotels.com/go/usa/san-francisco?intlid=gghcty|alsopop");
        driver.findElement(By.xpath("//*[@id=\'main-content\']/div/div/div[1]/div[1]/nav/ul/li[4]/span"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Voisit San Francisco");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);}

    public void setLatestStories15(){
         driver.get("https://www.hotels.com/go/usa/los-angeles?intlid=gghcnt|topdes");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[1]/nav/ul/li[4]/span"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Visit Los Angeles");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);}

    public void setLatestStories16(){
        driver.get("https://www.hotels.com/go/usa/hawaii?intlid=gghcnt|keepexp");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Visit Hawai");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);}

    public void setLatestStories17(){
        driver.get("https://www.hotels.com/go/usa/los-angeles?intlid=gghcnt|topdes");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[1]/nav/ul/li[4]/span"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Visit Los Angeles");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);}

    public void setLatestStories18(){
        driver.get("https://www.hotels.com/go/usa/los-angeles?intlid=gghcnt|topdes");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[1]/nav/ul/li[4]/span"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Visit Los Angeles");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);}

    public void setLatestStories19(){
        driver.get("https://www.hotels.com/go/usa/los-angeles?intlid=gghcnt|topdes");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[1]/nav/ul/li[4]/span"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Visit Los Angeles");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);}

    public void setLatestStories20(){
        driver.get("https://www.hotels.com/go/usa/los-angeles?intlid=gghcnt|topdes");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[1]/nav/ul/li[4]/span"));
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Visit Los Angeles");
        action.moveToElement(latestStories14);
        boolean select = latestStories14.isEnabled();
        Assert.assertTrue(select);}

//    public void setLatestStories21(){
//        driver.get("https://www.bbc.com/news/world/latin_america");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Latin America: Uruguay");
//        action.moveToElement(latestStories21);
//        boolean select = latestStories21.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories22(){
//        driver.get("https://www.bbc.com/news/world-latin-america-47781249");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Latin America: Venezuela");
//        action.moveToElement(latestStories22);
//        boolean select = latestStories22.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories23(){
//        driver.get("https://www.bbc.com/news/world-latin-america-47750729");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Latin America: Red Cross-Venezuela");
//        action.moveToElement(latestStories23);
//        boolean select = latestStories23.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories24(){
//        driver.get("https://www.bbc.com/news/world-europe-47785258");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Macedonia");
//        action.moveToElement(latestStories24);
//        boolean select = latestStories24.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories25(){
//        driver.get("https://www.bbc.com/news/world-europe-47785097");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Spain");
//        action.moveToElement(latestStories25);
//        boolean select = latestStories25.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories26(){
//        driver.get("https://www.bbc.com/news/world-europe-47785095");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Turkey");
//        action.moveToElement(latestStories26);
//        boolean select = latestStories26.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories27(){
//        driver.get("https://www.bbc.com/news/world-europe-47781254");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - EU");
//        action.moveToElement(latestStories27);
//        boolean select = latestStories27.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories28(){
//        driver.get("https://www.bbc.com/news/world-europe-47785088");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - France");
//        action.moveToElement(latestStories28);
//        boolean select = latestStories28.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories29(){
//        driver.get("https://www.bbc.com/news/business-47746141");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - Turkey Business");
//        action.moveToElement(latestStories29);
//        boolean select = latestStories29.isEnabled();
//        Assert.assertTrue(select);
//    }
//    public void setLatestStories30(){
//        driver.get("https://www.bbc.com/news/world-europe-47772604");
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines in BBC World Page: Europe - France");
//        action.moveToElement(latestStories30);
//        boolean select = latestStories30.isEnabled();
//        Assert.assertTrue(select);
//    }

}