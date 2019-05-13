package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainYandex;
import pages.MarketYandex;
import pages.YandexCatalogTelevizory;
import pages.YnadexCatalogHeadPhones;
import utils.WebElementUtill;

import static org.testng.Assert.fail;

public class TwoTest extends MainTest {
    @Test
    public void testYandex2() throws InterruptedException {


        try {
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
            yandexCatalogHeadPhones = new YnadexCatalogHeadPhones(driver);
            String str = yandexCatalogHeadPhones.masResult.getText();
            WebElementUtill.sendKeys(driver,yandexCatalogHeadPhones.headerSearch, str);
            Assert.assertEquals(str,"Наушники Beats BeatsX Wireless");





        } catch (Exception e) {
            fail();
            System.out.println(e);
        } finally {
//            if (driver != null) driver.quit();

        }
    }
}
