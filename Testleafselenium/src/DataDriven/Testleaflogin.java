package DataDriven;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testleaflogin {

	    WebDriver driver;
	    
	    @BeforeClass
	    public void setUp() {
	    	driver = new ChromeDriver();
	        System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	        
	        driver.manage().window().maximize();
	    }

	    @DataProvider(name="logindata")
	    public Object[][] logindata() {
	        return new Object[][] {
	            {"practice", "SuperSecretPassword!"},
	            {"practice1", "SuperSecretPassword!"},
	            {"practice", "SuperSecretPassword!1"},
	            {"practice1", "SuperSecretPassword!"}
	        };
	    }

	    @Test(dataProvider="logindata")
	    public void login(String uname, String pwd) {
	        driver.get("https://practice.expandtesting.com/login");
	        
	        WebElement username = driver.findElement(By.id("username"));
	        username.sendKeys(uname);
	        
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys(pwd);
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login']/button")));
	        
	        Actions actions = new Actions(driver);
	        actions.moveToElement(loginButton).click().perform();
	        driver.findElement(By.linkText("Logout")).click();
	    }
	}



		
