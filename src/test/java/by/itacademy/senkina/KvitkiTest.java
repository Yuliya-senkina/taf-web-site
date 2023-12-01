package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KvitkiTest extends BaseTest {

    @Test
    public void testKvitkiFieldsEmpty() throws InterruptedException {
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki(driver);
        kvitki.clickinputButtonAccept();
        kvitki.clickinputButtonClose();
        kvitki.clickInputButton();
        Thread.sleep(1000);
        kvitki.sendKeysInputTextEmail("");
        kvitki.sendKeysInputTextPassword("");
        kvitki.clickInputButtonForm();
        Thread.sleep(1000);
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitki.getTextErrorLogin());
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitki.getTextErrorPassword());
    }

    @Test
    public void testKvitkiEmailPasswordClick() throws InterruptedException {
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki(driver);
        kvitki.clickinputButtonAccept();
        kvitki.clickinputButtonClose();
        kvitki.clickInputButton();
        Thread.sleep(1000);
        kvitki.sendKeysInputTextEmail("");
        kvitki.sendKeysInputTextPassword("");
        Thread.sleep(1000);
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitki.getTextErrorLogin());
    }

    @Test
    public void testKvitkiPasswordEmailClick() throws InterruptedException {
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki(driver);
        kvitki.clickinputButtonAccept();
        kvitki.clickinputButtonClose();
        kvitki.clickInputButton();
        Thread.sleep(1000);
        kvitki.sendKeysInputTextPassword("");
        kvitki.sendKeysInputTextEmail("");
        Thread.sleep(1000);
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitki.getTextErrorPassword());
    }

    @Test
    public void testKvitkiIncorrectEmail() throws InterruptedException {
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki(driver);
        kvitki.clickinputButtonAccept();
        kvitki.clickinputButtonClose();
        kvitki.clickInputButton();
        Thread.sleep(1000);
        kvitki.sendKeysInputTextEmail("123");
        kvitki.sendKeysInputTextPassword("");
        Thread.sleep(1000);
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitki.getTextErrorLogin());
    }

    @Test
    public void testKvitkiNotExistUser() throws InterruptedException {
        driver.get("https://www.kvitki.by/");
        Kvitki kvitki = new Kvitki(driver);
        kvitki.clickinputButtonAccept();
        kvitki.clickinputButtonClose();
        kvitki.clickInputButton();
        Thread.sleep(1000);
        kvitki.sendKeysInputTextEmail("juli.ya92@mail.ru");
        kvitki.sendKeysInputTextPassword("123");
        kvitki.clickInputButtonForm();
        Thread.sleep(2000);
        Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitki.getTextErrorMain());
    }
}
