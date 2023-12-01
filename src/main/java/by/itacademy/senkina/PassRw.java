package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassRw {
    public String buttonClose = "//button[@class='close close--black']";
    public String inputButtonPersonalArea = "//li[@class='item_1 cabinet']";
    public String inputTextEmail = "//input[@name='login']";
    public String inputTextPassword = "//input[@type='password']";
    public String inputButton = "//input[@class='btn btn-index btn_submit']";
    public String textErrorLogin = "//label[@id='login-error']";
    public String textErrorPassword = "//label[@id='password-error']";
    public String textErrorMain = "//div[@class='danger standalone']";
    WebDriver driver;

    public PassRw(WebDriver driver) {

        this.driver = driver;
    }

    public void clickInputButtonClose() {

        driver.findElement(By.xpath(buttonClose)).click();
    }

    public void clickInputButtonPersonalArea() {

        driver.findElement(By.xpath(inputButtonPersonalArea)).click();
    }

    public void sendKeysInputTextEmail(String email) {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(email);
    }

    public void sendKeysInputTextPassword(String email) {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(email);
    }

    public void clickInputButton() {

        driver.findElement(By.xpath(inputButton)).click();
    }

    public String getTextErrorLogin() {

        return driver.findElement(By.xpath(textErrorLogin)).getText();
    }

    public String getTextErrorMain() {

        return driver.findElement(By.xpath(textErrorMain)).getText();
    }

    public String getTextErrorPassword() {

        return driver.findElement(By.xpath(textErrorPassword)).getText();
    }
}
