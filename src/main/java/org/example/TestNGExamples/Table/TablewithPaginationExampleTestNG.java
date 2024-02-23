package org.example.TestNGExamples.Table;

import org.example.Table.TablewithPaginationExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TablewithPaginationExampleTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Table.TablewithPaginationExample TablewithPaginationExample = new TablewithPaginationExample(driver);

    @Test
    public void TablewithPaginationExampleStart() {
        driver.get("https://demo.seleniumeasy.com/");
        TablewithPaginationExample.TablewithPaginationExample("TablewithPaginationExample Validation Completed");
    }
}
