package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class PageFactory {

    private static String defaultUrl = "https://www.google.com";

    public static void goToPage(WebDriver driver, String url){

        url = (url != null) ? url : defaultUrl;
        driver = (driver != null) ? driver : util.Browser.initiatingDefaultDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //Applied wait time
        driver.manage().window().maximize();    //maximize window

        driver.get(url);    //open browser with desried URL

        Util.sleep(3000);

        driver.close();     //closing the browser
    }

}
