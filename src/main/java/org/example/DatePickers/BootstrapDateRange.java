package org.example.DatePickers;

import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StaticDatas.*;
import static org.example.StaticDatas.ExpectedEndDay;

public class BootstrapDateRange extends UsedObjects {
    WebDriver driver;
    public BootstrapDateRange(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void BootstrapDateRange(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        DatePickersLink.click();
        BoostrapDatePickersLink.click();
        ClickStartDate.click();
        AbstractObject.waitForElement();
        String CurrentDate2 = GetCurrentStartDate.getText();

        if (TotalDate != CurrentDate2)
        {
            CurrentStartDateNow.click();
            String SelectedYear2 = StartDateNow.getText();

            while (!(ExpectedYearString.equals(SelectedYear2)))
            {
                BackBtn1.click();
                SelectedYear2 = StartDateNow22.getText();
            }
        }
        driver.findElement(By.xpath("//div[@class='datepicker-months']//tbody//span[text()='" + firstCharacters + "']")).click();
        AbstractObject.waitForElement();
        driver.findElement(By.xpath("//div[@class='datepicker-days']//tbody//tr//td[text()='" + ExpectedDay + "']")).click();
        AbstractObject.waitForElement();
        ClickEndDate.click();
        AbstractObject.waitForElement();
        String CurrentEndDate2 = GetCurrentEndDateNow.getText();
        if (TotalEndDate2 != CurrentEndDate2)
        {
            LatestEndDatenow.click();
            String SelectedYear3 = GetLatestEndDatenow.getText();
            while (!(SelectedYear3.equals(ExpectedEndYear)))
            {
                BackBtn22.click();
                SelectedYear3 = FinalLatestEnddateNow.getText();
            }
        }
        driver.findElement(By.xpath("//div[@class='datepicker-months']//tbody//span[text()='" + EndfirstCharacters + "']")).click();
        AbstractObject.waitForElement();
        driver.findElement(By.xpath("//div[@class='datepicker-days']//tbody//tr//td[text()='" + ExpectedEndDay + "']")).click();
        AbstractObject.waitForElement();
        System.out.println(Validation);
    }
}
