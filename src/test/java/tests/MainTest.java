package tests;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import utils.ChromeDriverUtil;



public class MainTest {

    public static WebDriver driver;

    static {
        driver = ChromeDriverUtil.startChromeDriver();
    }

}
