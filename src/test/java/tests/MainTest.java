package tests;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import utils.ChromeDriverUtil;

//import static org.testng.Assert.fail;

public class MainTest {

    public static WebDriver driver = null;

    public static void baseDriverSettings() {
        try {

            driver = ChromeDriverUtil.startChromeDriver();
            driver.manage().window().setSize(new Dimension(1280, 900));
        } catch (Exception e) {
          // fail();
        }
    }




}
