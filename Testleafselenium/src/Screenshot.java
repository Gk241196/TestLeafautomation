import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		//take screenshot and store in the system
		TakesScreenshot Screenshot=(TakesScreenshot)driver;
		File sourcefile=Screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("D:\\sample.png");
		FileHandler.copy(sourcefile, destinationfile);
		//taking full screenshot entire screen using robot class
		Robot robot=new Robot();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screensize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File Destinationfile=new File("D:\\sample2.png");
		ImageIO.write(source, "png" ,Destinationfile);
}
}