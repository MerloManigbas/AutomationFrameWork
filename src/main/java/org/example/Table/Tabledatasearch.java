package org.example.Table;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StaticDatas.*;

public class Tabledatasearch extends UsedObjects {
    WebDriver driver;
    public Tabledatasearch(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void Tabledatasearch(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        TableLink.click();
        TableDataSearchlink.click();
        int m = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
        int n = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th")).size();
        System.out.println();
        System.out.println(DisplayAllData);
        for (int b = 1; b <= m; b++) {
            for (int h = 2; h <= n; h++) {
                System.out.print(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + b + "]/td[" + h + "]")).getText() + "   ");
            }
            System.out.println();
        }

        SearchinsideTable.sendKeys(searchintable);
        AbstractObject.waitForElement();
        System.out.println();
        System.out.println(DisplaySearchedData);
        for (int b = 1; b <= m; b++) {
            for (int h = 2; h <= n; h++) {
                System.out.print(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + b + "]/td[" + h + "]")).getText() + "   ");
            }
            System.out.println();
        }
        System.out.println(Validation);
    }
}
