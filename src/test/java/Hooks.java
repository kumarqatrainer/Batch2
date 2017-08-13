import com.openDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    com.openDriver driver = new openDriver();

    @Before
    public void openBrowser() {
        //open a browser
        driver.browser();
    }


    @After
    public void closeBrowser() {
        //quit browser
        driver.quitBrowsre();
    }
}
