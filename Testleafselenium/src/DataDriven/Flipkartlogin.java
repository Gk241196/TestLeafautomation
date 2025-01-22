package DataDriven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Flipkartlogin {

	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    driver.navigate().forward();
    Set obj1=driver.getWindowHandles();
    System.out.println(obj1);
    Set obj2=driver.getWindowHandles();
    System.out.println(obj2);
    Set obj3=driver.manage().getCookies();
    System.out.println(obj3);
    
    
    
	}
}
