package tests;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.MainYandex;
import pages.MarketYandex;
import pages.YandexCatalogTelevizory;
import utils.ChromeDriverUtil;
import utils.WebElementUtill;
import static org.testng.Assert.fail;

public class OneTest extends MainTest {

    @Test
    public void testYandex() throws InterruptedException {

        try {
           WebDriver driver = ChromeDriverUtil.startChromeDriver();
            driver.get("https://yandex.ru/");
            MainYandex mainYandex = new MainYandex(driver);
            WebElementUtill.waitElement(driver, mainYandex.market);

            MarketYandex marketYandex = new MarketYandex(driver);
            WebElementUtill.waitElement(driver,marketYandex.electronika);
            WebElementUtill.waitElement(driver,marketYandex.tv);

            YandexCatalogTelevizory yandexCatalogTelevizory = new YandexCatalogTelevizory(driver);
            WebElementUtill.waitElement(driver, yandexCatalogTelevizory.arrowBuuttonSort);
            driver.findElement(By.xpath("//span[text()='Показывать по 12']/..")).click();

            yandexCatalogTelevizory.priseFrom.sendKeys("20000");
            yandexCatalogTelevizory.fromLg.click();
            yandexCatalogTelevizory.fromSamsung.click();


            Thread.sleep(4000);
            int num = driver.findElements(By.xpath("//div[@class='n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited']/div")).size();
            //проверка на вывод 12 товаров
            Assert.assertEquals(num, 12);
            yandexCatalogTelevizory = new YandexCatalogTelevizory(driver);
            String str = yandexCatalogTelevizory.masResult.getText();
            WebElementUtill.sendKeys(driver,yandexCatalogTelevizory.headerSearch, str);
            Assert.assertEquals(str,"Телевизор Samsung UE32N5000AU");


        } catch (Exception e) {
            fail();
            System.out.println(e);
        } finally {
//            if (driver != null) driver.quit();
        }
    }
}
