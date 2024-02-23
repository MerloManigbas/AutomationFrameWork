package org.example.TestNGExamples.ListBox;

import org.example.ListBox.DataListFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  DataListFilterTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.ListBox.DataListFilter DataListFilter = new DataListFilter(driver);

    @Test
    public void DataListFilterStart() {
        driver.get("https://demo.seleniumeasy.com/");
        DataListFilter.DataListFilter("DataListFilter Validation Completed");
    }
}
