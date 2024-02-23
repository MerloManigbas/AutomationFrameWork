package org.example.TestNGExamples.AlertsandModals;

import org.example.AlertsandModals.BootsrapModals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootsrapModalsTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.AlertsandModals.BootsrapModals BootsrapModals = new BootsrapModals(driver);
    @Test
    public void BootsrapModalsStart() {
        driver.get("https://demo.seleniumeasy.com/");
        BootsrapModals.AllModalsExample("BootsrapModals Validation Completed");
    }
}
