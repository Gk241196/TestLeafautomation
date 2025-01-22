package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	
	@BeforeTest
	public void skiptest2()

	{
		System.out.println("Amazon opened");
		
		
	}
	@Test
	public void Facebook()
	{
		System.out.println("Flipkart opened");
	}
}
