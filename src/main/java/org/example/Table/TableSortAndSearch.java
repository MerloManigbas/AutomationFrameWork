package org.example.Table;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StaticDatas.*;
public class TableSortAndSearch extends UsedObjects {
    WebDriver driver;
    public TableSortAndSearch(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void TableSortAndSearch(String Validation){
        TableLink.click();
        TableSortandSearch.click();

        int qq = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
        int ww = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th")).size();

        try {
            for (int l = 1; l <= 4; l++) {
                WebElement active_page1 = ActivePageNow1;
                System.out.println(activePage + active_page1.getText());
                driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]/span[1]/a[" + l + "]")).click();
                System.out.println(NextBtnPage.getText());
                for (int uu = 1; uu <= qq; uu++) {
                    for (int xx = 1; xx <= ww; xx++) {
                        System.out.print(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[" + uu + "]/td[" + xx + "]")).getText() + "   ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
        }
        WebElement active_page1 = ActivePageNow1;
        System.out.println(activePage+ active_page1.getText());
        System.out.println(Validation);
    }
}
