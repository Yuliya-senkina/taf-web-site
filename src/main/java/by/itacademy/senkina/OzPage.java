package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzPage {
    public String inputButtonMain = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]";
    public String tabLinkEmail = "//*[@id=\"loginPopup\"]/div[1]/div[2]/ul/li[1]";
    public String inputTextEmail = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    public String inputTextPassword = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
    public String inputButtonForm = "//*[@id=\"loginForm\"]/button";
    public String textError = "//*[@id=\"test\"]/div/div";
    public String textEnter = "//*[@id=\"loginPopupIntro\"]";
    WebDriver driver;

    public OzPage(WebDriver diver) {

        this.driver = driver;
    }

    public void clickInputButtonMain() {

        driver.findElement(By.xpath(inputButtonMain)).click();
    }

    public void clickTabLinkEmail() {

        driver.findElement(By.xpath(tabLinkEmail)).click();
    }

    public void sendKeysInputTextEmail(String newemail) {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(newemail);
    }

    public void sendKeysInputTextPassword(String newpassword) {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(newpassword);
    }

    public void clickInputButtonForm() {

        driver.findElement(By.xpath(inputButtonForm)).click();
    }

    public String getTextError() {

        return driver.findElement(By.xpath(textError)).getText();
    }
}
