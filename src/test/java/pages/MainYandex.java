package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class MainYandex {
    WebDriver driver;


    @FindBy(xpath = "//a[@data-id='market']")
    public  WebElement market;

    public MainYandex(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
}
