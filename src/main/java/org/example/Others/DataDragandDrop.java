package org.example.Others;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataDragandDrop extends UsedObjects {
    WebDriver driver;
    public DataDragandDrop(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void DataDragandDrop(String Validation) {
        Actions action = new Actions(driver);
        OthersExampleLink.click();
        DataDragoandDropLink.click();
        try {
            for (int qq = 1; qq <= 4; qq++) {
                action.dragAndDrop(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[" + qq + "]")),DropPlaceData).build().perform();
            }
        }catch (Exception e){}

        System.out.println(Validation);

    }
}
