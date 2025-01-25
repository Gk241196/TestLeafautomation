package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.Homepage.HomePage;
import pages.Selenium_Alertspage;

public class Selenium_Alerts extends Baseclass {

    @Test(priority = 0)
    public void testSimpleAlert() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToAlertSection();

        Selenium_Alertspage alertPage = new Selenium_Alertspage(driver);
        String alertText = alertPage.handleSimpleAlert();
        System.out.println("Simple Alert Text: " + alertText);
        Assert.assertEquals(alertText, "Expected Alert Text");
    }

    @Test(priority = 1)
    public void testConfirmAlert() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToAlertSection();

        Selenium_Alertspage alertPage = new  Selenium_Alertspage(driver);
        alertPage.handleConfirmAlert(false); // Dismiss the alert
    }

    @Test(priority = 2)
    public void testPromptAlert() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToAlertSection();

        Selenium_Alertspage alertPage = new  Selenium_Alertspage(driver);
        Selenium_Alertspage.handlePromptAlert("Test Input");
    }
}
