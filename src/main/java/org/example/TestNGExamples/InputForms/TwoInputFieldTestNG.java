package org.example.TestNGExamples.InputForms;
import org.example.InputForms.TwoInputField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TwoInputFieldTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.TwoInputField TwoInputField = new TwoInputField(driver);

    @BeforeTest
    public void TwoInputFieldTest() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        TwoInputField.TwoInputFieldStart();
    }
    @Test
    public void TwoInputFieldDemo() throws InterruptedException {
        TwoInputField.TwoInputFieldDemo();
    }
    @AfterTest
    public void TwoInputFieldClose(){
        TwoInputField.TwoInputFieldClose("TwoInputField Validation Completed");
        driver.close();
    }
}
