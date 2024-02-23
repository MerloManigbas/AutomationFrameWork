package org.example.TestNGExamples.DatePickers;

import org.example.DatePickers.JQueryDatePickerSample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JQueryDatePickerSampleTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.DatePickers.JQueryDatePickerSample JQueryDatePickerSample = new JQueryDatePickerSample(driver);

    @Test
    public void JqueryDatePickerSampleStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        JQueryDatePickerSample.JQueryDatePickerDemo("JQueryDatePickerSample Validation Completed");
    }

}
