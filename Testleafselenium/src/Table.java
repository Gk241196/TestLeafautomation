import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
public class Table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("menuform:j_idt41")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_table\"]/a")).click();
		WebElement table=driver.findElement(By.id("form:j_idt89"));
		List<WebElement> Values=table.findElements(By.tagName("th"));
		for (WebElement webElement : Values) 
		{
			String text=webElement.getText();
			System.out.println(text);
		}
		

	
			
	}

}
