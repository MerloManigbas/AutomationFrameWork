package org.example.TestNGExamples.InputForms;

import org.example.InputForms.MultipleCheckBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleCheckBoxTestNG{
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.MultipleCheckBox MultipleCheckBox = new MultipleCheckBox(driver);

    @BeforeTest
    public void MultipleCheckBoxStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        MultipleCheckBox.MultipleCheckboxDemoStart();
    }
    @Test
    public void MultipleCheckBoxProc() throws InterruptedException {
        MultipleCheckBox.MultipleCheckboxDemoDemo();
    }
    @AfterTest
    public void MultipleCheckBoxClose() {
        MultipleCheckBox.MultipleCheckboxDemoClose("MultipleCheckBox Validation Completed");
    }
}
