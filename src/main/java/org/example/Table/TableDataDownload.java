package org.example.Table;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StaticDatas.*;
public class TableDataDownload extends UsedObjects {
    WebDriver driver;
    public TableDataDownload(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void TableDataDownload(String Validation){
        TableLink.click();
        TableDataDownloadLink.click();

        int qqq = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr")).size();
        int www = driver.findElements(By.xpath("//thead/tr/th")).size();

        System.out.println(DisplayAllData);

        for (int uuu = 1; uuu <= qqq; uuu++) {
            for (int xxx = 1; xxx <= www; xxx++) {
                System.out.print(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr["+uuu+"]/td["+xxx+"]")).getText() + "   ");
            }
            System.out.println();
        }
        System.out.println(Validation);
    }
}
