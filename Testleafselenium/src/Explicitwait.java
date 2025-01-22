import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_wait\"]/a")).click();
		//wait for the invisibility of the element
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt95\"]/span")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"j_idt87:growl_container\"]/div/div/div[2]/span")));
	driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt96\"]/span")).click();
	//wait until element text change
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt98\"]/span")).click();
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"j_idt87:j_idt99\"]/span"), "Did you notice?"));
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt99\"]/span")).click();
	}
	

}
