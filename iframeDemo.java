package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframeDemo extends Main {
    @Test (priority = 8)
    private void wordDisplayed() {
        launchBrowser();
        driver.get("http://localhost:7080/iframe");
        String ff=driver.findElement(By.id("mce_0_ifr")).getText();
        driver.switchTo().frame(ff);
        Assert.assertEquals(true, ff.contains("\"Hello\""));


    }

}
