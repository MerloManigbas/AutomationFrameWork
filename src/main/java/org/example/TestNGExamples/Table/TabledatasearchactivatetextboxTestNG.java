package org.example.TestNGExamples.Table;

import org.example.Table.Tabledatasearchactivatetextbox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabledatasearchactivatetextboxTestNG {
    WebDriver driver = new ChromeDriver();
    org.example.Table.Tabledatasearchactivatetextbox Tabledatasearchactivatetextbox = new Tabledatasearchactivatetextbox(driver);

    @Test
    public void TabledatasearchactivatetextboxTestNGProc() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/");
        Tabledatasearchactivatetextbox.Tabledatasearchactivatetextbox("Tabledatasearchactivatetextbox Validation Completed");
    }
}
