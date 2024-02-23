package org.example.AlertsandModals;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class BootstrapAlerts extends UsedObjects {
    WebDriver driver;
    public BootstrapAlerts(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void BootstrapAlerts(String Validation){
        AbstractObject AbstractObject = new AbstractObject(driver);
        AlertsandModalsLink.click();
        BootstrapAlerts.click();
        AlertBtn1.click();
        boolean Display = AssertHiddenEle.isDisplayed();
        Assert.assertTrue(Display);
        AbstractObject.waitForElementToDisappear(ElementTobehidden);
        AlertBtn2.click();
        AlertBtn3.click();
        System.out.println(Validation);
    }
}
