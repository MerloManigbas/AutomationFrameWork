package org.example.AlertsandModals;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.StaticDatas.*;

public class JavaScriptsAlertsDemo extends UsedObjects {
    WebDriver driver;

    public JavaScriptsAlertsDemo(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void JavaScriptsAlertsDemo(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        AbstractObject.waitForElement();
        AlertsandModalsLink.click();
        JavascriptAlerts.click();
        Clickme1st.click();
        Alert alert = driver.switchTo().alert();
        AbstractObject.alertIsPresent();
        String textonalert = alert.getText();
        System.out.println(textonalert);
        AbstractObject.waitForElement();
        alert.accept();

        AbstractObject.waitForElement();
        Clickme2nd.click();
        AbstractObject.alertIsPresent();
        driver.switchTo().alert();
        AbstractObject.waitForElement();
        alert.accept();
        String Validationalert = GetTextAlert1.getText();
        AbstractObject.waitForElementToAppear(ValidationAlert);
        System.out.println(Validationalert);
        AbstractObject.waitForElement();

        LastAlertText.click();
        AbstractObject.alertIsPresent();
        driver.switchTo().alert();
        alert.sendKeys(Fnameexcel + " " + Lnameexcel);
        AbstractObject.waitForElement();
        alert.accept();
        AbstractObject.waitForElementToAppear(FinalJavaAlert);
        String Validationalert2 = LastAlertTextPopup.getText();
        if (Validationalert2.contains(My2ndName)) {
            System.out.println(Validationalert2);
        }
        System.out.println(Validation);
    }
}
