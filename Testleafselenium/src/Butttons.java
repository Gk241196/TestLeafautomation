import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Butttons {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriver.exe");
			driver.get("https://www.leafground.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a")).click();
			//finding disabled button
			WebElement Disabledelement=driver.findElement(By.id("j_idt88:j_idt92"));
			boolean disabled=Disabledelement.isEnabled();
			System.out.println("Disabled button is "+disabled);
			//finding button position
			WebElement findbutton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[1]"));
		    Point location=findbutton.getLocation();
		    int x=location.getX();
		    int y=location.getY();
		    System.out.println("X value is: "+ x + "Y value is " +y);
		    //find button size
		    WebElement Buttonsize=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		   int height= Buttonsize.getSize().getHeight();
		   int width=Buttonsize.getSize().getWidth();
		   System.out.println("Height is :"+height+ "and width is:" +width);
		   //find button color
		   WebElement Buttoncolor=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[1]"));
		   String color=Buttoncolor.getCssValue("background-color");
		   System.out.println("Colour of the button is "+color);		
	}

}
