package org.example.TestNGExamples.ProgressBarsandSliders;

import org.example.ProgressBarsandSliders.DragandDropSliders;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DragandDropSlidersTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.ProgressBarsandSliders.DragandDropSliders DragandDropSliders = new DragandDropSliders(driver);

    @Test
    public void DragandDropSlidersStart() {
        driver.get("https://demo.seleniumeasy.com/");
        DragandDropSliders.DragandDropBar("DragandDropSliders Validation Completed");
    }
}
