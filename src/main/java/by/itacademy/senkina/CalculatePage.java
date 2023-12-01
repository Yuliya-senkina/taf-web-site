package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatePage {

    private final String buttonCalculate = "//input[@type='submit']";
    private final WebDriver driver;

    public CalculatePage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickButtonCalculate() {

        driver.findElement(By.xpath(buttonCalculate)).click();
    }

}
