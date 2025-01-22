import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a")).click();
		//open new window
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span")).click();
		Set <String> obj=driver.getWindowHandles();
		for (String newwindow : obj) {
			driver.switchTo().window(newwindow);
		}
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input")).click();
		//driver.close();
		//driver.switchTo().defaultContent();
		//Multiple windows open and close
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		WebElement multiplewindows=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		multiplewindows.click();
		int windowsize=driver.getWindowHandles().size();
		System.out.println("windows size is "+windowsize);
		Set<String> obj2=driver.getWindowHandles();
		for (String newwindows : obj2) {
			if(!newwindows.equals(parentwindow)){
				driver.switchTo().window(newwindows); 
				driver.close();	
			}
		}	
	}
}
