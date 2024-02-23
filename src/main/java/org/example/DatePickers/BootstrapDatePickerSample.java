package org.example.DatePickers;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StaticDatas.*;

public class BootstrapDatePickerSample extends UsedObjects {
    WebDriver driver;
    public BootstrapDatePickerSample(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void BootstrapDatePickersExample(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        DatePickersLink.click();
        BoostrapDatePickersLink.click();
        SelectDateBox.click();
        AbstractObject.waitForElement();
        String CurrentDate = CurrentDateNow.getText();

        if (TotalDate != CurrentDate) {
            backBtn.click();
            String SelectedYear = SelectYear.getText();
            while (!(SelectedYear.equals(ExpectedYearString))) {
                ExpectedYear.click();
                SelectedYear = SelectYear.getText();
            }
        }
        System.out.println(firstCharacters);
        driver.findElement(By.xpath("//div[@class='datepicker-months']//tbody//span[text()='"+firstCharacters+"']")).click();
        AbstractObject.waitForElement();
        driver.findElement(By.xpath("//div[@class='datepicker-days']//tbody//tr//td[text()='"+ExpectedDay+"']")).click();
        AbstractObject.waitForElement();
        System.out.println(Validation);
    }
}
