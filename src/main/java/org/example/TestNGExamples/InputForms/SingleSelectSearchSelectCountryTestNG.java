package org.example.TestNGExamples.InputForms;

import org.example.InputForms.SingleSelectSearchSelectCountry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingleSelectSearchSelectCountryTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.SingleSelectSearchSelectCountry SingleSelectSearchSelectCountry = new SingleSelectSearchSelectCountry(driver);

    @BeforeTest
    public void MultipleCheckBoxStart() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        SingleSelectSearchSelectCountry.SingleSelectSearchSelectCountryStart();
    }
    @Test
    public void MultipleCheckBoxProc() throws InterruptedException {
        SingleSelectSearchSelectCountry.SingleSelectSearchSelectCountryDemoDemo();
    }
    @AfterTest
    public void MultipleCheckBoxClose() throws InterruptedException {
        SingleSelectSearchSelectCountry.SingleSelectSearchSelectCountryClose("SingleSelectSearchSelectCountry Validation Completed");
    }
}
