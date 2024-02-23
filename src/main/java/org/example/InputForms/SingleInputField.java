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

public class SingleInputField extends UsedObjects {
    WebDriver driver;
    public SingleInputField(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void SingleInputFieldStart() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        InputFormLink.click();
        SingleInputFieldLink.click();
        UserMessage.sendKeys(FirstSampleMessage);
        AbstractObject.waitForElement();
        ShowMessage.click();
    }
    public void SingleInputFieldDemo() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        String ValidationLabel = ValidationLabelEle.getText();
        String FirstActualMessage = ValidationLabel + " " + FirstSampleMessage;
        Assert.assertEquals(ActualMessage, FirstActualMessage);
        AbstractObject.waitForElement();
        System.out.println(FirstActualMessage);
    }
    public void SingleInputFieldClose(String Validation){
        System.out.println(Validation);
    }
}
