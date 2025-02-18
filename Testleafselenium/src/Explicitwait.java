import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_wait\"]/a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//wait for the invisibility of the element
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt95\"]/span")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"j_idt87:growl_container\"]/div/div/div[2]/span")));
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt96\"]/span")).click();
		
		//wait until element text change
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt98\"]/span")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"j_idt87:j_idt99\"]/span"), "Did you notice?"));
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt99\"]/span")).click();
		
		driver.quit();
	}
}
