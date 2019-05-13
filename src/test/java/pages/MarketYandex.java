package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketYandex extends Page {
    WebDriver driver;


    @FindBy(xpath="//span[.='Электроника']")
    public  WebElement electronika;
    @FindBy(xpath="//a[.='Телевизоры']")
    public  WebElement tv;
    @FindBy(xpath="//a[.='Наушники и Bluetooth-гарнитуры']")
    public  WebElement headphones;



    public MarketYandex(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

}
