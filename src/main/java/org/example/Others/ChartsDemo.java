package org.example.Others;

import org.example.UsedObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChartsDemo extends UsedObjects {
    WebDriver driver;
    public ChartsDemo(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ChartsDemo(String Validation) {
        OthersExampleLink.click();
        ChartsDemoLink.click();
        String MarketCap = MarketCapEle.getText();
        String VideoP = VideoPele.getText();
        String PhotoP = Photopele.getText();
        String AudioP = AudioPele.getText();
        System.out.println(MarketCap);
        System.out.println("Video Percent: "+ VideoP+"\n"+"Photo Percent: "+PhotoP+"\n"+"Audio Percent: "+AudioP);
        System.out.println(Validation);
    }
}
