package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YnadexCatalogHeadPhones {
    WebDriver driver;

    @FindBy(xpath="//input[@name='Цена от']")
    public  WebElement priseFrom;
    @FindBy(xpath="//input[@id='header-search']")
    public WebElement headerSearch;
    @FindBy(xpath="//span[@class='NVoaOvqe58' and .= 'Beats']")
    public WebElement beats;

    //находит 1 заголовок всех результатов поиска
    @FindBy(xpath="//div[@class='n-snippet-cell2__title']/a")
    public  WebElement masResult;


    public YnadexCatalogHeadPhones(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }


}
