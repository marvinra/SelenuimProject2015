package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marvin on 5/9/2015.
 */
public class BaseApi {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);

    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
}