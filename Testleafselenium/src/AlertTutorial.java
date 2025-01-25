import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTutorial {
    WebDriver driver;

    @BeforeTest
    public void browserlaunch() {
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 0) // Handling Alert
    public void HandlingAlert() {
        // Navigate to the alert section
        driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menuform:m_overlay\"]/a")).click();

        // Handle alert
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test(priority = 1) // Confirm or Cancel
    public void confirmorcancel() {
        // Handle confirm/cancel alert
        driver.findElement(By.id("j_idt88:j_idt93")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
    }

    @Test(priority = 2) // Prompt Alert
    public void promptalert() {
        // Handle prompt alert
        driver.findElement(By.id("j_idt88:j_idt104")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Ok");
        alert3.accept();
    }

    @AfterTest
    public void browserclose() {
        driver.quit(); // Close all browser windows and terminate the session
    }
}
