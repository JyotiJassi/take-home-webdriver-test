package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class NewTabOpen extends Main{
    //http://localhost:7080/windows
    @Test (priority = 12)
    public void NewTab(){
        launchBrowser();
        driver.get("http://localhost:7080/windows");
        driver.findElement(By.xpath("a[text()='Click Here']"));
        driver.switchTo().newWindow(WindowType.TAB);
    }
}
