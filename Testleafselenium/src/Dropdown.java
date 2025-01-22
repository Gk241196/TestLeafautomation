import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		//select by value
		WebElement dropdown1=driver.findElement(By.id("dropdown"));
		Select listdropdown1=new Select(dropdown1);
		listdropdown1.selectByValue("1");
		//select by text
		WebElement dropdown2=driver.findElement(By.id("elementsPerPageSelect"));
		Select listdropdown2=new Select(dropdown2);
		listdropdown2.selectByIndex(2);
		//Select by visible text and printing  drop-down values
		WebElement dropdown3=driver.findElement(By.id("country"));
		Select listdropdown3=new Select(dropdown3);
		listdropdown3.selectByVisibleText("India");
		List<WebElement> obj=listdropdown3.getOptions();
		int size=obj.size();
		System.out.println("List of drop-down values are " +size);
		for(WebElement Ele:obj)
		{
			String value=Ele.getText();
			System.out.println("Dropdown values are "+value);
		}
	}
}

		
		
		



