package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Tests.Selenium_Alerts;

public class Selenium_Alertspage {
    private WebDriver driver;

    // Constructor
    public  Selenium_Alertspage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By simpleAlert = By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]");
    private By confirmAlert = By.id("j_idt88:j_idt93");
    private By promptAlert = By.id("j_idt88:j_idt104");

    // Methods
    public String handleSimpleAlert() {
        driver.findElement(simpleAlert).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }

    public void handleConfirmAlert(boolean accept) {
        driver.findElement(confirmAlert).click();
        Alert alert = driver.switchTo().alert();
        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }

    public void handlePromptAlert(String input) {
        driver.findElement(promptAlert).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(input);
        alert.accept();
    }
}
