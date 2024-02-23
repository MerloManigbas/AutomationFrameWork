package org.example.TestNGExamples.InputForms;

import org.example.InputForms.SelectListDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectListDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.SelectListDemo SelectListDemo = new SelectListDemo(driver);

    @BeforeTest
    public void SelectListDemoStart(){
        driver.get("https://demo.seleniumeasy.com/");
        SelectListDemo.SelectListDemoStart();
    }
    @Test
    public void SelectListDemoProc() throws InterruptedException {
        SelectListDemo.SelectListDemoDemo();
    }
    @AfterTest
    public void SelectListDemoClose(){
        SelectListDemo.SelectListDemoClose("SelectListDemo Validation Completed");
    }
}
