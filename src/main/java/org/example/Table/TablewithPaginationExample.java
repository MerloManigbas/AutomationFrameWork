package org.example.Table;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StaticDatas.*;
public class TablewithPaginationExample extends UsedObjects {
    WebDriver driver;
    public TablewithPaginationExample(WebDriver driver){
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void TablewithPaginationExample(String Validation){
        TableLink.click();
        TablePaginationLink.click();

        int q = driver.findElements(By.xpath("//tbody/tr")).size();
        int w = driver.findElements(By.xpath("//thead/tr/th")).size();

        try {
            for (int p = 1; p <= 3; p++) {
                WebElement active_page = ActivePage;
                System.out.println(activePage + active_page.getText());
                for (int o = 1; o <= q; o++) {
                    for (int e = 2; e <= w; e++) {
                        System.out.print(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/table[1]/tbody[1]/tr[" + o + "]/td[" + e + "]")).getText() + "   ");
                    }
                    System.out.println();
                }
                String pageno = Integer.toString(p + 1);
                driver.findElement(By.xpath("//ul[@id='myPager']//li//a[text()='" + pageno + "']")).click();
            }
        } catch (Exception e) {
        }
        System.out.println(Validation);
    }
}
