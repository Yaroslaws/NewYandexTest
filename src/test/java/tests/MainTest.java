package tests;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ChromeDriverUtil;

import java.util.ArrayList;


public class MainTest {

//    public static WebDriver driver;
//
//    static {
//        driver = ChromeDriverUtil.startChromeDriver();
//    }


    @Test
    public  void test() throws InterruptedException {


        TwoTest twoTest = new TwoTest();
        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("привет");
                    TwoTest twoTest = new TwoTest();
                    twoTest.testYandex2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        thread.start();


        OneTest oneTest = new OneTest();
        oneTest.testYandex();



    }




}
