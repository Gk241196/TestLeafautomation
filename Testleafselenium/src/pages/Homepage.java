package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Homepage {

	public class HomePage {
	    private WebDriver driver;

	    // Constructor
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Locators
	    private By alertMenu = By.xpath("//*[@id=\"menuform:j_idt39\"]/a");
	    private By overlaysMenu = By.xpath("//*[@id=\"menuform:m_overlay\"]/a");

	    // Methods
	    public void navigateToAlertSection() {
	        driver.findElement(alertMenu).click();
	        driver.findElement(overlaysMenu).click();
	    }
	}


}
