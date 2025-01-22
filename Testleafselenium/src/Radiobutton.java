import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.manage().window().maximize();
		driver.find
		
		
//		//driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
//		//driver.findElement(By.xpath("//*[@id=\"menuform:m_radio\"]/a")).click();
//		
//		WebElement unchecked=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[2]"));
//		unchecked.click();
//		boolean obj=unchecked.isSelected();
//        System.out.println("check box status is "+obj);
//        
//		WebElement checked=driver.findElement(By.id("j_idt87:console2"));
//		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/label"));
//	    WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/label"));
//	    WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label"));
//	    WebElement radio4=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/label"));
//	    if (radio1.isSelected()) {
//            System.out.println("Radio button 1 is selected by default.");
//        } else if (radio2.isSelected()) {
//            System.out.println("Radio button 2 is selected by default.");
//        } else if (radio3.isSelected()) {
//            System.out.println("Radio button 3 is selected by default.");
//        } else {
//            System.out.println("No radio button is selected by default.");
//        }
	}
}

		
