package by.itacademy.senkina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kvitki {
    public String inputButtonAccept = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    public String inputButtonClose = "/html/body/div[7]/div";
    public String inputButton = "/html/body/div[3]/div[2]/div/app-user-account-link";
    public String inputTextEmail = "/html/body/div[9]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div/input";
    public String inputTextPassword = "/html/body/div[9]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div/input";
    public String inputButtonForm = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-ui-button/button";
    public String textErrorEmail = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    public String textErrorPassword = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error/app-collapsible";
    public String textErrorMain = "/html/body/div[9]/div[4]/div/mat-dialog-container/div/div/app-info-dialog-content/div[3]";
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
