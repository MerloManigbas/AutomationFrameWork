package org.example.TestNGExamples.Table;

import org.example.Table.Tabledatasearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabledatasearchTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Table.Tabledatasearch Tabledatasearch = new Tabledatasearch(driver);
    @Test
    public void TabledatasearchStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        Tabledatasearch.Tabledatasearch("Tabledatasearch Validation Completed");
    }
}
