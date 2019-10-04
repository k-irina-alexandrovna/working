import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.PageFactory;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        PageFactory.goToPage(util.Browser.initiatingSafariDriver(), null);



    }
}
