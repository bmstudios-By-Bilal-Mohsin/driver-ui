package Methods;


import Setup.DriverUI;
import containers.BrowserBody;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowserInitialize {
    public static WebDriver driver = DriverUI.driver;
    BrowserBody browserBodyBody = PageFactory.initElements(driver, BrowserBody.class);
    public void searchGoogle(){

        browserBodyBody.searchGoogle.sendKeys("Hello");
    }
}
