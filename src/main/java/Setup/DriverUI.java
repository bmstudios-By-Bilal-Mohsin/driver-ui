package Setup;

import containers.Containers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class DriverUI {
    public static final WebDriver driver = new ChromeDriver();

    @Before
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
    }
}
