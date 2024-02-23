package org.example.TestNGExamples.Table;

import org.example.Table.TableFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableFilterTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Table.TableFilter TableFilter = new TableFilter(driver);

    @Test
    public void TableFilterTestNGStart(){
        driver.get("https://demo.seleniumeasy.com/");
        TableFilter.TableFilter("TableFilter Validation Completed");
    }
}
