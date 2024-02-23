package org.example.InputForms;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.example.StaticDatas.*;

public class InputFormWithValidations extends UsedObjects {
    WebDriver driver;
    public InputFormWithValidations(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void InputformwithvalidationsStart() {
        InputFormLink.click();
        InputFormValidationLink.click();
    }

    public void Inputformwithvalidations() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        FnameInput.sendKeys(Fnameexcel);
        LnameInput.sendKeys(Lnameexcel);
        EmailInput.sendKeys(emailexcel);
        PhoneInput.sendKeys(Phoneexcel);
        AddressInput.sendKeys(Addressexcel);
        CityInput.sendKeys(Cityexcel);
        AbstractObject.waitForElement();
        Select selectoption3 = new Select(StateInput);
        selectoption3.selectByVisibleText(Stateexcel);
        ZipInput.sendKeys(Zipexcel);
        WebInput.sendKeys(Webexcel);
        RadioHosting.click();
        ProjDescInput.sendKeys(Pdescexcel);
        SendClick.click();
        AbstractObject.waitForElement();

    }
    public void InputformwithvalidationsClose(String Validation) {
        System.out.println(Validation);

    }
}
