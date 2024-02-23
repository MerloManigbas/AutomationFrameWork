package org.example.TestNGExamples.ListBox;

import org.example.ListBox.BootstrapListBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapListBoxTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.ListBox.BootstrapListBox BootstrapListBox = new BootstrapListBox(driver);

    @Test
    public void BootstrapListBoxStart() {
        driver.get("https://demo.seleniumeasy.com/");
        BootstrapListBox.BootstrapListBox("BootstrapListBox Validation Completed");
    }
}
