package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {

    public String inputButtonClose = "//button[@data-test-type='close']";
    public String inputButtonPizza = "//a[@href='/pizza']";
    public String inputButtonInBasket = "//div[@data-code='MGRC']//button[@data-action='a2b']";
    public String inputButtonBasket = "//div[@class='cart-button']";
    public String textNamePizza = "//div[@class='cart-button__mini-bag-products-wrapper']//div[@class='product-card__title']";

    WebDriver driver;

    public DominosPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickInputButtonClose() {

        driver.findElement(By.xpath(inputButtonClose)).click();
    }

    public void clickInputButtonPizza() {

        driver.findElement(By.xpath(inputButtonPizza)).click();
    }

    public void clickInputButtonInBasket() {

        driver.findElement(By.xpath(inputButtonInBasket)).click();
    }

    public void clickInputButtonBasket() {

        driver.findElement(By.xpath(inputButtonBasket)).click();
    }

    public String getTextNamePizza() {

        return driver.findElement(By.xpath(textNamePizza)).getText();
    }


}
