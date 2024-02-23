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

public class MultiSelectListDemo extends UsedObjects {
    WebDriver driver;
    public MultiSelectListDemo(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void MultiSelectListDemoStart() {
        InputFormLink.click();
        SelectListLink.click();
    }
    public void MultiSelectListDemoDemo() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        Select selectoption2 = new Select(Select2option);
        List<WebElement> options2 = selectoption2.getOptions();
        System.out.println(OptionCount + options2.size());
        for (WebElement e : options2) {
            System.out.println(Valuesare + e.getText());
        }
        selectoption2.selectByValue(Stateselect);
        AbstractObject.waitForElement();
        PrintSelect.click();
        String Stateselected = StateSelect.getText();
        boolean result3 = Stateselected.contains(Stateselect);
        Assert.assertTrue(result3);
        System.out.println(Stateselected);
        AbstractObject.waitForElement();
    }
    public void MultiSelectListDemoClose(String Validation) {
        System.out.println(Validation);
    }
}
