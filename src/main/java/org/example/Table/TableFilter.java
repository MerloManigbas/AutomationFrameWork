package org.example.Table;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StaticDatas.*;
public class TableFilter extends UsedObjects {
    WebDriver driver;
    public TableFilter(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void TableFilter(String Validation){
        TableLink.click();
        TableFilterLink.click();
        OptionFilterBtn.click();
        CheckBoxFilterMessage.click();
        String TextMessage = TableMessageFilter.getText();
        System.out.println(TextMessage);
        System.out.println(Validation);
    }
}
