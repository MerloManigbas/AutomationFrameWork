package org.example.TestNGExamples.AlertsandModals;

import org.example.AlertsandModals.ProgressBarModals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgressBarModalsTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.AlertsandModals.ProgressBarModals ProgressBarModals = new ProgressBarModals(driver);

    @Test
    public void ProgressBarModalsStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        ProgressBarModals.ProgressBarModals("ProgressBarModals Validation Completed");
    }
}
