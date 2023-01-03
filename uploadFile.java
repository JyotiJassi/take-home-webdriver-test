package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class uploadFile extends Main {
    @Test(priority = 14)
    public void downloadFile()
    {
        launchBrowser();
        driver.get("http://localhost:7080/download");
        WebElement upload=driver.findElement(By.xpath("//html/head/body/div"));
        upload.sendKeys("C:\\Users\\User\\Documents\\sample.txt");
    }
}
