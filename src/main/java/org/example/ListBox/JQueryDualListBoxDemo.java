package org.example.ListBox;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import static org.example.StaticDatas.DualListBoxName;
import static org.example.StaticDatas.OptionCount;

public class JQueryDualListBoxDemo extends UsedObjects {
    WebDriver driver;
    public JQueryDualListBoxDemo(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void JQueryDualListBoxDemo(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        LIstBoxLink.click();
        DuallistBoxlink.click();
        Select selectoptionPick = new Select(ListBox1);
        List<WebElement> optionsPick = selectoptionPick.getOptions();
        System.out.println(OptionCount + " " + optionsPick.size());
        selectoptionPick.selectByVisibleText(DualListBoxName);
        AddBtntoLeft.click();
        AbstractObject.waitForElement();
        AddAllBtntoleft.click();
        AbstractObject.waitForElement();
        Select selectoptionPick2 = new Select(ListBox2);
        List<WebElement> optionsPick2 = selectoptionPick2.getOptions();
        System.out.println(OptionCount + " " + optionsPick2.size());
        selectoptionPick2.selectByVisibleText(DualListBoxName);
        Remove1Btn.click();
        AbstractObject.waitForElement();
        RemoveAllBtn.click();
        AbstractObject.waitForElement();
        System.out.println(Validation);
    }
}
