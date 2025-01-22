import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Iframes {
	public static void main(String[] args){
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.get("https://www.leafground.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menuform:m_frame\"]/a")).click();
		    //switch to frames by index
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"Click\"]")).click();
			String Text=driver.findElement(By.xpath("//*[@id=\"Click\"]")).getText();
			System.out.println("Frame text is "+Text);
			driver.switchTo().defaultContent();
			//switch to nested frame from parent frame and click by id
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
			driver.switchTo().frame("frame2");
			driver.findElement(By.xpath("//*[@id=\"Click\"]")).click();
			driver.switchTo().defaultContent();
			//Count number of frames
			int size=driver.findElements(By.tagName("iframe")).size();
			System.out.println("Total number for frames " +size);
	}

}
