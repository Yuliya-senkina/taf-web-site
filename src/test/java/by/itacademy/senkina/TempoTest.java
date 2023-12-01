package by.itacademy.senkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TempoTest extends BaseTest {

    @Test
    public void testTempoTest() throws InterruptedException {
        driver.get("https://www.pizzatempo.by/");
        TempoPage tempoPage = new TempoPage(driver);
        tempoPage.clickInputButtonPizza();
        Thread.sleep(1000);
        tempoPage.clickInputButtonOrder();
        Thread.sleep(1000);
        tempoPage.clickInputButtonOrderPopup();
        Thread.sleep(1000);
        tempoPage.clickInputButtonBasket();
        Thread.sleep(1000);
        Assertions.assertEquals("Пицца \"Маргарита\" (21см)", tempoPage.getTextNamePizza());
        finish();
    }
}
