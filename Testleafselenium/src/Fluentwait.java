import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;

public class Fluentwait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
        driver.get("https://www.leafground.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='menuform:j_idt40']/a/i[1]")).click();
        driver.findElement(By.xpath("//*[@id='menuform:m_wait']/a")).click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))     
                .pollingEvery(Duration.ofSeconds(5))     
                .ignoring(Exception.class);               
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span")); 
            }
        });
        element.click();
    }
}
