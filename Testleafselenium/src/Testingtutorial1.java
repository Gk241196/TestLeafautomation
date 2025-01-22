import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.List;
public class Testingtutorial1 {
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.get("https://www.softwaretestingmaterial.com/selenium-tutorial/");
			driver.manage().window().maximize();
			driver.findElement(By.name("cp_close_image-2")).click();
			Thread.sleep(2000);
			//driver.findElement(By.linkText("Knowledge on Manual Testing Concepts")).click();
			driver.findElement(By.linkText("Knowledge on Manual Testing Concepts")).click();
			String obj1 = driver.getCurrentUrl();
			String obj2=driver.getTitle();
			System.out.println("The current URL is" +obj1);
			System.out.println("The title is"+obj2);
	
		}	   

}
