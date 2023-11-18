package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzTest {

    @Test
    public void testOzUserNotExist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage oz = new OzPage(driver);
        oz.clickInputButtonMain();
        Thread.sleep(1000);
        oz.clickTabLinkEmail();
        Thread.sleep(1000);
        oz.sendKeysInputTextEmail("juliya@mail.ru");
        oz.sendKeysInputTextPassword("123");
        oz.clickInputButtonForm();
        Thread.sleep(1000);
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться",  oz.getTextError());
        driver.quit();
    }

    @Test
    public void testOzTextEnter() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage oz = new OzPage(driver);
        WebElement inputButtonMain = driver.findElement(By.xpath(oz.inputButtonMain));
        inputButtonMain.click();
        Thread.sleep(1000);
        WebElement textEnter = driver.findElement(By.xpath(oz.textEnter));
        String actualEnter = textEnter.getText();
        Assertions.assertEquals("Вход", actualEnter);
        driver.quit();
    }


}
