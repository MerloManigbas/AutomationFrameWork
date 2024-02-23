package org.example.TestNGExamples.InputForms;

import org.example.InputForms.SingleCheckBoxDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingleChecKBoxDemoTestNG{
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.SingleCheckBoxDemo SingleCheckBoxDemo = new SingleCheckBoxDemo(driver);

    @BeforeTest
    public void SingleCheckBoxDemoStart(){
        driver.get("https://demo.seleniumeasy.com/");
        SingleCheckBoxDemo.SingleCheckBoxDemoStart();
    }
    @Test
    public void SingleCheckBoxDemoProc() throws InterruptedException {
        SingleCheckBoxDemo.SingleCheckBoxDemoProcess();
    }
    @AfterTest
    public void SingleCheckBoxDemoEnd(){
        SingleCheckBoxDemo.SingleCheckBoxDemoClose("SingleCheckBoxDemo Validation Completed");
    }
}
