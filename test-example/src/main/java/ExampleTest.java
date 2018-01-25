import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ExampleTest extends AbstractTest {

    @Test
    public void buttonSearchTest() {
        driver.get("https://www.google.by");
        List<WebElement> elements = driver.findElements(By.xpath("//input[@name='btnK' and @type='submit']"));
        assertEquals(elements.size(), 1, "There is no button find \"Search\" or amount of button is more than 1");
    }
}
