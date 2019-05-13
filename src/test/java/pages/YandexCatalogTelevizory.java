package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexCatalogTelevizory {

    WebDriver driver;

    @FindBy(xpath="//button[contains(@class,'button_arrow_down')]")
    public static WebElement arrowBuuttonSort;
    @FindBy(xpath="//input[@name='Цена от']")
    public static WebElement priseFrom;
    @FindBy(xpath="//span[@class='NVoaOvqe58' and .= 'LG']")
    public static  WebElement fromLg;
    @FindBy(xpath="//span[@class='NVoaOvqe58' and .= 'Samsung']")
    public static  WebElement fromSamsung;
    @FindBy(xpath="div[@class = 'n-filter-applied-results metrika b-zone i-bem n-filter-applied-results_js_inited b-zone_js_inited']//div[@class='n-snippet-card2__title']/a")
    public static  WebElement masResult;

    public YandexCatalogTelevizory(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }







}
