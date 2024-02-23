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
import static org.example.UsedObjects.InputFormLink;
import static org.example.UsedObjects.SingleInputFieldLink;

public class TwoInputField extends UsedObjects {
    WebDriver driver;
    public TwoInputField(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void TwoInputFieldStart() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        InputFormLink.click();
        SingleInputFieldLink.click();
        aValueele.sendKeys(String.valueOf(aValue));
        AbstractObject.waitForElement();
        bValueele.sendKeys(String.valueOf(bValue));
        AbstractObject.waitForElement();
        GetTotalEle.click();
    }
    public void TwoInputFieldDemo() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        String ValidationValue = TotalValueEle.getText();
        String SecondActualMessage = ValidationValue + " " + totalvalue;
        Assert.assertEquals(TotalOutput, SecondActualMessage);
        AbstractObject.waitForElement();
        System.out.println(SecondActualMessage);
    }
    public void TwoInputFieldClose(String Validation) {
        System.out.println(Validation);
    }
}
