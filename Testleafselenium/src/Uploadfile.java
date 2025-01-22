import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt43\"]/a/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_file\"]/a")).click();
		WebElement Upload=driver.findElement(By.id("j_idt97:j_idt98_label"));
		Upload.click();
		String file="C:\\Users\\gk527\\Downloads\\TestLeaf Logo.png";
	//	Upload.sendKeys(file);
		
	
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot=new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/button[1]")).click();
		
		
	}

}
