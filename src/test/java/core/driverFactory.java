package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFactory {

    private static WebDriver driver;

    private driverFactory() {};

    public static WebDriver getDriver() {
        if(driver == null) {
            switch (propriedades.BROWSER) {
                case CHROME: driver = new ChromeDriver(); break;
                case FIREFOX: driver = new FirefoxDriver(); break;
            }
            driver.manage().window().maximize();
        }
        return driver;

    }

    public static void killDriver() {
            driver.quit();
    }
}











