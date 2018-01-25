package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;

public class ChromeDriverManager extends DriverManager {

    private static final String PATH = "D:\\Workspace\\TAF\\chromedriver.exe";

    private DriverService service;

    @Override
    protected void createDriver() {
        driver = new ChromeDriver((ChromeDriverService) service);
    }

    @Override
    protected void startService() {
        if (service == null) {
            try {
                service = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(PATH))
                        .usingAnyFreePort()
                        .build();
                service.start();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    protected void stopService() {
        if (service != null && service.isRunning()) {
            service.stop();
        }
    }
}
