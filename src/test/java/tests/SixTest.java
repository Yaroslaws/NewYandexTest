package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ChromeDriverUtil;

import static org.testng.Assert.fail;

public class SixTest implements Runnable {
    @Test
    public void test6() throws InterruptedException {
        WebDriver driver = ChromeDriverUtil.startChromeDriver();
        try {
            driver.get("https://www.igromania.ru/");
            driver.close();
        } catch (Exception e) {
            driver.close();
            fail();
            System.out.println(e);
        }

    }

    public void run() {
        System.out.println("start test 6");
        try {
            test6();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
