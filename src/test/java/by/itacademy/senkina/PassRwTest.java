package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassRwTest extends BaseTest {

    @Test
    public void testPassRwFieldsEmpty() throws InterruptedException {
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
    }

    @Test
    public void testPassRwNotExist() throws InterruptedException {
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
    }

    @Test
    public void testPassRwPasswordEmpty() throws InterruptedException {
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
    }

    @Test
    public void testPassRwEmailEmpty() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        PassRw passRw = new PassRw(driver);
        Thread.sleep(1000);
        passRw.clickInputButtonClose();
        passRw.clickInputButtonPersonalArea();
        Thread.sleep(1000);
        passRw.sendKeysInputTextPassword("123");
        passRw.clickInputButton();
        Assertions.assertEquals("Заполните поле", passRw.getTextErrorLogin());
    }
}
