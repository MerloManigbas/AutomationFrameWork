package org.example.ListBox;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BootstrapListBox extends UsedObjects {
    WebDriver driver;
    public BootstrapListBox(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void BootstrapListBox(String Validation) {
        LIstBoxLink.click();
        BootstrapListBoxLink.click();

        for (int p = 1; p <= 5; p++) {
            driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[" + p + "]")).click();
        }
        MoveToRight.click();
        for (int o = 1; o <= 5; o++) {
            driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[" + o + "]")).click();
        }
        MoveToLeft.click();
        System.out.println(Validation);
    }

}
