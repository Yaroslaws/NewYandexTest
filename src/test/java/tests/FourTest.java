package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ChromeDriverUtil;

import static org.testng.Assert.fail;

public class FourTest implements Runnable {
    @Test
    public void test4() throws InterruptedException {
        WebDriver driver = ChromeDriverUtil.startChromeDriver();
        try {

            driver.get("https://kanobu.ru/");
            driver.close();
        } catch (Exception e) {
            driver.close();
            fail();
            System.out.println(e);
        }


    }

    public  void setTimeoutSync(Runnable runnable, int delay) {
        try {
            Thread.sleep(delay);
            runnable.run();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }

    public void run() {
        System.out.println("start test 4");
        try {
            test4();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
