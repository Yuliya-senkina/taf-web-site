package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vek21 {
    public String buttonAccept = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[3]";
    public String buttonAccount = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button";
    public String buttonInput = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button";
    public String inputTextEmail = "//*[@id=\"login-email\"]";
    public String inputTextPassword = "//*[@id=\"login-password\"]";
    public String ButtonInputLoginForm = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button";
    public String textErrorLogin = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    public String textErrorPassword = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    WebDriver driver;

    public Vek21(WebDriver driver) {

        this.driver = driver;
    }

    public void clickButtonAccept() {
        driver.findElement(By.xpath(buttonAccept)).click();
    }

    public void clickButtonAccount() {
        driver.findElement(By.xpath(buttonAccount)).click();
    }

    public void clickButtonInput() {
        driver.findElement(By.xpath(buttonInput)).click();
    }

    public void clickButtonInputLoginForm() {
        driver.findElement(By.xpath(ButtonInputLoginForm)).click();
    }

    public String getTextErrorLogin() {
        return driver.findElement(By.xpath(textErrorLogin)).getText();
    }

    public String getTextErrorPassword() {
        return driver.findElement(By.xpath(textErrorPassword)).getText();
    }
}
