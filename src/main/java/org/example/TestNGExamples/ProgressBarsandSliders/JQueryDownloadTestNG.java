package org.example.TestNGExamples.ProgressBarsandSliders;

import org.example.ProgressBarsandSliders.JQueryDownload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JQueryDownloadTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.ProgressBarsandSliders.JQueryDownload JQueryDownload = new JQueryDownload(driver);

    @Test
    public void JQueryDownloadTestNG() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        JQueryDownload.JQUERYDOWNLOAD("JQueryDownload Validation Completed");
    }
}
