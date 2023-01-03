package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DownLoadFile extends Main {
    @Test (priority = 3)
    public void downloadFile()
    {
        launchBrowser();
        driver.get("http://localhost:7080/download");
        WebElement ss=driver.findElement(By.xpath("//html/head/body/div"));
        ss.click();
    }
}
