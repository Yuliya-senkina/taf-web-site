package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSite21VekTest {

    @Test
    public void test21VekFieldsEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21();
        WebElement buttonAccept = driver.findElement(By.xpath(vek21.buttonAccept));
        buttonAccept.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek21.buttonAccount));
        buttonAccount.click();
        WebElement buttonInput = driver.findElement(By.xpath(vek21.buttonInput));
        buttonInput.click();
        Thread.sleep(1000);
        WebElement ButtonInputLoginForm = driver.findElement(By.xpath(vek21.ButtonInputLoginForm));
        ButtonInputLoginForm.click();
        Thread.sleep(1000);
        WebElement errorMessageLogin = driver.findElement(By.xpath(vek21.textErrorLogin));
        String actualLogin = errorMessageLogin.getText();
        Assertions.assertEquals("Электронная почта не указана", actualLogin);
        WebElement errorMessagePassword = driver.findElement(By.xpath(vek21.textErrorPassword));
        String actualPassword = errorMessagePassword.getText();
        Assertions.assertEquals("Пароль не указан", actualPassword);
        driver.quit();
    }

    @Test
    public void test21VekFieldsPasswordEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21();
        WebElement buttonAccept = driver.findElement(By.xpath(vek21.buttonAccept));
        buttonAccept.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek21.buttonAccount));
        buttonAccount.click();
        Thread.sleep(1000);
        WebElement buttonInput = driver.findElement(By.xpath(vek21.buttonInput));
        buttonInput.click();
        Thread.sleep(1000);
        WebElement inputTextEmail = driver.findElement(By.xpath(vek21.inputTextEmail));
        inputTextEmail.sendKeys("mail@mail.ru");
        Thread.sleep(1000);
        WebElement ButtonInputLoginForm = driver.findElement(By.xpath(vek21.ButtonInputLoginForm));
        ButtonInputLoginForm.click();
        Thread.sleep(1000);
        WebElement errorMessagePassword = driver.findElement(By.xpath(vek21.textErrorPassword));
        String actualPassword = errorMessagePassword.getText();
        Assertions.assertEquals("Пароль не указан", actualPassword);
        driver.quit();
    }

    @Test
    public void test21VekFieldsEmailEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21();
        WebElement buttonAccept = driver.findElement(By.xpath(vek21.buttonAccept));
        buttonAccept.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek21.buttonAccount));
        buttonAccount.click();
        Thread.sleep(1000);
        WebElement buttonInput = driver.findElement(By.xpath(vek21.buttonInput));
        buttonInput.click();
        Thread.sleep(1000);
        WebElement inputTextPassword = driver.findElement(By.xpath(vek21.inputTextPassword));
        inputTextPassword.sendKeys("123");
        Thread.sleep(1000);
        WebElement ButtonInputLoginForm = driver.findElement(By.xpath(vek21.ButtonInputLoginForm));
        ButtonInputLoginForm.click();
        Thread.sleep(1000);
        WebElement errorMessageLogin = driver.findElement(By.xpath(vek21.textErrorLogin));
        String actualLogin = errorMessageLogin.getText();
        Assertions.assertEquals("Электронная почта не указана", actualLogin);
        driver.quit();
    }

    @Test
    public void test21Vek() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek21 vek21 = new Vek21();
        WebElement buttonAccept = driver.findElement(By.xpath(vek21.buttonAccept));
        buttonAccept.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek21.buttonAccount));
        buttonAccount.click();
        Thread.sleep(1000);
        WebElement buttonInput = driver.findElement(By.xpath(vek21.buttonInput));
        buttonInput.click();
        Thread.sleep(1000);
        WebElement inputTextEmail = driver.findElement(By.xpath(vek21.inputTextEmail));
        inputTextEmail.sendKeys("mail@mail.ru");
        WebElement inputTextPassword = driver.findElement(By.xpath(vek21.inputTextPassword));
        inputTextPassword.sendKeys("123");
        Thread.sleep(1000);
        WebElement ButtonInputLoginForm = driver.findElement(By.xpath(vek21.ButtonInputLoginForm));
        ButtonInputLoginForm.click();
        Thread.sleep(1000);
        WebElement errorMessagePassword = driver.findElement(By.xpath(vek21.textErrorPassword));
        String actualPassword = errorMessagePassword.getText();
        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?", actualPassword);
        driver.quit();
    }
}
