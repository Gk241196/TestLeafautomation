import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) 
	{
		
			WebDriver driver=new ChromeDriver();
			
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.leafground.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"menuform:m_wait\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt90\"]/span")).click();

	}

}
