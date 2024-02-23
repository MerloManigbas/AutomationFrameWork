package org.example.TestNGExamples.Others;

import org.example.Others.ChartsDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChartsDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Others.ChartsDemo ChartsDemo = new ChartsDemo(driver);
    @Test
    public void ChartsDemoStart() {
        driver.get("https://demo.seleniumeasy.com/");
        ChartsDemo.ChartsDemo("ChartsDemo Validation Completed");
    }
}

