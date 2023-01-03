package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class FloatingMenu extends Main{

    @Test (priority = 6)
    public void FloatingMenu()
    {
        launchBrowser();
        driver.get("http://localhost:7080/floating_menu");
         WebElement home;
         home=driver.findElement(By.xpath("//a[text()='Home']"));
        Actions a =new Actions(driver);
         a.moveToElement(home);
        a.click();
    }
    @Test (priority = 7)
    private void FloatMenuPageScroll() {
        driver.get("http://localhost:7080/floating_menu");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }
    private void FloatMenuVisibility() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Assert.assertTrue(driver.findElement(By.id("menu")).isDisplayed());
    }




}
