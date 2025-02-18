import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		
		selectDropdownByValue(driver, By.id("dropdown"), "1");
		selectDropdownByIndex(driver, By.id("elementsPerPageSelect"), 2);
		selectDropdownByVisibleText(driver, By.id("country"), "India");
		printDropdownValues(driver, By.id("country"));
		
		driver.quit();
	}

	private static void selectDropdownByValue(WebDriver driver, By by, String value) {
		WebElement dropdown = driver.findElement(by);
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}

	private static void selectDropdownByIndex(WebDriver driver, By by, int index) {
		WebElement dropdown = driver.findElement(by);
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}

	private static void selectDropdownByVisibleText(WebDriver driver, By by, String text) {
		WebElement dropdown = driver.findElement(by);
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}

	private static void printDropdownValues(WebDriver driver, By by) {
		WebElement dropdown = driver.findElement(by);
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		System.out.println("List of drop-down values are " + options.size());
		for (WebElement option : options) {
			System.out.println("Dropdown values are " + option.getText());
		}
	}
}







