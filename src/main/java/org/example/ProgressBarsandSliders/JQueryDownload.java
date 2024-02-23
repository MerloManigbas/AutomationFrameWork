package org.example.ProgressBarsandSliders;

import org.apache.commons.math3.analysis.function.Abs;
import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StaticDatas.*;
public class JQueryDownload extends UsedObjects {
    WebDriver driver;
    public JQueryDownload(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void JQUERYDOWNLOAD(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        ProgressbarsAndSliders.click();
        ProgressBarsandSlidersLink.click();
        DownloadButton.click();
        AbstractObject.waitForElement();
        String Percent = PercentageLoad.getText();
        while (!(Percent.contains(Comp)))
        {
            Percent = PercentageLoad.getText();
            System.out.println(Percent);
        }
        AbstractObject.waitForElement();
        AbstractObject.waitForElementToAppear(Closebtn);
        driver.findElement(Closebtn).click();
        AbstractObject.waitForElement();
        System.out.println(Validation);
    }
}
