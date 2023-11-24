package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassRwTest {

    @Test
    public void testPassRwFieldsEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRw passRw = new PassRw(driver);
        Thread.sleep(1000);
        passRw.clickInputButtonClose();
        Thread.sleep(1000);
        passRw.clickInputButtonPersonalArea();
        Thread.sleep(1000);
        passRw.clickInputButton();
        Thread.sleep(1000);
        Assertions.assertEquals("Заполните поле", passRw.getTextErrorLogin());
        Assertions.assertEquals("Заполните поле", passRw.getTextErrorPassword());
        driver.quit();
    }

    @Test
    public void testPassRwNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRw passRw = new PassRw(driver);
        Thread.sleep(1000);
        passRw.clickInputButtonClose();
        Thread.sleep(1000);
        passRw.clickInputButtonPersonalArea();
        Thread.sleep(1000);
        passRw.sendKeysInputTextEmail("juliya@mail.ru");
        passRw.sendKeysInputTextPassword("123");
        passRw.clickInputButton();
        Thread.sleep(1000);
        Assertions.assertEquals("Пользователь не найден", passRw.getTextErrorMain());
        driver.quit();
    }

    @Test
    public void testPassRwPasswordEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRw passRw = new PassRw(driver);
        Thread.sleep(1000);
        passRw.clickInputButtonClose();
        Thread.sleep(1000);
        passRw.clickInputButtonPersonalArea();
        Thread.sleep(1000);
        passRw.sendKeysInputTextEmail("juliya@mail.ru");
        passRw.clickInputButton();
        Thread.sleep(1000);
        Assertions.assertEquals("Заполните поле", passRw.getTextErrorPassword());
        driver.quit();
    }

    @Test
    public void testPassRwEmailEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRw passRw = new PassRw(driver);
        Thread.sleep(1000);
        passRw.clickInputButtonClose();
        Thread.sleep(1000);
        passRw.clickInputButtonPersonalArea();
        Thread.sleep(1000);
        passRw.sendKeysInputTextPassword("123");
        passRw.clickInputButton();
        Thread.sleep(1000);
        Assertions.assertEquals("Заполните поле", passRw.getTextErrorLogin());
        driver.quit();
    }
}
