package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
  WebDriver driver;
    @BeforeTest
    public void browserlaunch() {
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown() {
            driver.quit();
        }
    
}

