package org.example.AlertsandModals;

import org.apache.commons.math3.analysis.function.Abs;
import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.StaticDatas.*;

public class FileDownloadDemo extends UsedObjects {
    WebDriver driver;
    public FileDownloadDemo(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void FileDownloadDemo(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        AbstractObject.waitForElement();
        AlertsandModalsLink.click();
        FileDownloadLink.click();
        DataToDownload.sendKeys(Fnameexcel + " " + Lnameexcel + "\n" + Addressexcel);
        AbstractObject.waitForButtonTobeActive(GenerateFileBTn);
        GenerateFileBTnActive.click();
        DownloadGenerateBtn.click();

        System.out.println(Validation);
    }
}
