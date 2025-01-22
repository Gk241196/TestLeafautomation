package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelexecution {
	
	@Test
	public void Amazon() {
		     WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.get("https://www.amazon.com");
			//driver.quit();
	}
	@Test
	public void Flipkart() {
		 WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.get("https://www.flipkart.com");
			//driver.quit();
	}
	@Test
	public void Facebook() {
		 WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.get("https://www.facebook.com");
			//driver.quit();
	}

}
