package org.example.Others;

import org.apache.commons.math3.analysis.function.Abs;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicDataLoading extends UsedObjects {
    WebDriver driver;
    public DynamicDataLoading(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void DynamicDataLoading(String Validation) {
        OthersExampleLink.click();
        DynamicDataLoading.click();
        GetNewUserBtn.click();
        String NewUserFname = GetNewUserName.getText();
        if(NewUserFname.contains("First Name :") && NewUserFname.contains("Last Name :")) {
            System.out.println(NewUserFname);
            System.out.println(Validation);
        }
    }
}
