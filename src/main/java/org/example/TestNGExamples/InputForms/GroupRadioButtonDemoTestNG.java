package org.example.TestNGExamples.InputForms;

import org.example.InputForms.GroupRadioButtonDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupRadioButtonDemoTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.GroupRadioButtonDemo GroupRadioButtonDemo = new GroupRadioButtonDemo(driver);
    @BeforeTest
    public void GroupRadioButtonDemoStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        GroupRadioButtonDemo.GroupRadioButtonDemoStart();
    }
    @Test
    public void GroupRadioButtonDemoProc() {
        GroupRadioButtonDemo.GroupRadioButtonDemoDemo();
    }
    @AfterTest
    public void GroupRadioButtonDemoEnd() {
        GroupRadioButtonDemo.GroupRadioButtonDemoClose("GroupRadioButtonDemo Validation Completed");

    }
}
