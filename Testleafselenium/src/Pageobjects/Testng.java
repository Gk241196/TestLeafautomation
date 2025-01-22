package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng {
   WebDriver driver;
   long starttime;
   long endtime;
	@BeforeSuite
	public void beforesuite()
	{
		starttime=System.currentTimeMillis();
	    driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		
}
	@Test(priority=1)
	public void Amazon()
	{
		driver.get("https://www.amazon.com");
	}
	@Test(priority=2)
	public void flipkart()
	{
		driver.get("https://www.flipkart.com");
	}
	@AfterSuite
	public void aftersuite()
	{
		driver.quit();
	    endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println(starttime);
		System.out.println(endtime);
		System.out.println(totaltime);
	}
}