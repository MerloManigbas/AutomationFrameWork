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
public class RadioButtonsDemo extends UsedObjects {
    WebDriver driver;
    public RadioButtonsDemo(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void RadioButtonDemoStart() {
        InputFormLink.click();
        RadioButtonLink.click();
    }
    public void RadioButtonDemoDemo() {
        AbstractObject AbstractObject = new AbstractObject(driver);
        RadioButtonClick.click();
        CheckValue.click();
        String RadioButtonCheck = ShowRadioMessage.getText();
        AbstractObject.waitForElementToAppear(RadioMessage);
        Assert.assertEquals(RadioVerification, RadioButtonCheck);
        System.out.println(RadioButtonCheck);
    }
    public void RadioButtonDemoClose(String Verification) {
        System.out.println(Verification);
    }
}
