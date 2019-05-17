package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ChromeDriverUtil;

import static org.testng.Assert.fail;

public class FiveTest implements Runnable {
        @Test
        public void test5() throws InterruptedException {
            WebDriver driver = ChromeDriverUtil.startChromeDriver();
            try {

                driver.get("https://www.pcgamer.com/");
                driver.close();
            } catch (Exception e) {
                driver.close();
                fail();
                System.out.println(e);
            }
        }

    public void run() {
        System.out.println("start test 5");
        try {
            test5();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
