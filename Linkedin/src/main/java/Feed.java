import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Feed extends CommonAPI {

    @FindBy(xpath = "//*[@id=\'ember31\']/input")
    WebElement searchBox;


}
