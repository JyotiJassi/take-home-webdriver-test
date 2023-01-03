package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondOptionFromDrop extends Main{
    @Test (priority = 13)
    public void SecondOption()
    {
        launchBrowser();

        driver.get("http://localhost:7080/dropdown");
        WebElement staticDropdown = driver.findElement(By.id("dropdown"));
        Select dr = new Select(staticDropdown);
        dr.selectByVisibleText("Option 2");
        Assert.assertEquals(dr.getFirstSelectedOption().getText(), "Option 2");
    }

    }

