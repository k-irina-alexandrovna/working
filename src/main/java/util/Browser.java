package util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {

    public static ChromeDriver initiatingDefaultDriver(){
        return initiatingChromeDriver();
    }

    public static SafariDriver initiatingSafariDriver(){
        setProperty(BrowserName.SAFARI);
        return new SafariDriver();
    }

    public static ChromeDriver initiatingChromeDriver(){
        setProperty(BrowserName.CHROME);
        return new ChromeDriver();
    }

    private static void setProperty(BrowserName browser){
        switch (browser){
            case SAFARI:
                System.setProperty("webdriver.safari.driver", "src/main/driver/SafariDriver.safariextz");
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver");
        }

    }
}
