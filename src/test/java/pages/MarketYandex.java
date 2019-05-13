package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketYandex extends Page {
    WebDriver driver;


    @FindBy(xpath="//span[.='Электроника']")
    public static WebElement electronika;
    @FindBy(xpath="//a[.='Телевизоры']")
    public static   WebElement tv;


    public MarketYandex(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

}
