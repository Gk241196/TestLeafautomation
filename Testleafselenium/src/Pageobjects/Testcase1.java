package Pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1
{   
	//long time=System.currentTimeMillis();
@Test
	public void Driver()
	{
		 
	 	System.out.println("TesNG Execution Started");
	}


@Test
public void Alert() 
{

    WebDriver driver1=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
	driver1.get("https://www.leafground.com");
	driver1.manage().window().maximize();
	driver1.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
	driver1.findElement(By.xpath("//*[@id=\"menuform:m_overlay\"]/a")).click();
	driver1.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
}
@Test(priority=3,enabled=true)
public void Alert2()
{
	System.out.println("TestNG worked Completed");
}
/*@Test(priority=3)
public void skiptest1()
{
		String a ="Skip Test";
		if(a.equals("Skip Test")){
			throw new SkipException("Skipping - This is not ready for testing ");
		}else{
		System.out.println("I am in else condition");	
		}
		System.out.println("I am out of the if else condition");
	}*/
@Test(enabled=true)
public void skiptest2()

{
	System.out.println("Skipped test case using enabled method");
	
}
/*@Test(dependsOnMethods="Alert")
public void Dependencies()
{
	System.out.println("Dependencies executed");


long endtime=System.currentTimeMillis();
long total=time-endtime;
System.out.println("total");
}*/

}


