package tests;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainYandex;
import pages.MarketYandex;
import pages.YandexCatalogTelevizory;
import utils.ChromeDriverUtil;
import utils.WebElementUtill;

public class OneTest {
    WebDriver driver;

    @BeforeClass
    public void criarDriver() throws InterruptedException {

//        WebDriver driver = ChromeDriverUtil.startChromeDriver();
//        assert driver != null;
//        driver.get("https://yandex.ru/");

    }


    @AfterClass
    public void teardown () {
//        driver.quit();
    }




  @Test
  public void testYandex() throws InterruptedException {
      WebDriver driver = ChromeDriverUtil.startChromeDriver();
      assert driver != null;
      driver.get("https://yandex.ru/");

      MainYandex mainYandex = new MainYandex(driver);

      mainYandex.market.click();

      MarketYandex marketYandex = new MarketYandex(driver);
      marketYandex.electronika.click();
      marketYandex.tv.click();

        //не получается нажать на кнопку Показывать по 12
//        WebElementUtill.waitElement(driver, YandexCatalogTelevizory.arrowBuuttonSort);
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

      YandexCatalogTelevizory yandexCatalogTelevizory = new YandexCatalogTelevizory(driver);
      yandexCatalogTelevizory.priseFrom.sendKeys("20000");
      yandexCatalogTelevizory.fromLg.click();
      yandexCatalogTelevizory.fromSamsung.click();





    }
}
