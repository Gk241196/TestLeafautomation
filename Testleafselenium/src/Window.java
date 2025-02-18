import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a")).click();
		
		String parentWindow = driver.getWindowHandle();
		openNewWindow(driver);
		closeAllWindowsExceptParent(driver, parentWindow);
		
		driver.quit();
	}

	private static void openNewWindow(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span")).click();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}
	}

	private static void closeAllWindowsExceptParent(WebDriver driver, String parentWindow) throws InterruptedException {
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		WebElement multipleWindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		multipleWindows.click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Windows size is " + windows.size());
		for (String window : windows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				driver.close();
			}
		}
	}
}
