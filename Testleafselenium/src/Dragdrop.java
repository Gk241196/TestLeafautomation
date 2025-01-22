import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.get("https://www.leafground.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menuform:m_drag\"]/a")).click();
			//drag and drop the box
			WebElement From=driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));
			WebElement To=driver.findElement(By.id("form:drop_header"));
			Actions drag=new Actions(driver);
			drag.dragAndDrop(From, To).build().perform();

	}

}
