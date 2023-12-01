package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebSite21VekTest extends BaseTest {

    @Test
    public void test21VekFieldsEmpty() throws InterruptedException {
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21(driver);
        vek21.clickButtonAccept();
        vek21.clickButtonAccount();
        vek21.clickButtonInput();
        Thread.sleep(1000);
        vek21.clickButtonInputLoginForm();
        String actualLogin = vek21.getTextErrorLogin();
        Assertions.assertEquals("Электронная почта не указана", actualLogin);
        String actualPassword = vek21.getTextErrorPassword();
        Assertions.assertEquals("Пароль не указан", actualPassword);
    }

    @Test
    public void test21VekFieldsPasswordEmpty() throws InterruptedException {
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21(driver);
        WebElement buttonAccept = driver.findElement(By.xpath(vek21.buttonAccept));
        buttonAccept.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek21.buttonAccount));
        buttonAccount.click();
        WebElement buttonInput = driver.findElement(By.xpath(vek21.buttonInput));
        buttonInput.click();
        Thread.sleep(1000);
        WebElement inputTextEmail = driver.findElement(By.xpath(vek21.inputTextEmail));
        inputTextEmail.sendKeys("mail@mail.ru");
        WebElement ButtonInputLoginForm = driver.findElement(By.xpath(vek21.ButtonInputLoginForm));
        ButtonInputLoginForm.click();
        Thread.sleep(1000);
        WebElement errorMessagePassword = driver.findElement(By.xpath(vek21.textErrorPassword));
        String actualPassword = errorMessagePassword.getText();
        Assertions.assertEquals("Пароль не указан", actualPassword);
    }

    @Test
    public void test21VekFieldsEmailEmpty() throws InterruptedException {
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21(driver);
        WebElement buttonAccept = driver.findElement(By.xpath(vek21.buttonAccept));
        buttonAccept.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek21.buttonAccount));
        buttonAccount.click();
        WebElement buttonInput = driver.findElement(By.xpath(vek21.buttonInput));
        buttonInput.click();
        Thread.sleep(1000);
        WebElement inputTextPassword = driver.findElement(By.xpath(vek21.inputTextPassword));
        inputTextPassword.sendKeys("123");
        WebElement ButtonInputLoginForm = driver.findElement(By.xpath(vek21.ButtonInputLoginForm));
        ButtonInputLoginForm.click();
        WebElement errorMessageLogin = driver.findElement(By.xpath(vek21.textErrorLogin));
        String actualLogin = errorMessageLogin.getText();
        Assertions.assertEquals("Электронная почта не указана", actualLogin);
    }

    @Test
    public void test21Vek() throws InterruptedException {
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21(driver);
        WebElement buttonAccept = driver.findElement(By.xpath(vek21.buttonAccept));
        buttonAccept.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek21.buttonAccount));
        buttonAccount.click();
        WebElement buttonInput = driver.findElement(By.xpath(vek21.buttonInput));
        buttonInput.click();
        Thread.sleep(1000);
        WebElement inputTextEmail = driver.findElement(By.xpath(vek21.inputTextEmail));
        inputTextEmail.sendKeys("mail@mail.ru");
        WebElement inputTextPassword = driver.findElement(By.xpath(vek21.inputTextPassword));
        inputTextPassword.sendKeys("123");
        WebElement ButtonInputLoginForm = driver.findElement(By.xpath(vek21.ButtonInputLoginForm));
        ButtonInputLoginForm.click();
        Thread.sleep(1000);
        WebElement errorMessagePassword = driver.findElement(By.xpath(vek21.textErrorPassword));
        String actualPassword = errorMessagePassword.getText();
        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?", actualPassword);
    }
}
