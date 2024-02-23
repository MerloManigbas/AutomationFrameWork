package org.example.TestNGExamples.InputForms;

import org.example.InputForms.RadioButtonsDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonsDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.RadioButtonsDemo RadioButtonsDemo = new RadioButtonsDemo(driver);
    @BeforeTest
    public void RadioButtonsDemoStart() {
        driver.get("https://demo.seleniumeasy.com/");
        RadioButtonsDemo.RadioButtonDemoStart();
    }
    @Test
    public void RadioButtonsDemoProc() {
        RadioButtonsDemo.RadioButtonDemoDemo();
    }
    @AfterTest
    public void RadioButtonsDemoClose() {
        RadioButtonsDemo.RadioButtonDemoClose("RadioButtonsDemo Validation Completed");
    }
}
