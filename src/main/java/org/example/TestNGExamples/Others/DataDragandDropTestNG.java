package org.example.TestNGExamples.Others;

import org.example.Others.DataDragandDrop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDragandDropTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Others.DataDragandDrop DataDragandDrop = new DataDragandDrop(driver);

    @Test
    public void DataListFilterStart() {
        driver.get("https://demo.seleniumeasy.com/");
        DataDragandDrop.DataDragandDrop("DataDragandDrop Validation Completed");
    }
}
