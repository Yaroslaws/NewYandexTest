package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexCatalogTelevizory {

    WebDriver driver;

    @FindBy(xpath="//button[contains(@class,'button_arrow_down')]")
    public  WebElement arrowBuuttonSort;
    @FindBy(xpath="//input[@name='Цена от']")
    public  WebElement priseFrom;
    @FindBy(xpath="//span[@class='NVoaOvqe58' and .= 'LG']")
    public  WebElement fromLg;
    @FindBy(xpath="//span[@class='NVoaOvqe58' and .= 'Samsung']")
    public  WebElement fromSamsung;
    //находит 1 заголовок всех результатов поиска
    @FindBy(xpath="//div[@class='n-snippet-card2__title']/a")
    public  WebElement masResult;
    @FindBy(xpath="//input[@id='header-search']")
    public WebElement headerSearch;


    public YandexCatalogTelevizory(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }







}
