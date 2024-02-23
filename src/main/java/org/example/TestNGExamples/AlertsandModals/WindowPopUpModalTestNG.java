package org.example.TestNGExamples.AlertsandModals;

import org.example.AlertsandModals.WindowPopUpModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowPopUpModalTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.AlertsandModals.WindowPopUpModal WindowPopUpModal = new WindowPopUpModal(driver);

    @Test
    public void WindowPopUpModalStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        WindowPopUpModal.WindowPopUpModalNew("WindowPopUpModal Validation Completed");
    }
}
