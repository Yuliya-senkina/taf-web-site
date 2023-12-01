package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kvitki {
    public String inputButtonAccept = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    public String inputButtonClose = "//div[@class=\"popupbanner_close\"]";
    public String inputButton = "//app-user-account-link";
    public String inputTextEmail = "//input[@type=\"email\"]";
    public String inputTextPassword = "//input[@type=\"password\"]";
    public String inputButtonForm = "//button[@class=\"ng-tns-c28-4\"]";
    public String textErrorEmail = "//app-collapsible[@class=\"form-field-error ng-tns-c7-8 ng-tns-c6-9 ng-trigger ng-trigger-slideInOut ng-star-inserted\"]";
    public String textErrorPassword = "//mat-tab-body[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error/app-collapsible";
    public String textErrorMain = "//div[@class=\"info-text\"]";
    WebDriver driver;
    public Kvitki(WebDriver driver) {

        this.driver = driver;
    }

    public void clickinputButtonClose() {

        driver.findElement(By.xpath(inputButtonClose)).click();
    }

    public void clickinputButtonAccept() {

        driver.findElement(By.xpath(inputButtonAccept)).click();
    }
    public void clickInputButton() {

        driver.findElement(By.xpath(inputButton)).click();
    }

    public void sendKeysInputTextEmail(String email) {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(email);
    }

    public void sendKeysInputTextPassword(String email) {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(email);
    }

    public void clickInputButtonForm() {

        driver.findElement(By.xpath(inputButtonForm)).click();
    }

    public String getTextErrorLogin() {

        return driver.findElement(By.xpath(textErrorEmail)).getText();
    }

    public String getTextErrorPassword() {

        return driver.findElement(By.xpath(textErrorPassword)).getText();
    }

    public String getTextErrorMain() {

        return driver.findElement(By.xpath(textErrorMain)).getText();
    }
}
