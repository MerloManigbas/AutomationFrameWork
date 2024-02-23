package org.example.TestNGExamples.DatePickers;

import org.example.DatePickers.BootstrapDateRange;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDateaRangeTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.DatePickers.BootstrapDateRange BootstrapDateRange = new BootstrapDateRange(driver);

    @Test
    public void BootstrapDateRangeSampleStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        BootstrapDateRange.BootstrapDateRange("BootstrapDateRange Validation Completed");
    }
}
