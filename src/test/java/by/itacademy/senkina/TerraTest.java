package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TerraTest extends BaseTest {

    @Test
    public void testTerraTest() throws InterruptedException {
        driver.get("https://terrapizza.by/");
        TerraPage terraPage = new TerraPage(driver);
        terraPage.clickInputButtonClose();
        terraPage.clickInputButtonPizza();
        terraPage.clickInputButtonInBasket();
        terraPage.clickInputButtonBar();
        terraPage.clickInputButtonAddDrink();
        terraPage.clickInputButtonBasket();
        Thread.sleep(1000);
        Assertions.assertEquals("Пицца Маргарита на тонком 32 см", terraPage.getTextNamePizza());
        Assertions.assertEquals("Облепиховый чай", terraPage.getTextNameDrink());
    }
}
