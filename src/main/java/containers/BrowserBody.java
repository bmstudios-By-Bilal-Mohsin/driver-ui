package containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserBody {

    @FindBy(css = "[title='Search']")
    public WebElement searchGoogle;
}
