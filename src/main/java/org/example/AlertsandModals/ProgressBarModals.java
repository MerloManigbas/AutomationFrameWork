package org.example.AlertsandModals;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProgressBarModals extends UsedObjects {
    WebDriver driver;
    public ProgressBarModals(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void ProgressBarModals(String Validation) throws InterruptedException {
        AbstractObject AbstractObject =new AbstractObject(driver);
        AlertsandModalsLink.click();
        BootstrapLink.click();
        ClickToStartProgress.click();
        AbstractObject.waitForEleement();
            for (int i = 1; i <= 3; i++) {
                AbstractObject.waitForElementToDisappear(ModalToBeVisible);
                driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/button["+i+"]")).click();
                AbstractObject.waitForElementToAppear(ModalToBeVisible);
                AbstractObject.waitForEleement();
                String Notif = NotifsModal.getText();
                System.out.println(Notif + " Number " + i + " Notification");
                AbstractObject.waitForElementToDisappear(ModalToBeVisible);
                AbstractObject.waitForElement();
            }
        System.out.println(Validation);
        }
    }


