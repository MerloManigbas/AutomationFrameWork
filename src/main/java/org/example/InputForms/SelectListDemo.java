package org.example.InputForms;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static org.example.StaticDatas.*;

public class SelectListDemo extends UsedObjects {
    WebDriver driver;
    public SelectListDemo(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void SelectListDemoStart() {
        InputFormLink.click();
        SelectListLink.click();
    }
    public void SelectListDemoDemo() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        Select selectoption = new Select(ListDemo);
        List<WebElement> options = selectoption.getOptions();
        System.out.println(OptionCount + options.size());
        selectoption.selectByValue(Dayselect);
        AbstractObject.waitForElement();
        String Dayselected = DaysClicked.getText();
        boolean result2 = Dayselected.contains(Dayselect);
        Assert.assertTrue(result2);
        System.out.println(result2);
        System.out.println(Dayselected);
        AbstractObject.waitForElement();
    }
    public void SelectListDemoClose(String Validate) {
        System.out.println(Validate);
    }
}
