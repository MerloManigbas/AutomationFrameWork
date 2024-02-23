package org.example.TestNGExamples.InputForms;

import org.example.InputForms.MultiSelectListDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiSelectListDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.MultiSelectListDemo MultiSelectListDemo = new MultiSelectListDemo(driver);

    @BeforeTest
    public void MultiSelectListDemoStart(){
        driver.get("https://demo.seleniumeasy.com/");
        MultiSelectListDemo.MultiSelectListDemoStart();
    }
    @Test
    public void MultiSelectListDemoProc() throws InterruptedException {
        MultiSelectListDemo.MultiSelectListDemoDemo();
    }
    @AfterTest
    public void MultiSelectListDemoClose(){
        MultiSelectListDemo.MultiSelectListDemoClose("MultiSelectListDemo Validation Completed");
    }
}
