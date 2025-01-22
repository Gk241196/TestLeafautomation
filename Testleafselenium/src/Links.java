import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class Links {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_link\"]")).click();
		//find destination link and navigate
		WebElement destination=driver.findElement(By.linkText("Find the URL without clicking me."));
		String findlink=destination.getAttribute("href");
      System.out.println("Link destination is " +findlink);
       driver.get(findlink); 
       driver.navigate().back();
      //broken link
       WebElement Broken=driver.findElement(By.linkText("Broken?"));
       Broken.click();
       String title=driver.getTitle();
       if(title.contains("404"))
       {
    	   System.out.println("Link is broken");
       }
       driver.navigate().back();
       //total links
       driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[2]/div/div/a")).click();
      List <WebElement> Links=driver.findElements(By.tagName("a"));
      int Total=Links.size();
      System.out.println("Total links are "+Total);
	}

}
