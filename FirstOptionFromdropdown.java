package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstOptionFromdropdown extends Main{
    @Test (priority = 5)
    public void FirstOption()
    {
        launchBrowser();
        driver.get("http://localhost:7080/dropdown");
        WebElement staticDropdown = driver.findElement(By.id("dropdown"));
        Select se = new Select(staticDropdown);
        se.selectByVisibleText("Option 1");
        Assert.assertEquals(se.getFirstSelectedOption().getText(), "Option 1");
    }

    }

