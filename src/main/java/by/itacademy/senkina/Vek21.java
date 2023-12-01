package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vek21 {
    public String buttonAccept = "//button[@class='Button-module__button Button-module__blue-primary']";
    public String buttonAccount = "//span[@class='userToolsText']";
    public String buttonInput = "//div[@class='userToolsBtnContainer']";
    public String inputTextEmail = "//input[@id='login-email']";
    public String inputTextPassword = "//input[@id='login-password']";
    public String ButtonInputLoginForm = "//button[@class='Button-module__button style_baseActionButton__VyAyj Button-module__blue-primary']";
    public String textErrorLogin = "//span[@class='ErrorMessage-module__message']";
    public String textErrorPassword = "//*[@id='default-:R2mm:-modal']/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
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
