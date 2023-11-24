package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassRw {
    public String ButtonClose = "//*[@id=\"notification-popup\"]/div/div/div[1]/button";
    public String inputButtonPersonalArea = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]";
    public String inputTextEmail = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    public String inputTextPassword = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
    public String inputButton = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    public String textErrorLogin = "//*[@id=\"login-error\"]";
    public String textErrorPassword = "//*[@id=\"password-error\"]";
    public String textErrorMain = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
    WebDriver driver;

    public PassRw(WebDriver driver) {

        this.driver = driver;
    }

    public void clickInputButtonClose() {

        driver.findElement(By.xpath(ButtonClose)).click();
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
