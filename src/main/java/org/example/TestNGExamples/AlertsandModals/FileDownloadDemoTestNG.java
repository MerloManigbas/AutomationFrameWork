package org.example.TestNGExamples.AlertsandModals;

import org.example.AlertsandModals.FileDownloadDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownloadDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.AlertsandModals.FileDownloadDemo FileDownloadDemo = new FileDownloadDemo(driver);

    @Test
    public void ProgressBarModalsStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        FileDownloadDemo.FileDownloadDemo("FileDownloadDemo Validation Completed");
    }
}
