	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.time.Duration;
	public class Javascriptexecutor {
	    public static void main(String[] args) {
	        // Set up WebDriver
	        WebDriver driver;
	            // Load the Testleaf webpage
	            driver = new ChromeDriver();
	            driver.get("https://www.leafground.com");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
				driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
	            // Locate the textarea element
	            WebElement textArea = driver.findElement(By.id("j_idt88:j_idt101")); 
	            // Scroll to the element
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].scrollIntoView(true);", textArea);
	            // Enter text into the textarea
	            js.executeScript("arguments[0].value='This is a test text';", textArea);
	            //scroll to top of the page
	            js.executeScript("window.scrollTo(0, 0);");
	            //scroll to bottom of the page
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    }
	}





