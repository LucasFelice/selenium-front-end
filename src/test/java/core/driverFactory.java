package core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class driverFactory {

    public static WebDriver driver;
    public Properties property;
    String userDir = System.getProperty("user.dir");

    public WebDriver initDriver() throws IOException {
        property = new Properties();
        FileInputStream fInputStream = new FileInputStream(userDir + "\\src\\test\\resources\\config.properties");
        property.load(fInputStream);
        String browser = property.getProperty("browser").toLowerCase();

        switch (browser) {

            case "chrome":
                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                System.setProperty("webdriver.chrome.driver", "\\Windows\\chromedriver.exe");

                ChromeOptions options = new ChromeOptions();

                HashMap<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("profile.default_content_setting_values.geolocation", 2);
                options.setExperimentalOption("prefs", prefs);

                options.addArguments("--start-maximized");
                options.addArguments("user-agent=mrbean");

                driver = new ChromeDriver(options);
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "\\Windows\\geckodriver.exe");

                FirefoxOptions fireOpt = new FirefoxOptions();
                fireOpt.addArguments("--start-maximized");
                fireOpt.addArguments("user-agent=mrbean");

                driver = new FirefoxDriver(fireOpt);
                break;

            default:
                throw new NotFoundException("Navegador inválido. Por favor, escolher um browser válido");
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;

    }
}