package org.example.TestNGExamples.InputForms;

import org.example.InputForms.SingleInputField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingleInputFieldTestNg {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.SingleInputField SingleInputField = new SingleInputField(driver);

    @BeforeTest
    public void SingleInputFieldTest() throws InterruptedException {
    driver.get("https://demo.seleniumeasy.com/");
    SingleInputField.SingleInputFieldStart();
    }
    @Test
    public void SingleInputFieldDemo() throws InterruptedException {
        SingleInputField.SingleInputFieldDemo();
    }
    @AfterTest
    public void SingleInputFieldClose(){SingleInputField.SingleInputFieldClose("SingleInputField Validation Completed");
    driver.close();
    }
}
