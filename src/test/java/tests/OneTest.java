package tests;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
            WebElementUtill.waitElement(driver, MainYandex.market);

            MarketYandex marketYandex = new MarketYandex(driver);
            WebElementUtill.waitElement(driver,marketYandex.electronika);
            WebElementUtill.waitElement(driver,marketYandex.tv);

            WebElementUtill.waitElement(driver, YandexCatalogTelevizory.arrowBuuttonSort);

//        злополучная кнопка
//        Select drpFindBy = new Select(driver.findElement(By.className("button button_theme_normal button_arrow_down button_size_s select__button i-bem button_js_inited button_focused_yes")));
//        drpFindBy.selectByVisibleText("Показывать по 12");

//        WebElementUtill.selectElement(driver, "Показывать по 12");
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("window.addEventListener('click', function(e) {\n" +
//              "function add_Div(){\n" +
//              "\n" +
//              "var element = document.createElement('div');\n" +
//              "element.id = 'MyDiv'; \n" +
//              "element.style.width = '10px';\n" +
//              "element.style.height = '10px';\n" +
//              "element.style.position = 'absolute';\n" +
//              "element.style.left = e.pageX + 'px';\n" +
//              "element.style.top = e.pageY + 'px';\n" +
//              "element.style.background = 'red';\n" +
//              "element.style.border = '1px';\n" +
//              "document.body.appendChild(element);\n" +
//              "\n" +
//              "}\n" +
//              "\n" +
//              "add_Div();\n" +
//              "\n" +
//              "}, false);" +
//              "$(document.elementFromPoint(1039, 12381)).click();");

//            YandexCatalogTelevizory yandexCatalogTelevizory = new YandexCatalogTelevizory(driver);
//            yandexCatalogTelevizory.priseFrom.sendKeys("20000");
//            yandexCatalogTelevizory.fromLg.click();
//            yandexCatalogTelevizory.fromSamsung.click();
        } catch (Exception e) {
            fail();
            System.out.println(e);
        } finally {
            if (driver != null) driver.quit();

        }
    }
}
