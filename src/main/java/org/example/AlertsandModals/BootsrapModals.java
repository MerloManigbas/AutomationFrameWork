package org.example.AlertsandModals;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class BootsrapModals extends UsedObjects {
    WebDriver driver;
    public BootsrapModals(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void AllModalsExample(String Validation) {
        AbstractObject AbstractObject = new AbstractObject(driver);
        AlertsandModalsLink.click();
        BootstrapModalsLink.click();
        LaunchModalBtn.click();
        AbstractObject.waitForElementToAppear(WaitforModalToAppear);
        boolean Display1 = ModalToAppear.isDisplayed();
        String samplemodal = SingleModalMessage.getText();
        System.out.println(samplemodal);
        Assert.assertTrue(Display1);
        SaveChangesModalBtn.click();
        AbstractObject.waitForElementToDisappear(WaitforModalToDisAppear);

        LaunchMultipleModals.click();
        AbstractObject.waitForElementToAppear(WaitforMultipleModalToAppear);
        boolean Display2 = MultipleModalToAppear.isDisplayed();
        String samplemodal2 = MultipleModalMessage.getText();
        Assert.assertTrue(Display2);
        System.out.println(samplemodal2);

        LaunchNextModal.click();
        AbstractObject.waitForElementToAppear(Waitfor2ndModal);
        boolean Display3 = ModalTowait2.isDisplayed();
        String samplemodal3 = MultipleModalMessage.getText();
        System.out.println(samplemodal3);
        Assert.assertTrue(Display3);
        SaveChanges2ndModal.click();
        System.out.println(Validation);
    }
}
