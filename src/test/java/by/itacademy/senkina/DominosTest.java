package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DominosTest extends BaseTest {

    @Test
    public void testDominosTest() throws InterruptedException {
        driver.get("https://dominos.by/");
        DominosPage dominosPage = new DominosPage(driver);
        dominosPage.clickInputButtonClose();
        dominosPage.clickInputButtonPizza();
        dominosPage.clickInputButtonInBasket();
        dominosPage.clickInputButtonBasket();
        Assertions.assertEquals("Маргарита", dominosPage.getTextNamePizza());
    }
}
