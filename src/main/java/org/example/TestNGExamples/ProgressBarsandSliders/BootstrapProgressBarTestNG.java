package org.example.TestNGExamples.ProgressBarsandSliders;

import org.example.ProgressBarsandSliders.BootstrapProgressBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapProgressBarTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.ProgressBarsandSliders.BootstrapProgressBar BootstrapProgressBar = new BootstrapProgressBar(driver);

    @Test
    public void BootstrapProgressBar() {
        driver.get("https://demo.seleniumeasy.com/");
        BootstrapProgressBar.BootstrapProgressBar("BootstrapProgressBar Validation Completed");
    }
}
