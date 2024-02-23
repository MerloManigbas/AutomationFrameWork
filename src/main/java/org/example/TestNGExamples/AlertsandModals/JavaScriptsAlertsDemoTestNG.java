package org.example.TestNGExamples.AlertsandModals;

import org.example.AlertsandModals.JavaScriptsAlertsDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptsAlertsDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.AlertsandModals.JavaScriptsAlertsDemo JavaScriptsAlertsDemo = new JavaScriptsAlertsDemo(driver);

    @Test
    public void JavaScriptsAlertsStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        JavaScriptsAlertsDemo.JavaScriptsAlertsDemo("JavaScriptsAlertsDemo Validation Completed");
    }
}
