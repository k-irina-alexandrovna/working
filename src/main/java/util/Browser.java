package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Browser {

    public Browser(){}

    public static ChromeDriver initiatingDefaultDriver(){
        return initiatingChromeDriver();
    }

    public static SafariDriver initiatingSafariDriver(){
        System.setProperty("webdriver.safari.driver", "src/main/driver/SafariDriver.safariextz");
        return new SafariDriver();
    }

    public static ChromeDriver initiatingChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver");
        return new ChromeDriver();
    }
}
