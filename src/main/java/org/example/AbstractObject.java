package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.StaticDatas.Percenttotal;

public class AbstractObject {
    WebDriver driver;
    public AbstractObject(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void waitForElementToAppear(By findBy)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }
    public static void waitForEleement() throws InterruptedException {
        Thread.sleep(500);
    }
    public static void waitForElement() throws InterruptedException {
        Thread.sleep(3000);
    }
    public void waitForElementToBePresent(WebElement findby) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.textToBePresentInElement(findby, Percenttotal));
        }
    public void waitForElementToDisappear(By findby) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
    }
    public void waitForButtonTobeActive(By findby) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(findby));
    }
    public void alertIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
