package utils;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class WebElementUtill {


    public static WebElement element;

    public static  WebElement sendKeys(WebDriver driver,By locator, String text) {
        //WebElement element=null;
        try {
            element =  (new WebDriverWait(driver, 3, 1000)).until(ExpectedConditions.elementToBeClickable(locator));
            element.clear();
            element.sendKeys(text);
        }
        catch (Exception e)
        {
            System.out.println("Не нашел локатор" + locator);
        }
        return element;
    }

    public static  WebElement waitElement(WebDriver driver,WebElement locator) {
        try {
            element =  (new WebDriverWait(driver, 3, 1000)).until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        }
        catch (Exception e)
        {
            System.out.println("Не нашел локатор" + locator);
            fail();
        }
        return element;
    }






    public static  void selectElement(WebDriver driver,String text) {
        try {

            element =(new WebDriverWait(driver, 1, 1000))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//select/option[.='" + text + "']")));
            element.click();

        }
        catch (Exception e)
        {

            System.out.println(e);
            System.out.println("selectElement Не нашел локатор: " + element);
        }
    }


}
