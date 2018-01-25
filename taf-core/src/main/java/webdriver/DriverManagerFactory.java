package webdriver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {
        DriverManager manager;
        switch (type) {
            case CHROME:
                manager = new ChromeDriverManager();
                break;
            default:
                manager = new ChromeDriverManager();
                break;
        }
        return manager;
    }
}
