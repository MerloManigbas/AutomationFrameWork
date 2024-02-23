package org.example.TestNGExamples.AlertsandModals;

import org.example.AlertsandModals.BootstrapAlerts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapAlertsTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.AlertsandModals.BootstrapAlerts BootstrapAlerts = new BootstrapAlerts(driver);

    @Test
    public void BootstrapAlertsStart() {
        driver.get("https://demo.seleniumeasy.com/");
        BootstrapAlerts.BootstrapAlerts("BootstrapAlerts Validation Completed");
    }
}
