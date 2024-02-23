package org.example.DatePickers;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.example.StaticDatas.*;

public class JQueryDatePickerSample extends UsedObjects {
    WebDriver driver;
    public JQueryDatePickerSample(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void JQueryDatePickerDemo(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        DatePickersLink.click();
        JqueryDatePickerLink.click();
        FromDateRange.click();
        AbstractObject.waitForElement();
        Select calendaryearoption = new Select(CalendarYearList);
        calendaryearoption.selectByVisibleText(EndfirstCharacters);
        AbstractObject.waitForElement();
        String YearClick = YearSelectedList.getText();
        while (!(YearClick.equals(ExpectedYearString))) {
            NextBtn.click();
            YearClick = YearSelectedList.getText();
        }
        DateClick1.click();
        ToDateRange.click();
        Select calendaryearoption2 = new Select(CalendarYearList2);
        calendaryearoption2.selectByVisibleText(EndfirstCharacters);
        String YearClick2 = YearSelectedList.getText();
        while (!(YearClick2.equals(ExpectedEndYear))) {
            NextBtn.click();
            YearClick2 = YearSelectedList.getText();
        }
        AbstractObject.waitForElement();
        DateClick2.click();
        AbstractObject.waitForElement();
        System.out.println(Validation);
    }
}
