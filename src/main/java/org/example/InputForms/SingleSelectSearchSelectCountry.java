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

public class SingleSelectSearchSelectCountry extends UsedObjects {
    WebDriver driver;
    public SingleSelectSearchSelectCountry(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void SingleSelectSearchSelectCountryStart() throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        InputFormLink.click();
        JquerySingleSelectLink.click();
        CountryDropDown.click();
        CountryDropDownSearch.sendKeys(DropdownCountry);
        AbstractObject.waitForElement();
        ClickSearchItem.click();

    }
    public void SingleSelectSearchSelectCountryDemoDemo() throws InterruptedException {
    AbstractObject AbstractObject = new AbstractObject(driver);
        for (int ii = 1; ii<=3; ii++ ) {
            driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/span[1]/span[1]/span[1]/ul[1]/li["+ii+"]/input[1]")).sendKeys(DropdownState[ii]);
            EnterStates.click();
            AbstractObject.waitForElement();
        }
    }
    public void SingleSelectSearchSelectCountryClose(String Validation) throws InterruptedException {
        CountryTerritories.click();
        TeritoriesPick.sendKeys(DropdownTerritories);
        AbstractObject.waitForElement();
        EnterTerritories.click();
        Select selectoption6 = new Select(FilesPick);
        selectoption6.selectByVisibleText(ProgLang);
        AbstractObject.waitForElement();
        System.out.println(Validation);
    }
}
