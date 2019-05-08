package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeDriverUtil {
    //возвращает ChromeDriver для запуска и работы браузера


    public static WebDriver startChromeDriver() {
        ChromeDriver driver = null;
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        } catch (Exception e) {
           driver.quit();
        }
        return null;
    }
    public static WebDriver reloadDriver() {
        ChromeDriver driver = null;
        try {

            System.setProperty("webdriver.chrome.driver",
                    "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        } catch (Exception e) {
            driver.quit();
        }
        return null;
    }

}