package org.example;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AlertFunctions extends Main{
    @Test
    private void JsAlertButtonClick() {
        launchBrowser();
        driver.get("http://localhost:7080/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        driver.switchTo().alert().accept();
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, "You successfuly clicked an alert");
    }
    @Test
    private void JsConfirmButtonClick() {
        driver.get("http://localhost:7080/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        driver.switchTo().alert().dismiss();
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, "You clicked: Cancel");
    }
    @Test (priority = 2)
    private void JsAlertSendText() {
        driver.get("http://localhost:7080/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        WebElement actualPromptMessage = driver.findElement(By.cssSelector("#result"));
        driver.switchTo().alert().sendKeys("World");
        //Accept the alert (Click Ok button)
        driver.switchTo().alert().accept();
        //Assertion
        Assert.assertEquals(actualPromptMessage, "You entered: World");
    }

    }



