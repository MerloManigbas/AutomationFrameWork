package org.example.TestNGExamples.DatePickers;

import org.example.DatePickers.BootstrapDatePickerSample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDatePickerSampleTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.DatePickers.BootstrapDatePickerSample BootstrapDatePickerSample = new BootstrapDatePickerSample(driver);
    @Test
    public void BootstrapDatePickerSampleProc() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        BootstrapDatePickerSample.BootstrapDatePickersExample("BootstrapDatePickerSample Validation");
    }
}
