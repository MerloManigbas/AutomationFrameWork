package org.example.TestNGExamples.Table;

import org.example.Table.TableSortAndSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableSortAndSearchTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Table.TableSortAndSearch TableSortAndSearch = new TableSortAndSearch(driver);

    @Test
    public void TableSortAndSearchTestNGStart() {
        driver.get("https://demo.seleniumeasy.com/");
        TableSortAndSearch.TableSortAndSearch("TableSortAndSearch Validation Completed");

    }
}
