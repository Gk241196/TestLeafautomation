import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Downloadfile {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt43\"]/a/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_file\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]")).click();
		File filelocation=new File("C:\\Users\\gk527\\Downloads");
		File[] download=filelocation.listFiles();
		for (File file : download) {
			
			if(file.getName().equals("TestLeaf Logo.png"))
			{
			System.out.println("Filedownloaded");
			break;
			}
		}
	}

}
