import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		//Enter and clear text
		WebElement obj1=driver.findElement(By.id("j_idt88:name"));
		obj1.sendKeys("Ganesh");
		WebElement Textbox=driver.findElement(By.id("j_idt88:j_idt91"));
		Textbox.clear();
		
		//Text box enable or disable check
		WebElement Textbox2=driver.findElement(By.id("j_idt88:j_idt93"));
		boolean disabled=Textbox2.isEnabled();
		System.out.println(disabled);
		
		WebElement Textbox3=driver.findElement(By.id("j_idt106:thisform:age")); 
		boolean enabled2=Textbox3.isEnabled();
		System.out.println(enabled2);
	}

}
