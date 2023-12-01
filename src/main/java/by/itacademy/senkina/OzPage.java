package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzPage {
    public String inputButtonMain = "//div[@class=\"user-bar__item\"]";
    public String tabLinkEmail = "//li[@class=\"i-nav-tabs__item\"]";
    public String inputTextEmail = "//input[@tabindex=\"1\"]";
    public String inputTextPassword = "//input[@tabindex=\"2\"]";
    public String inputButtonForm = "//button[@role=\"button\"]";
    public String textError = "//div[@class=\"i-popover__main\"]";
    public String textEnter = "//p[@id=\"loginPopupIntro\"]";
    WebDriver driver;

    public OzPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickInputButtonMain() {

        driver.findElement(By.xpath(inputButtonMain)).click();
    }

    public void clickTabLinkEmail() {

        driver.findElement(By.xpath(tabLinkEmail)).click();
    }

    public void sendKeysInputTextEmail(String email) {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(email);
    }

    public void sendKeysInputTextPassword(String password) {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(password);
    }

    public void clickInputButtonForm() {

        driver.findElement(By.xpath(inputButtonForm)).click();
    }

    public String getTextError() {

        return driver.findElement(By.xpath(textError)).getText();
    }
}
