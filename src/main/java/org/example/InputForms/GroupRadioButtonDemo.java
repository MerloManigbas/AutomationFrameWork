package org.example.InputForms;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GroupRadioButtonDemo extends UsedObjects {
    WebDriver driver;
    public GroupRadioButtonDemo(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void GroupRadioButtonDemoStart() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        InputFormLink.click();
        RadioButtonLink.click();
        GroupRadioGender.click();
        GroupRadioAge.click();
        GetValues.click();
        AbstractObject.waitForElement();
    }
    public void GroupRadioButtonDemoDemo() {
        AbstractObject AbstractObject = new AbstractObject(driver);
        String AllRadioButtonMsg = RadioMsg.getText();
        String Radio1 = GroupRadioGender.getText();
        String Radio2 = GroupRadioAge.getText();
        boolean result = AllRadioButtonMsg.contains(Radio1) && AllRadioButtonMsg.contains(Radio2);
        Assert.assertTrue(result);
        AbstractObject.waitForElementToAppear(GroupRadioMessage);
        System.out.println(result);
    }
    public void GroupRadioButtonDemoClose(String Verification) {
        System.out.println(Verification);
    }

}
