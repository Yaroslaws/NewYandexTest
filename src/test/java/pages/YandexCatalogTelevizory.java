package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexCatalogTelevizory {

    public static By arrowBuuttonSort = By.xpath("//button[contains(@class,'button_arrow_down')]");

//    @FindBy(xpath="//input[@name='Цена от']")
//    private WebElement priseFrom;
    public static By priseFrom = By.xpath("//input[@name='Цена от']") ;
    public static By fromLg = By.xpath("//span[@class='NVoaOvqe58' and .= 'LG']");
    public static By fromSamsung = By.xpath("//span[@class='NVoaOvqe58' and .= 'Samsung']");
    //ранит название выданной техники
    public static By masResult = By.xpath("div[@class = 'n-filter-applied-results metrika b-zone i-bem n-filter-applied-results_js_inited b-zone_js_inited']//div[@class='n-snippet-card2__title']/a");

}
