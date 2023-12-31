package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TempoPage {

    public String inputButtonPizza = "//img[@alt='Пицца']";
    public String inputButtonOrder = "//div[@id='1']//div[@class='order-btn']";
    public String inputButtonOrderPopup = "//div[@class='popupContent']//div[@class='order-btn']";
    public String inputButtonBasket = "//div[@class='bs-price-col']";
    public String textNamePizza = "//div[@class='content']//div[(contains(text(), 'Маргарита'))]";
    WebDriver driver;

    public TempoPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickInputButtonPizza() {

        driver.findElement(By.xpath(inputButtonPizza)).click();
    }

    public void clickInputButtonOrder() {

        driver.findElement(By.xpath(inputButtonOrder)).click();
    }

    public void clickInputButtonOrderPopup() {

        driver.findElement(By.xpath(inputButtonOrderPopup)).click();
    }

    public void clickInputButtonBasket() {

        driver.findElement(By.xpath(inputButtonBasket)).click();
    }

    public String getTextNamePizza() {

        return driver.findElement(By.xpath(textNamePizza)).getText();
    }
}
