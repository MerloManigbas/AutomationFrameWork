package org.example.InputForms;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static org.example.StaticDatas.*;
public class SingleCheckBoxDemo extends UsedObjects {
WebDriver driver;
    public SingleCheckBoxDemo(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void SingleCheckBoxDemoStart() {
    	InputFormLink.click();
    	CheckBoxLink.click();
    	CheckBox1.click();
    }
    public void SingleCheckBoxDemoProcess() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        AbstractObject.waitForElementToAppear(VerificationMessage);
        boolean Display = VerificationMessageAssert.isDisplayed();
        Assert.assertTrue(Display);
        System.out.println(SuccessMessage);
        AbstractObject.waitForElement();
    }

    public void SingleCheckBoxDemoClose(String Validation) {
        System.out.println(Validation);
    }
}
