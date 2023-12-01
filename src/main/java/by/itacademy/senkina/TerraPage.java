package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerraPage {
    public String inputButtonClose = "//button[@class='close-icon']";
    public String inputButtonPizza = "//li[@class='menu-navigation__item']/a[@href='/catalog/picca']";
    public String inputButtonInBasket = "//button[@data-id='364']";
    public String inputButtonBar = "//li[@class='menu-navigation__item']/a[@href='/catalog/bar']";
    public String inputButtonAddDrink = "//button[@data-id='2219']";
    public String inputButtonBasket = "//div[@class='basket__btn-top basket__top basket__btn-top--sm']";
    public String textNamePizza = "//li[@id='basket-el-0']//div[@class='basket__products-item-name']";
    public String textNameDrink = "//li[@id='basket-el-1']//div[@class='basket__products-item-name']";

    WebDriver driver;

    public TerraPage(WebDriver driver) {

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

    public void clickInputButtonBar() {

        driver.findElement(By.xpath(inputButtonBar)).click();
    }

    public void clickInputButtonAddDrink() {

        driver.findElement(By.xpath(inputButtonAddDrink)).click();
    }

    public void clickInputButtonBasket() {

        driver.findElement(By.xpath(inputButtonBasket)).click();
    }

    public String getTextNamePizza() {

        return driver.findElement(By.xpath(textNamePizza)).getText();
    }

    public String getTextNameDrink() {

        return driver.findElement(By.xpath(textNameDrink)).getText();
    }
}
