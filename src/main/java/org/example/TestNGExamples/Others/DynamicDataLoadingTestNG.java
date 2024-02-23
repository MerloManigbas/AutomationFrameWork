package org.example.TestNGExamples.Others;

import org.example.Others.DynamicDataLoading;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDataLoadingTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Others.DynamicDataLoading DynamicDataLoading = new DynamicDataLoading(driver);

    @Test
    public void DynamicDataLoadingStart() {
        driver.get("https://demo.seleniumeasy.com/");
        DynamicDataLoading.DynamicDataLoading("DynamicDataLoading Validation Completed");
    }
}
