package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ChromeDriverUtil;


import static org.testng.Assert.fail;

public class ThreeTest extends MainTest implements Runnable {


    public void test3() {
        WebDriver driver = ChromeDriverUtil.startChromeDriver();
        try {
            driver.get("https://gmbox.ru/");
            driver.close();
        } catch (Exception e) {
            driver.close();
            fail();
            System.out.println(e);
        }

    }

    @Test
    public void run() {
        System.out.println("start test 3");
        try {
            test3();
        } catch (Exception e) {
            fail();
            System.out.println(e);
        }

    }


}
