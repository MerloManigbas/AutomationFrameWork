package org.example.TestNGExamples.Table;

import org.example.Table.TableDataDownload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableDataDownloadTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Table.TableDataDownload TableDataDownload = new TableDataDownload(driver);

    @Test
    public void TableDataDownloadStart() {
        driver.get("https://demo.seleniumeasy.com/");
        TableDataDownload.TableDataDownload("TableDataDownload Validation Completed");
    }
}
