import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ShadowDOM {
	    public static void main(String[] args) {
	          WebDriver driver;
	          driver = new ChromeDriver();
	          driver.get("https://practice.expandtesting.com/shadowdom");
              driver.manage().window().maximize();
	            // Locate the Shadow Host
	             WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-host"));

	            // Use JavaScriptExecutor to access the shadow root
	            JavascriptExecutor js = (JavascriptExecutor) driver;

	            Object shadowRoot = js.executeScript("return arguments[0].shadowRoot;", shadowHost);

	            // Locate the button inside the shadow root using JavaScript
	            WebElement shadowButton = (WebElement) js.executeScript(
	                    "return arguments[0].querySelector('button#my-btn');", shadowRoot);

	            // Perform actions on the button
	            System.out.println("Button Text: " + shadowButton.getText());
	       
	        }
	    
	}



