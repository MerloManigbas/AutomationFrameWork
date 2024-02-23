package org.example.Table;

import org.example.AbstractObject;
import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StaticDatas.*;
public class Tabledatasearchactivatetextbox  extends UsedObjects {
    WebDriver driver;
    public Tabledatasearchactivatetextbox(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void Tabledatasearchactivatetextbox(String Validation) throws InterruptedException {
        AbstractObject AbstractObject = new AbstractObject(driver);
        TableLink.click();
        TableDataSearchlink.click();
        int g = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr")).size();
        int f = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th")).size();
        System.out.println();
        System.out.println(DisplayAllData);
        AbstractObject.waitForElement();
        for (int u = 1; u <= g; u++) {
            for (int x = 2; x <= f; x++) {
                System.out.print(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[" + u + "]/td[" + x + "]")).getText() + "   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(DisplaySearchedData);
        AbstractObject.waitForElement();
        ActivateTextBox.click();
        AbstractObject.waitForButtonTobeActive(WaitForTextBox);
        System.out.println("Textbox is now active");
        EnterUserName.sendKeys(UserName);
        AbstractObject.waitForElement();
        for (int u = 1; u <= g; u++) {
            for (int x = 2; x <= f; x++) {
                System.out.print(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[" + u + "]/td[" + x + "]")).getText() + "   ");
            }
            System.out.println();
        }
        System.out.println(Validation);
    }
}
