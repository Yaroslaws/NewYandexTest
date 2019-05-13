package tests;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.MainYandex;
import pages.MarketYandex;
import pages.YandexCatalogTelevizory;
import utils.WebElementUtill;

import static org.testng.Assert.fail;

public class OneTest extends MainTest {

    @Test
    public void testYandex() throws InterruptedException {

        try {
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
