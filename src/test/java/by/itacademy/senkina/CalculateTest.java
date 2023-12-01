package by.itacademy.senkina;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculateTest extends BaseTest {

    @Test
    public void testCalculateEmptyField() {
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalculatePage calculatePage = new CalculatePage(driver);
        calculatePage.clickButtonCalculate();
    }
}
