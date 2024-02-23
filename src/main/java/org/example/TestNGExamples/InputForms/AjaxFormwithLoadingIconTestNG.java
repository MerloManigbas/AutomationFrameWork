package org.example.TestNGExamples.InputForms;

import org.example.InputForms.AjaxFormwithLoadingIcon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxFormwithLoadingIconTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.InputForms.AjaxFormwithLoadingIcon AjaxFormwithLoadingIcon = new AjaxFormwithLoadingIcon(driver);

    @BeforeTest
    public void AjaxFormwithLoadingIconStart(){
        driver.get("https://demo.seleniumeasy.com/");
        AjaxFormwithLoadingIcon.AjaxFormSubmitwithLoadingStart();
    }
    @Test
    public void AjaxFormwithLoadingIconProc() throws InterruptedException {
        AjaxFormwithLoadingIcon.AjaxFormSubmitwithLoadingicon();
    }
    @AfterTest
    public void AjaxFormwithLoadingIconClose(){
        AjaxFormwithLoadingIcon.AjaxFormSubmitwithLoadingiconClose("AjaxFormwithLoadingIcon Validation Completed");
    }
}
