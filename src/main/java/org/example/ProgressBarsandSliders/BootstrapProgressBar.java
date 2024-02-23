package org.example.ProgressBarsandSliders;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.StaticDatas.Percenttotal;

public class BootstrapProgressBar extends UsedObjects {
    WebDriver driver;
    public BootstrapProgressBar(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void BootstrapProgressBar(String Validation) {
        AbstractObject AbstractObject = new AbstractObject(driver);
        ProgressbarsAndSliders.click();
        BootstrapProgressBarLink.click();
        DownloadButtonPrgrsBar.click();
        AbstractObject.waitForElementToBePresent(ProgressBarElement);
        boolean Display = ProgressBarElement.isDisplayed();
        Assert.assertTrue(Display);
        System.out.println("File Download Complete!");
        System.out.println(Validation);
    }
}
