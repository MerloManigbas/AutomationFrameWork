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

import java.util.Iterator;
import java.util.Set;

import static org.example.StaticDatas.*;

public class WindowPopUpModal  extends UsedObjects {
    WebDriver driver;

    public WindowPopUpModal(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void WindowPopUpModalNew(String Validation) throws InterruptedException {
        AbstractObject AbstractObject =new AbstractObject(driver);
        AlertsandModalsLink.click();
        BootstrapWindowPopupLink.click();
        String parentHandle = driver.getWindowHandle();
        FlwonTwittterbtn.click();
        AbstractObject.waitForElement();

        Set<String> Handles = driver.getWindowHandles();
        for (String handle : Handles) {
            System.out.println(WindowHandleString + handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                AbstractObject.waitForElementToAppear(TwitterElement);
                String Twitter = TwitterText.getText();
                System.out.println(Twitter);
                TwitterElementTxtBox.sendKeys(FirstSampleMessage);
                boolean display1 = TwitterElementTxtBox.isDisplayed();
                Assert.assertTrue(display1);
                AbstractObject.waitForElement();
                System.out.println("Single Window Popup Completed");
                driver.close();
            }
        }
        driver.switchTo().window(parentHandle);
        FollowAllBtn.click();
        Set<String> Handles2 = driver.getWindowHandles();
        System.out.println(WindowHandleString2 + Handles2);
        for (String handle2 : Handles2) {
            driver.switchTo().window(handle2);
            String Text = driver.switchTo().window(handle2).getTitle();
            driver.switchTo().window(handle2);
            if (Text.contains(FBTitleString)) {
                AbstractObject.waitForElementToAppear(FbElementwait);
                String Facebook = StringFacebook.getText();
                FBInput.sendKeys(FirstSampleMessage);
                AbstractObject.waitForElement();
                boolean display2 = FBInput.isDisplayed();
                Assert.assertTrue(display2);
                System.out.println(FBValidation);
                System.out.println(Facebook);
                driver.close();
            }
            if (Text.contains(XTitleString)) {
                AbstractObject.waitForElementToAppear(TwitterElement);
                String Twitter = TwitterText.getText();
                TwitterElementTxtBox.sendKeys(FirstSampleMessage);
                AbstractObject.waitForElement();
                System.out.println(XValidation);
                System.out.println(Twitter);
                boolean display3 = TwitterElementTxtBox.isDisplayed();
                Assert.assertTrue(display3);
                AbstractObject.waitForElement();
                driver.close();
            }
            if (Text.equals(ParentTitleString)) {
                System.out.println(ParentValidation);
                AbstractObject.waitForElement();
            }
        }
        driver.switchTo().window(parentHandle);
        System.out.println("Multiple Window Popup Completed");
        System.out.println(Validation);
        }
    }


