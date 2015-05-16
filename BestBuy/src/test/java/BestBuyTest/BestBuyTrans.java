package BestBuyTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BestBuyTrans {
    public WebDriver driver;
    public String baseUrl;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.bestbuy.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testBestBuyTrans() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("gh-search-input")).click();
        driver.findElement(By.id("gh-search-input")).clear();
        driver.findElement(By.id("gh-search-input")).sendKeys("apple tv");
        driver.findElement(By.cssSelector("button.search-button")).click();
        driver.findElement(By.cssSelector("span.ficon-cart")).click();
        driver.findElement(By.linkText("No, thanks. Go to cart ›")).click();
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.id("TxtEmailId")).clear();
        driver.findElement(By.id("TxtEmailId")).sendKeys("marvinarbaiza@gmail.com");
        driver.findElement(By.id("PwdPasswordId")).clear();
        driver.findElement(By.id("PwdPasswordId")).sendKeys("Audriana1103");
        driver.findElement(By.id("SigninBTN")).click();
        //driver.findElement(By.linkText("Place Order")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}