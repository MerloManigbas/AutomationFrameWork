package org.example.ProgressBarsandSliders;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StaticDatas.*;

public class DragandDropSliders extends UsedObjects {
    WebDriver driver;
    public DragandDropSliders(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void DragandDropBar(String Validation){
        Actions action = new Actions(driver);
        ProgressbarsAndSliders.click();
        DragandDroplink.click();

        WebElement RangeSlider1 = SliderBar1;
        action.dragAndDropBy(RangeSlider1,startload,endload).perform();
        WebElement RangeSlider2 = SliderBar2;
        action.dragAndDropBy(RangeSlider2,startload,endload).perform();
        System.out.println(Validation);
    }
}

