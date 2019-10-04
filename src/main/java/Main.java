import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.PageFactory;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        PageFactory.goToPage(util.Browser.initiatingSafariDriver(), null);

//        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver");

//        //Initiating your SafariDriver
//        WebDriver driver = new ChromeDriver();
//        //Applied wait time
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //maximize window
//        driver.manage().window().maximize();
//
//        //open browser with desried URL
//        driver.get("https://www.google.com");
//
//        try{Thread.sleep(5000);}
//        catch (InterruptedException e){}
//        //closing the browser
//        driver.close();


    }
}
