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
import static org.example.StaticDatas.Success;

public class AjaxFormwithLoadingIcon extends UsedObjects {
    WebDriver driver;
    public AjaxFormwithLoadingIcon(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void AjaxFormSubmitwithLoadingStart(){
        InputFormLink.click();
        AjaxFormLink.click();
    }
    public void AjaxFormSubmitwithLoadingicon() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        NameTextbox.sendKeys(Fnameexcel + " " + Lnameexcel);
        TextDescription.sendKeys(emailexcel + "\n" + Phoneexcel + "\n" + Addressexcel);
        SubmitClick.click();
        AbstractObject.waitForElement();
        String FormResult = SubmitMessage.getText();
        boolean result4 = FormResult.contains(Success);
        Assert.assertTrue(result4);
        System.out.println(result4);
        AbstractObject.waitForElement();
    }
    public void AjaxFormSubmitwithLoadingiconClose(String Validation){
        System.out.println(Validation);
    }
}
