package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainYandex;
import pages.MarketYandex;
import pages.YandexCatalogTelevizory;
import pages.YnadexCatalogHeadPhones;
import utils.ChromeDriverUtil;
import utils.WebElementUtill;

import static org.testng.Assert.fail;

public class TwoTest extends MainTest {
    @Test
    public void testYandex2() throws InterruptedException {


        try {
            WebDriver driver = ChromeDriverUtil.startChromeDriver();
            driver.get("https://yandex.ru/");
            MainYandex mainYandex = new MainYandex(driver);
            WebElementUtill.waitElement(driver, mainYandex.market);

            MarketYandex marketYandex = new MarketYandex(driver);
            WebElementUtill.waitElement(driver,marketYandex.electronika);
            WebElementUtill.waitElement(driver, marketYandex.headphones);

            YandexCatalogTelevizory yandexCatalogTelevizory = new YandexCatalogTelevizory(driver);
            WebElementUtill.waitElement(driver, yandexCatalogTelevizory.arrowBuuttonSort);
            driver.findElement(By.xpath("//span[text()='Показывать по 12']/..")).click();

            YnadexCatalogHeadPhones yandexCatalogHeadPhones = new YnadexCatalogHeadPhones(driver);
            yandexCatalogHeadPhones.priseFrom.sendKeys("5000");
            WebElementUtill.waitElement(driver, yandexCatalogHeadPhones.beats);

            Thread.sleep(4000);
            int num = driver.findElements(By.xpath("//div[@class='n-snippet-list n-snippet-list_type_grid snippet-list_size_3 metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited']/div")).size();
            //проверка на вывод 12 товаров
            Assert.assertEquals(num, 12);
            yandexCatalogHeadPhones = new YnadexCatalogHeadPhones(driver);
            String str = yandexCatalogHeadPhones.masResult.getText();
            WebElementUtill.sendKeys(driver,yandexCatalogHeadPhones.headerSearch, str);
            Assert.assertEquals(str,"Наушники Beats BeatsX Wireless");





        } catch (Exception e) {
            System.out.println(e);
            fail();

        } finally {
//            if (driver != null) driver.quit();
        }
    }
}
