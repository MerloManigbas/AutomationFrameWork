package org.example.TestNGExamples.InputForms;

import org.example.InputForms.InputFormWithValidations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InputFormWithValidationsTestNG{
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.InputFormWithValidations InputFormWithValidations = new InputFormWithValidations(driver);

    @BeforeTest
    public void InputFormWithValidationsStart(){
        driver.get("https://demo.seleniumeasy.com/");
        InputFormWithValidations.InputformwithvalidationsStart();
    }
    @Test
    public void InputFormWithValidationsProc() throws InterruptedException {
        InputFormWithValidations.Inputformwithvalidations();
    }
    @AfterTest
    public void InputFormWithValidationsClose(){
        InputFormWithValidations.InputformwithvalidationsClose("InputFormWithValidations Validation Completed");
    }
}
