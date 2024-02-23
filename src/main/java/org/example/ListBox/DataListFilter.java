package org.example.ListBox;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.example.StaticDatas.DatalistName;

public class DataListFilter extends UsedObjects {
    WebDriver driver;
    public DataListFilter(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void DataListFilter(String Validation) {
        AbstractObject AbstractObject = new AbstractObject(driver);
        LIstBoxLink.click();
        DataListFilter.click();
        SearchForData.sendKeys(DatalistName);
        AbstractObject.waitForElementToAppear(DataShown);
        String EmployeesTitle = GetFilteredTitle.getText();
        String EmployeesName = GetFilteredEmployeeName.getText();
        Assert.assertTrue(EmployeesName.contains(DatalistName));
        System.out.println(EmployeesTitle + "\n" + EmployeesName + "\n " + Validation);
    }


}
