import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import webdriver.DriverManager;
import webdriver.DriverManagerFactory;
import webdriver.DriverType;

public class AbstractTest {

    DriverManager manager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        manager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = manager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        manager.quitDriver();
    }
}
