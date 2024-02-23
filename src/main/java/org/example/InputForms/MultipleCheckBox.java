package org.example.InputForms;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.example.StaticDatas.CheckAll;
import static org.example.StaticDatas.UncheckAll;
public class MultipleCheckBox extends UsedObjects {
    WebDriver driver;
    public MultipleCheckBox(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void MultipleCheckboxDemoStart() throws InterruptedException {
        InputFormLink.click();
        CheckBoxLink.click();
        CheckBoxClick.click();
        AbstractObject AbstractObject = new AbstractObject(driver);
        AbstractObject.waitForElement();
        String Uncheckbutton = CheckBoxClick.getAttribute("value");
        Assert.assertEquals(UncheckAll, Uncheckbutton);
        boolean Display = CheckBoxClick.isDisplayed();
        Assert.assertTrue(Display);
        System.out.println("Uncheck Button");
    }
    public void MultipleCheckboxDemoDemo() throws InterruptedException {
        UnCheckClickAll.click();
        AbstractObject.waitForElement();
        String CheckMessage = CheckBoxClick2.getAttribute("value");
        Assert.assertEquals(CheckAll, CheckMessage);
        boolean Display = CheckBoxClick2.isDisplayed();
        Assert.assertTrue(Display);
        System.out.println("Check Button");
        System.out.println("MultipleCheckboxDemo Validation Completed");
    }
    public void MultipleCheckboxDemoClose(String Validation) {System.out.println(Validation);}
}
