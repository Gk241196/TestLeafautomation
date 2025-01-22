import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		
public class TutorialDropdown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_dropdown\"]/a/span")).click();
		//Find drop-down
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select listdropdown=new Select(dropdown);
		listdropdown.selectByValue("Selenium");
		//listdropdown.selectByIndex(1);
		//listdropdown.selectByVisibleText("Selenium");
		List<WebElement> obj=listdropdown.getOptions();
		//printing  drop-down values
		int size=obj.size();
		System.out.println("List of drop-down values are " +size);
		for(WebElement Ele:obj)
		{
			String value=Ele.getText();
			System.out.println("Dropdown values are "+value);
		}
	}
}
