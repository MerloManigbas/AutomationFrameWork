package org.example.TestNGExamples.ListBox;

import org.example.ListBox.JQueryDualListBoxDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JQueryDualListBoxDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.ListBox.JQueryDualListBoxDemo JQueryDualListBoxDemo = new JQueryDualListBoxDemo(driver);

    @Test
    public void JQueryDualListBoxDemoStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        JQueryDualListBoxDemo.JQueryDualListBoxDemo("JQueryDualListBoxDemo Validation Completed");
    }
}
